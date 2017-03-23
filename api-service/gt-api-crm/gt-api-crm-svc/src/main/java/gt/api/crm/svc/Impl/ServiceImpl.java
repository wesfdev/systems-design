/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.api.crm.svc.Impl;

import gt.api.crm.dao.impl.Dao;
import gt.api.crm.model.Usuario;
import gt.api.crm.svc.Service;
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
    Dao dao;
    
    @Override
    public List<Usuario> findAll() {
        return dao.findAll();
    }

    @Override
    public Boolean updateUser(Usuario usuario) {
        return dao.updateUser(usuario);
    }

    @Override
    public Boolean saveUser(Usuario usuario) {
        return dao.saveUser(usuario);
    }

    @Override
    public Boolean deleteUser(Usuario usuario) {
        return dao.deleteUser(usuario);
    }
    
}
