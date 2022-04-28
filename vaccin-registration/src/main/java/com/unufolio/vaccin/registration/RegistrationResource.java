package com.unufolio.vaccin.registration;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author yeke yeke@healthych.com
 * @since 2022/04/26
 */
@Path("/registrations")
public class RegistrationResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String get() {
        return "Hello from RESTEasy Reactive";
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public String create() {
        return "Hello from RESTEasy Reactive";
    }

}
