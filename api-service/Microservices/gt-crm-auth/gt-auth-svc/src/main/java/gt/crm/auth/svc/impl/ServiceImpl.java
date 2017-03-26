/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.crm.auth.svc.impl;

import gt.crm.auth.dao.DataAccessObject;
import gt.crm.auth.model.Usuario;
import gt.crm.auth.svc.Service;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author wesly
 */
@Stateless
public class ServiceImpl implements Service{

    @Inject
    private DataAccessObject dao;
    
    @Override
    public List<Usuario> findAllUsers() {
        return dao.findAllUsers();
    }
    
}
