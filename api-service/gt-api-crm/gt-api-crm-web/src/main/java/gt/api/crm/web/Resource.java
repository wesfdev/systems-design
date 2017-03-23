/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.api.crm.web;

import gt.api.crm.model.Usuario;
import gt.api.crm.svc.Service;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author wesly
 */
@ManagedBean
@Path("/crm")
@Produces(MediaType.APPLICATION_JSON)
public class Resource {
    
    @Inject
    Service svc;
    
    @GET
    @Path("/mail")
    @Produces(MediaType.TEXT_PLAIN)
    public String getData(){
        /*try {
            new Programacion().iniciarTarea();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }*/
        return "Hola Mundo";
    }
    
    @GET
    @Path("/find-all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Usuario> findAll(){
        return svc.findAll();
    }
    
    
    @POST
    @Path("/save")
    @Consumes(MediaType.APPLICATION_JSON)
    public Boolean save(Usuario usuario){
        return svc.saveUser(usuario);
    }
    
    
    @PUT
    @Path("/update")
    @Consumes(MediaType.APPLICATION_JSON)    
    public Boolean update(Usuario usuario){
        return svc.updateUser(usuario);
    }
    
    
    @DELETE
    @Path("/delete")
    @Consumes(MediaType.APPLICATION_JSON)    
    public Boolean delete(Usuario usuario){
        return svc.deleteUser(usuario);
    }
        
}
