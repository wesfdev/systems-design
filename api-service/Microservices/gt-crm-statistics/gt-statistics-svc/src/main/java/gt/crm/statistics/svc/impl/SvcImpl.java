/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.crm.statistics.svc.impl;

import gt.crm.statistics.dao.DataAccessObject;
import gt.crm.statistics.model.Usuario;
import gt.crm.statistics.svc.Service;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author wesly
 */
@Stateless
public class SvcImpl implements Service{

    private static final Logger LOG = Logger.getLogger(SvcImpl.class.getName());
    
    @Inject
    private DataAccessObject dao;

    @Override
    public List<Usuario> findAllUsers() {
        return dao.findAllUsers();
    }
    
}
