/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;
import entidades.ContasReceber;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 *
 * @author joaom
 */
@Stateless
public class ContasReceberFacade extends AbstractFacade<ContasReceber>{

     @PersistenceContext(unitName = "ProjetoIntegradorAmoVilaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
  
    public ContasReceberFacade(){
        super(ContasReceber.class);
    }
}
    

