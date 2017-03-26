/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.crm.sales.svc.Impl;

import gt.crm.sales.dao.DataAccessObject;
import gt.crm.sales.model.Usuario;
import gt.crm.sales.svc.ServiceSales;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;


/**
 *
 * @author wesly
 */
@Stateless
public class SvcSalesImpl implements ServiceSales{

    private static final Logger LOG = Logger.getLogger(SvcSalesImpl.class.getName());

    @Inject
    private DataAccessObject dao;
    
    @Override
    public List<Usuario> findAllUsers() {
        return dao.findAllUsers();     
    }
    
}
