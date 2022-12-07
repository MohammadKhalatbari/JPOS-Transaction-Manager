//package org.jpos.rest;
//
//
//import javax.servlet.http.HttpServletResponse;
//import javax.ws.rs.*;
//import javax.ws.rs.Path;
//import javax.ws.rs.core.Context;
//import javax.ws.rs.core.HttpHeaders;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.UUID;
//import java.util.Date;
//import java.sql.Timestamp;
//
//@Path("/add/{userId}/{vendorId}/{amount}")
//public class AddTransaction {
//
//    @POST
//    @Consumes(MediaType.APPLICATION_JSON)
//    public Response addResponse( @PathParam("userId") UUID userId, @PathParam("vendorId") UUID vendorId, @PathParam("amount") int amount
//    ,@Context HttpHeaders headers) {
//
//        String token=headers.getRequestHeader("tokenreq").toString();
//        UUID tokenUUID=UUID.fromString(token.replace("[","").replace("]",""));
//        Date date = new Date();
//        long time = date.getTime();
//        Timestamp timestamp = new Timestamp(time);
//
//        JposTransactionDao jposTransactionDao = new JposTransactionDao();
//        jposTransactionDao.addTransaction(userId, amount, vendorId, tokenUUID
//                , timestamp);
//
//        return Response.status(Response.Status.OK).build();
//    }
//}