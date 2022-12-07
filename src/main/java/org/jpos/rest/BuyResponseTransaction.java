package org.jpos.rest;

import org.jpos.entity.ResponseTransaction;

import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

public class BuyResponseTransaction {

//    public static void main(String[] args) {
//        BuyResponseTransaction inquiryResponseTransaction = new BuyResponseTransaction();
//        inquiryResponseTransaction.sendResponseToMobile("test", true);
//    }


    public void sendResponseToMobile(String buyResponseValue, boolean buyResponseSuccess,String trackingCode) {

        Client client = ClientBuilder.newClient();
//Hamoon
        WebTarget webTarget = client.target("http://192.168.43.165:5000").path("Shop").path("listener");

        UUID uuidtmp = UUID.fromString("00000000-0000-0000-0000-000000000000");
        Date date1 = new Date();
        long time1 = date1.getTime();
        Timestamp timestamp1 = new Timestamp(time1);


        ResponseTransaction responseTransaction = new ResponseTransaction();
        responseTransaction.setBuyResponseSuccess(buyResponseSuccess);
        responseTransaction.setBuyResponseValue(buyResponseValue);
        responseTransaction.setBuyResponsetrackingCode(trackingCode);

        Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
        Entity<?> entity = Entity.entity(responseTransaction, MediaType.APPLICATION_JSON);
        System.out.println(entity);
        Response response = invocationBuilder.post(entity);
        System.out.println(response.getStatus());
    }
}
