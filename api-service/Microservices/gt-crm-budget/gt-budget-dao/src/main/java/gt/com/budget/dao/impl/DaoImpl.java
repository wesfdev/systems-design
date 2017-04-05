/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.budget.dao.impl;

import gt.com.budget.dao.DataAccessObject;
import gt.com.budget.model.Usuario;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author alex
 */
public class DaoImpl implements DataAccessObject{
    
    private static final Logger LOG = Logger.getLogger(DaoImpl.class.getName());
    
    @PersistenceContext(unitName = "gt-budget-model-PU")
    private EntityManager em;

    @Override
    public List<Usuario> finAllUsuario() {
        try {
            Query query = em.createNamedQuery("Usuario.findAll");
            return query.getResultList();
        } catch (Exception e) {
            LOG.log(Level.SEVERE, "Error al obtener usuario. ",e);
            return Collections.emptyList();
        }
    }
    
}
