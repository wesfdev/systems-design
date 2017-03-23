/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.api.crm.dao;

import gt.api.crm.dao.impl.Dao;
import gt.api.crm.model.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author wesly
 */
public class DaoImpl implements Dao{
    
    @PersistenceContext(unitName = "gt-api-crm-PU")
    private EntityManager em;

    @Override
    public List<Usuario> findAll() {
        Query query = em.createNamedQuery("Usuario.findAll");
        return query.getResultList();
    }

    @Override
    public Boolean updateUser(Usuario usuario) {
        try {
            em.merge(usuario);
            em.flush();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    @Override
    public Boolean saveUser(Usuario usuario) {
        try {
            em.persist(usuario);
            return true;
        } catch (Exception e) {
            System.out.println(e);            
            return false;
        }
    }

    @Override
    public Boolean deleteUser(Usuario usuario) {
        try {
            em.remove(em.find(Usuario.class, usuario.getId()));
            return true;
        } catch (Exception e) {
            System.out.println(e);            
            return false;
        }
    }
    
    
    
}
