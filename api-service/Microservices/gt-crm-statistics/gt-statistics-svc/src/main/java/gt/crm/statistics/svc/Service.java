/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.crm.statistics.svc;

import gt.crm.statistics.model.Usuario;
import java.util.List;

/**
 *
 * @author wesly
 */
public interface Service {
    
    List<Usuario> findAllUsers();
    
}
