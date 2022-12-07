package org.jpos.rest;

import org.jpos.entity.RequestTransaction;

import javax.ws.rs.*;
import javax.ws.rs.client.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;


@Path("/inquiry")
public class InquiryRequestTransaction {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response addResponse(RequestTransaction requestTransaction, @Context HttpHeaders headers) {

        //        get request body
        String codedId = requestTransaction.getCodedId();

        String token = headers.getRequestHeader("tokenreq").toString();
        UUID tokenUUID = UUID.fromString(token.replace("[", "").replace("]", ""));
        Date date = new Date();
        long time = date.getTime();
        Timestamp timestamp = new Timestamp(time);
        UUID uuidtmp = UUID.fromString("00000000-0000-0000-0000-000000000000");

        JposTransactionDao jposTransactionDao = new JposTransactionDao();
        jposTransactionDao.addRequestTransaction(uuidtmp, codedId, uuidtmp, tokenUUID, timestamp);


        ///Send to API Manager
        Client client = ClientBuilder.newClient();
        String inquiryRes = client.target("http://192.168.43.165:5000").path("Shop").path("CheckPayment").request(MediaType.APPLICATION_JSON).header("codedID",codedId).header("tokenin", tokenUUID).get(String.class);

        Date date1 = new Date();
        long time1 = date1.getTime();
        Timestamp timestamp1 = new Timestamp(time1);
        jposTransactionDao.addResponseTransaction(uuidtmp, codedId, uuidtmp, tokenUUID, timestamp1, inquiryRes);



//        InquiryResponseTransaction inquiryResponseTransaction = new InquiryResponseTransaction();
//        inquiryResponseTransaction.sendResponseToMobile(inquiryRes);


//        send response
//        return Response.status(Response.Status.OK).build();
        return Response.ok(inquiryRes).build();
    }
}
