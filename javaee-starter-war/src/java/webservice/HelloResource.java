/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservice;

import entity.UserEntity;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import sessionbean.HelloSessionBeanLocal;

/**
 * REST Web Service
 *
 * @author victor
 */
@Path("hello")
public class HelloResource {

    @Context
    private UriInfo context;
    
    @EJB
    private HelloSessionBeanLocal hello_sb;

    /**
     * Creates a new instance of ApiResource
     */
    public HelloResource() {
    }

    /**
     * Retrieves representation of an instance of webservice.ApiResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getJson() {
        //TODO return proper representation object
        UserEntity u = hello_sb.getRandomUser();
        return Response.ok(u).build();
    }

    /**
     * PUT method for updating or creating an instance of ApiResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
