//package org.jpos.rest;
//
//
//import javax.ws.rs.*;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
//import java.util.HashMap;
//import java.util.Map;
//
//@Path("/update/{id}/{amount}")
//public class UpdateTransaction {
//
//    @PUT
//    @Consumes(MediaType.APPLICATION_JSON)
//    public Response updateResponse(@PathParam("id") int id,@PathParam("amount") int amount) {
//
//        JposTransactionDao jposTransactionDao = new JposTransactionDao();
//        jposTransactionDao.updateTransaction(id, amount);
//
//        //return Response.status(Response.Status.OK).build();
//
//        Map<String, Object> resp = new HashMap<>();
//        resp.put("Update", "success");
//        Response.ResponseBuilder rb = Response.ok(resp, MediaType.APPLICATION_JSON
//        ).status(Response.Status.OK);
//        return rb.build();
//
//    }
//}
