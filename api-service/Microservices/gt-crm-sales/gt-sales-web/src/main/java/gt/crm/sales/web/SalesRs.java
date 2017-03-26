/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.crm.sales.web;

import gt.crm.sales.model.Usuario;
import gt.crm.sales.model.util.RestResponse;
import gt.crm.sales.svc.ServiceSales;
import java.util.ArrayList;
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
 * @author wesly
 */
@ManagedBean
@Path("/sales")
public class SalesRs {

    private static final Logger LOG = Logger.getLogger(SalesRs.class.getName());
    
    @Inject
    private ServiceSales svc;
    
    @GET
    @Path("/all-users")
    @Produces(MediaType.APPLICATION_JSON)
    public RestResponse<List<Usuario>> findAllUsers(){
        try {
            return new RestResponse<List<Usuario>>(RestResponse.OK, RestResponse.SUCCESS, svc.findAllUsers());            
        } catch (Exception e) {
            LOG.log(Level.SEVERE, "Error al obtener los usuarios. " , e);
            return new RestResponse<List<Usuario>>(RestResponse.UNKNOW_EXCEPTION, RestResponse.ERROR, null);
        }
    }
    
}
