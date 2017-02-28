/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.api.crm.web;

import gt.api.crm.svc.Programacion;
import javax.annotation.ManagedBean;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author wesly
 */
@ManagedBean
@Path("/")
public class Resource {

    
    
    @GET
    @Path("/mail")
    @Produces(MediaType.TEXT_PLAIN)
    public String getData(){
        try {
            new Programacion().iniciarTarea();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return "Hola Mundo";
    }
}
