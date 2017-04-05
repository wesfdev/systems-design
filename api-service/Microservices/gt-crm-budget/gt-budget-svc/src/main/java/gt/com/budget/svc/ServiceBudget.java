/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.budget.svc;

import gt.com.budget.model.Usuario;
import java.util.List;

/**
 *
 * @author alex
 */
public interface ServiceBudget {
    List<Usuario> findAllUsers();
    
}
