package dev.ifrs.restful.web.service;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 */
@Path("/api/{nos}")
@Singleton
public class Service2 {

    @GET
    public double conversao(@PathParam("nos") double nos) {

        return nos*1.852;
    }
}
