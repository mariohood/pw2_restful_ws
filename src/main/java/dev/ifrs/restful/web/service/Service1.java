package dev.ifrs.restful.web.service;

import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 */
@Path("/api/")
@Singleton
public class Service1 {

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
       public String convers(@FormParam("velocidade") double velocidade) {
        System.out.println("VELOCIDADE " + velocidade);
        return Double.toString(velocidade*0.621371);
    }
}
