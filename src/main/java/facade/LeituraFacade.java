/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;


import entidades.Leitura;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jaimedias
 */
@Stateless
public class LeituraFacade extends AbstractFacade<Leitura>{
    
    @PersistenceContext(unitName = "ProjetoIntegradorAmoVilaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
  
    public LeituraFacade(){
        super(Leitura.class);
    }
}

