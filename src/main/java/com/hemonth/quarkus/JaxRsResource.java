package com.hemonth.quarkus;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/hey")
public class JaxRsResource {

    @POST
    @Path("/sayHello")
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello(@QueryParam("name") String name){
        return "Hello "+name;
    }
}
