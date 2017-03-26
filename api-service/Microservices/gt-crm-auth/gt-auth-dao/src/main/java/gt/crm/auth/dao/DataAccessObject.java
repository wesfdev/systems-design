/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.crm.auth.dao;

import gt.crm.auth.model.Usuario;
import java.util.List;

/**
 *
 * @author wesly
 */
public interface DataAccessObject {
    
    List<Usuario> findAllUsers();
    
}
