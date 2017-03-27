/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.strategy.dao.impl;

import gt.com.strategy.dao.DataAccessObject;
import gt.com.strategy.model.Usuario;
import java.math.BigDecimal;
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
    
    @PersistenceContext(name = "gt-strategy-model-PU")
    private EntityManager em;

    @Override
    public List<Usuario> findAll() {
        try {
            Query query = em.createNamedQuery("Usuario.findAll");
            return query.getResultList();
        } catch (Exception e) {
            LOG.log(Level.SEVERE, "Error al buscar todos los usuarios" , e);
            return Collections.emptyList();
        }
    }

    @Override
    public Boolean deleteUsuario(BigDecimal id) {
        try {
            em.remove(em.find(Usuario.class, id));
            return true;
        } catch (Exception e) {
            LOG.log(Level.SEVERE, e.getMessage());
            return false; 
        }
    }

    @Override
    public Boolean updateUsuario(Usuario usuario) {
        try {
            em.merge(usuario);
            em.flush();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Boolean saveUsuario(Usuario usuario) {
        try {
            em.persist(usuario);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    
}
