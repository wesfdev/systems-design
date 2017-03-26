/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.gt.strategy.web;

import gt.com.strategy.model.Usuario;
import gt.con.strategy.svc.Serviceinterface;
import java.math.BigDecimal;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author alex
 */
@ManagedBean
@Path("/prueba")
public class Pruebaresource {
     private static final Logger LOG = Logger.getLogger(Pruebaresource.class.getName());
    
    @Inject
    private Serviceinterface svc;
    
      @GET
    @Path("/usuario-all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Usuario> getAll(){
        return svc.findAll();
    }
    
    
    @DELETE
    @Path("/delete-usuario/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String deleteUsuario(@PathParam("id") BigDecimal id){
        
        Boolean delete = svc.deleteUsuario(id);

        return delete?"Resigtro eliminado":"Ocurrio un error al eliminar un registro";
    
    }

    @PUT
    @Path("/update-usuario")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String updateUsuario(Usuario usuario){
        
        try {
        Boolean update = svc.updateUsuario(usuario);
    
        return update?"Resigtro actualizado":"Ocurrio un error al actualizar un registro";            
        } catch (Exception e) {
            LOG.log(Level.SEVERE, e.getMessage());
         return "Fallo al actualizar ";
        }
    }


    @POST
    @Path("/save-usuario")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)    
    public String saveUsuario(Usuario usuario){
        
        Boolean save = svc.saveUsuario(usuario);
    
        return save?"Resigtro guardado":"Ocurrio un error al guardar un registro";    
    
    }   
}
