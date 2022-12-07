package org.jpos.rest;

import org.jpos.entity.ResponseTransaction;

import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

public class InquiryResponseTransaction {


//    public static void main(String[] args) {
//        InquiryResponseTransaction inquiryResponseTransaction = new InquiryResponseTransaction();
//        inquiryResponseTransaction.sendResponseToMobile("jgkjlkm");
//    }

    public void sendResponseToMobile(String inquiryRes) {

        Client client = ClientBuilder.newClient();


//Reza
        WebTarget webTarget = client.target("http://192.168.43.165:5000").path("Shop").path("listener");

        UUID uuidtmp = UUID.fromString("00000000-0000-0000-0000-000000000000");
        Date date1 = new Date();
        long time1 = date1.getTime();
        Timestamp timestamp1 = new Timestamp(time1);


        ResponseTransaction responseTransaction = new ResponseTransaction();
        responseTransaction.setInquiryResponse(inquiryRes);
//        responseTransaction.setCodedId("");
//        responseTransaction.setAccountId(uuidtmp);
//        responseTransaction.setBuyerAccount(uuidtmp);
//        responseTransaction.setDate(timestamp1);
//        responseTransaction.setTransactionId(uuidtmp);
//        responseTransaction.setId(1);


        Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
        Entity<?> entity = Entity.entity(responseTransaction, MediaType.APPLICATION_JSON);
        System.out.println(entity);
        Response response = invocationBuilder.post(entity);
        System.out.println(response.getStatus());
//        System.out.println(response.readEntity(String.class));
    }

}
