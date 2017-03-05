/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.api.crm.web;

import javax.annotation.ManagedBean;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author wesly
 */

@ManagedBean
@Path("/edson")
public class OtherResource {
    
    @POST
    @Path("/adasd")
    @Produces(MediaType.TEXT_PLAIN)
    public String hola1(){
        return "hola mundo1 post";
    }
    
    
    @DELETE
    @Produces(MediaType.TEXT_PLAIN)
    public String hola3(){
        return "hola mundo1 delete";
    }
    
    @PUT
    @Produces(MediaType.TEXT_PLAIN)
    public String hola2(){
        return "hola mundo1 put";
    }

    @GET
    @Path("/hola")
    @Produces(MediaType.TEXT_PLAIN)
    public String hola5(@QueryParam("user") String user){
        return "hola mundo1 get " + user;
    }    
    
}
