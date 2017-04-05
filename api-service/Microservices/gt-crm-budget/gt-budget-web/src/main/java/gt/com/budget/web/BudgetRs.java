/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.budget.web;

import gt.com.budget.model.Usuario;
import gt.com.budget.model.util.RestResponse;
import gt.com.budget.svc.ServiceBudget;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author alex
 */
@ManagedBean
@Path("/budget")
public class BudgetRs {
    private static final Logger LOG = Logger.getLogger(BudgetRs.class.getName());
    
    @Inject
    private ServiceBudget svc;
    
       @GET
    @Path("/all-users")
    @Produces(MediaType.APPLICATION_JSON)
    public  RestResponse<List<Usuario>> findAllUsers(){
        try {
            return new RestResponse<List<Usuario>>(RestResponse.OK, RestResponse.SUCCES, svc.findAllUsers());            
        } catch (Exception e) {
            LOG.log(Level.SEVERE, "Error al obtener a los usuarios." ,e);
            return new RestResponse<List<Usuario>>(RestResponse.UNKNOW_EXEPTION, RestResponse.ERROR, null);
        }
    }
    
}
