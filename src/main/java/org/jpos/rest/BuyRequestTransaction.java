package org.jpos.rest;


import org.datacontract.schemas._2004._07.localservices.Result;
import org.jdom2.output.LineSeparator;
import org.jpos.entity.RequestTransaction;
import org.tempuri.IBuy;

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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;


@Path("/buy")
public class BuyRequestTransaction {
    List<String> objList = new ArrayList<>();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response buyResponse(RequestTransaction requestTransaction, @Context HttpHeaders headers) throws MalformedURLException {

//        get request body
        String codedId = requestTransaction.getCodedId();
        UUID buyerAccount = requestTransaction.getBuyerAccount();
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
        jposTransactionDao.addRequestTransaction(buyerAccount, codedId, uuidtmp, tokenUUID, timestamp);


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
        URL url = new URL("http://192.168.43.165:8090/Buy?wsdl");
        QName qName = new QName("http://tempuri.org/", "Buy");
        Service service = Service.create(url, qName);
        IBuy buy = service.getPort(IBuy.class);
        Result result = buy.buyItem(buyerAccount.toString(), codedId, tokenUUID.toString());
        String responseValue = result.getDesc().getValue();
        boolean responseSuccess = result.isSuccess();
        String trackingCode = result.getTrackingCode();


//        save Response to database
        Date date1 = new Date();
        long time1 = date1.getTime();
        Timestamp timestamp1 = new Timestamp(time1);
        jposTransactionDao.addResponseTransaction(uuidtmp, codedId, uuidtmp, tokenUUID, timestamp1, "");

//        call response
//        BuyResponseTransaction buyResponseTransaction = new BuyResponseTransaction();
//        buyResponseTransaction.sendResponseToMobile(responseValue, responseSuccess,trackingCode);

//         sent Response
//        return Response.status(Response.Status.OK).build();
        objList.add(responseValue);
        objList.add(trackingCode);
        objList.add(String.valueOf(responseSuccess));
        return Response.ok(objList).build() ;



    }


}
