/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.api.crm.dao.impl;

import gt.api.crm.model.Usuario;
import java.util.List;

/**
 *
 * @author wesly
 */
public interface Dao {
    
    public List<Usuario> findAll();
    
    public Boolean updateUser(Usuario usuario);
    
    public Boolean saveUser(Usuario usuario);
    
    public Boolean deleteUser(Usuario usuario);
}
