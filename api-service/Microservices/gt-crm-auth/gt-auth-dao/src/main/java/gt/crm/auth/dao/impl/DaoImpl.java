/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.crm.auth.dao.impl;

import gt.crm.auth.dao.DataAccessObject;
import gt.crm.auth.model.Usuario;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author wesly
 */
public class DaoImpl implements DataAccessObject{

    private static final Logger LOG = Logger.getLogger(DaoImpl.class.getName());

    @PersistenceContext(unitName = "gt-auth-model-PU")
    private EntityManager em;
    
    @Override
    public List<Usuario> findAllUsers() {
        try {
            Query query = em.createNamedQuery("Usuario.findAll");
            
            return query.getResultList();
        } catch (Exception e) {
            LOG.log(Level.SEVERE, "Error al buscar todos los usuarios. " , e);
            return Collections.emptyList();
        }
    }
    
}
