/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entidades.Associado;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jaimedias
 */
@Stateless
public class AssociadoFacade extends AbstractFacade<Associado>{
    
    @PersistenceContext(unitName = "ProjetoIntegradorAmoVilaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
  
    public AssociadoFacade(){
        super(Associado.class);
    }
}

