/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import entidades.Associado;
import facade.AssociadoFacade;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


/**
 *
 * @author jaimedias
 */
@ManagedBean
@SessionScoped
public class AssociadoControle implements Serializable{

    private Associado associado;
    @EJB
    private AssociadoFacade associadoFacade;

    public Associado getAssociado() {
        return associado;
    }

    public void setAssociado(Associado associado) {
        this.associado = associado;
    }

    public void salvar() {
            associadoFacade.salvar(associado);
        }
    
    public void novo(){
        associado = new Associado();
    }
    
    public List<Associado> listaAssociados(){
        return associadoFacade.listaTodos();
    }

    public void excluir(Associado asso) {
        associadoFacade.remover(asso);
    }
    
    public void editar(Associado asso){
        this.associado = asso;
    }

}
