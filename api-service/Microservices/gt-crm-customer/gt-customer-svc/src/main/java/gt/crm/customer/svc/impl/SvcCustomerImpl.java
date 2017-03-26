/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.crm.customer.svc.impl;

import gt.crm.customer.dao.DataAccessObject;
import gt.crm.customer.model.Usuario;
import gt.crm.customer.svc.ServiceCustomer;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author wesly
 */
@Stateless
public class SvcCustomerImpl implements ServiceCustomer{

    @Inject
    private DataAccessObject dao;
    
    @Override
    public List<Usuario> findAllUsers() {
        return dao.findAllUsers();
    }
    
}
