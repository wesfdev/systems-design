/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.con.strategy.svc.impl;

import gt.com.strategy.dao.DataAccessObject;
import gt.com.strategy.model.Usuario;
import gt.con.strategy.svc.Serviceinterface;
import java.math.BigDecimal;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author alex
 */
public class SvcImpl implements Serviceinterface{

   @Inject
   private DataAccessObject dao;

    @Override
    public List<Usuario> findAll() {
        return dao.findAll();
    }
  
//    @Override
//    public Boolean deleteUsuario(BigDecimal id) {
//        return dao.deleteUsuario(id);
//    }
//
//    @Override
//    public Boolean updateUsuario(Usuario usuario) {
//        return dao.updateUsuario(usuario);
//    }
//
//    @Override
//    public Boolean saveUsuario(Usuario usuario) {
//        return dao.saveUsuario(usuario);
//    }
//
//  
   
}
