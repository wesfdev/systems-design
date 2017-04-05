/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.budget.svc.impl;

import gt.com.budget.dao.DataAccessObject;
import gt.com.budget.model.Usuario;
import gt.com.budget.svc.ServiceBudget;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author alex
 */
public class SvcBudgetImpl implements ServiceBudget{

    @Inject
    private DataAccessObject dao;
    
    @Override
    public List<Usuario> findAllUsers() {
        return dao.finAllUsuario();
    }
    
}
