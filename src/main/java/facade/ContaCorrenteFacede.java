/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 *
 * @author joaom
 */
@Stateless
public class ContaCorrenteFacede extends AbstractFacade<ContaCorrenteFacede>{

     @PersistenceContext(unitName = "ProjetoIntegradorAmoVilaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
  
    public ContaCorrenteFacede(){
        super(ContaCorrenteFacede.class);
    }
}
    

