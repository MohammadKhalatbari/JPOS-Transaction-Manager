package org.jpos.rest;

import org.datacontract.schemas._2004._07.localservices.Result;
import org.jpos.entity.RequestTransaction;
import org.tempuri.IBuy;
import org.tempuri.ICharge;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.Authenticator;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

@Path("/charge")
public class ChargeRequestTransaction {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response buyResponse(RequestTransaction requestTransaction, @Context HttpHeaders headers) throws MalformedURLException {

        //        get request body

        UUID accountId = requestTransaction.getAccountId();
        String userName = requestTransaction.getUserName();
        String password = requestTransaction.getPassword();


//        save Transaction on database
        String token = headers.getRequestHeader("tokenreq").toString();
        UUID tokenUUID = UUID.fromString(token.replace("[", "").replace("]", ""));
        Date date = new Date();
        long time = date.getTime();
        Timestamp timestamp = new Timestamp(time);
        UUID uuidtmp = UUID.fromString("00000000-0000-0000-0000-000000000000");


        JposTransactionDao jposTransactionDao = new JposTransactionDao();
        jposTransactionDao.addRequestTransaction(uuidtmp, "", accountId, tokenUUID, timestamp);


//        SOAP Authentication
        Authenticator myAuth = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userName, password.toCharArray());
            }
        };
        Authenticator.setDefault(myAuth);


//        send data to API
//        Hamoon
        URL url = new URL("http://192.168.43.165:8090/Charge?wsdl");
        QName qName = new QName("http://tempuri.org/", "Charge");
        Service service = Service.create(url, qName);
        ICharge charge = service.getPort(ICharge.class);
        Boolean result = charge.addCharge(accountId.toString());


//        save Response to database
        Date date1 = new Date();
        long time1 = date1.getTime();
        Timestamp timestamp1 = new Timestamp(time1);
        jposTransactionDao.addResponseTransaction(uuidtmp, "", accountId, tokenUUID, timestamp1, "");

//        call response
//        ChargeResponseTransaction chargeResponseTransaction = new ChargeResponseTransaction();
//        chargeResponseTransaction.sendResponseToMobile(result);


//        send response
//        return Response.status(Response.Status.OK).build();
        return Response.ok(result).build();

    }
}
