package org.jpos.rest;
import java.io.IOException;
import java.util.UUID;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

@Provider
public class SecurityInterceptor implements ContainerRequestFilter, ContainerResponseFilter {

    @Override
    public void filter(ContainerRequestContext reqCtx, ContainerResponseContext respCtx) throws IOException {


        respCtx.getHeaders().add("tokenres", UUID.randomUUID().toString());

    }

    @Override
    public void filter(ContainerRequestContext reqCtx) throws IOException {
        System.out.println("Adding start time in request headers");

        reqCtx.getHeaders().add("tokenreq", UUID.randomUUID().toString());

    }

}