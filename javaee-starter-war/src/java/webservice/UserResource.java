/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservice;

import entity.UserEntity;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import sessionbean.UserSessionBeanLocal;

/**
 * REST Web Service
 *
 * @author victor
 */
@Path("user")
public class UserResource {

    @Context
    private UriInfo context;
    
    @EJB
    private UserSessionBeanLocal user_sb;

    public UserResource() {
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllUser() {
//        try{
//            List<UserEntity> result = user_sb.getAllUser();
//            return Response.ok(result).build();
//        } catch (Exception ex){
//            return Response.status(Response.Status.BAD_REQUEST).build();
//        }
//        
        return Response.ok("Not support yet").build();
    }
    
    @GET
    @Path("{username}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUserByUsername(@PathParam("username") String username) {
        try{
            UserEntity result = user_sb.getUserByUsername(username);
            return Response.ok(result).build();
        } catch (Exception ex){
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response putJson(String content) {
        return Response.ok("Not support yet").build();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postJson(String content) {
        return Response.ok("Not support yet").build();
    }
    
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteJson(String content) {
        return Response.ok("Not support yet").build();
    }
}
