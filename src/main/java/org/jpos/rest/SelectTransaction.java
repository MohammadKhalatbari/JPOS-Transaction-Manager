//package org.jposchargeResponseSuccess.rest;
//
//
//import javax.ws.rs.*;
//import javax.ws.rs.Path;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.UUID;
//
//@Path("/select/{transactionID}")
//public class SelectTransaction {
//
//    @GET
//    @Consumes(MediaType.APPLICATION_JSON)
//    public Response addResponse(@PathParam("transactionID") UUID transactionID) {
//        JposTransactionDao jposTransactionDao = new JposTransactionDao();
//        String value = jposTransactionDao.selectTransaction(transactionID);
//
//
//        Map<String, Object> resp = new HashMap<>();
//        resp.put("Update", value);
//        Response.ResponseBuilder rb = Response.ok(resp, MediaType.APPLICATION_JSON
//        ).status(Response.Status.OK);
//        return rb.build();
//    }
//}
