package dev.ifrs.restful.web.service;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 */
@Path("/api2/{nos}")
@Singleton
public class Service2 {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public double conversao(@PathParam("nos") double nos) {

        return nos*1.852;
    }
}
