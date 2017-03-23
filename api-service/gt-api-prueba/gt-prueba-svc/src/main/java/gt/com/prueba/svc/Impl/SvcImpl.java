/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.prueba.svc.Impl;

import gt.com.prueba.dao.DataAccessObject;
import gt.com.prueba.model.Usuario;
import gt.com.prueba.svc.ServiceInterface;
import java.math.BigDecimal;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author wesly
 */
@Stateless
public class SvcImpl implements ServiceInterface{

    @Inject
    private DataAccessObject dao;
    
    @Override
    public List<Usuario> findAll() {
        return dao.findAll();
    }

    @Override
    public Boolean deleteUsuario(BigDecimal id) {
        return dao.deleteUsuario(id);
    }

    @Override
    public Boolean updateUsuario(Usuario usuario) {
        
        return dao.updateUsuario(usuario);
    }

    @Override
    public Boolean saveUsuario(Usuario usuario) {
        return dao.saveUsuario(usuario);
    }
    
}
