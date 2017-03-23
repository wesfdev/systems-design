/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.prueba.svc;

import gt.com.prueba.model.Usuario;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author wesly
 */
public interface ServiceInterface {
  
    public List<Usuario> findAll();
    
    public Boolean deleteUsuario(BigDecimal id);
    
    public Boolean updateUsuario(Usuario usuario);
    
    public Boolean saveUsuario(Usuario usuario);
    
    
}
