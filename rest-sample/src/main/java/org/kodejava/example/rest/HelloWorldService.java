package org.kodejava.example.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorldService {

    @GET
    @Path("/{name}")
    public Response getGreeting(@PathParam("name") String name) {
        String hello = "Jersey say hello to " + name;
        return Response.status(Response.Status.OK).entity(hello).build();
    }
}