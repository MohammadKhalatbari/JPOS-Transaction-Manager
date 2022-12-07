//package org.jpos.rest;
//
//
//import JposTransaction;
//import UserProfile;
//
//import javax.ws.rs.*;
//import javax.ws.rs.Path;
//import javax.ws.rs.core.Context;
//import javax.ws.rs.core.HttpHeaders;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
//import java.sql.Timestamp;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.UUID;
//
//@Path("/users/{userId}")
//public class BodyTest {
//    @POST
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
//    public Response getBody(JposTransaction  jposTransaction, @PathParam("userId") UUID userId, @Context HttpHeaders headers){
////        String firstName = userProfile.getFirstName();
////        String lastName = userProfile.getLastName();
////        return userProfile;
//
//        int amount = jposTransaction.getAmount();
////        UUID vendorId = jposTransaction.getVendorId();
//
//        String token=headers.getRequestHeader("tokenreq").toString();
//        UUID tokenUUID=UUID.fromString(token.replace("[","").replace("]",""));
//        Date date = new Date();
//        long time = date.getTime();
//        Timestamp timestamp = new Timestamp(time);
//
//        JposTransactionDao jposTransactionDao = new JposTransactionDao();
//        jposTransactionDao.addTransaction(userId, amount, UUID.randomUUID(), tokenUUID
//                , timestamp);
//
//
//
//        Map<String, Object> resp = new HashMap<>();
//        resp.put("amount", amount);
////        resp.put("vendorId", vendorId);
//        Response.ResponseBuilder rb = Response.ok(resp, MediaType.APPLICATION_JSON
//        ).status(Response.Status.OK);
//        return rb.build();
//
//
//    }
//
//}