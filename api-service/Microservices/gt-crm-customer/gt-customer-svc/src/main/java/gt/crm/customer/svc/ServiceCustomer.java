/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.crm.customer.svc;

import gt.crm.customer.model.Usuario;
import java.util.List;

/**
 *
 * @author wesly
 */
public interface ServiceCustomer {
    
    List<Usuario> findAllUsers();
}
