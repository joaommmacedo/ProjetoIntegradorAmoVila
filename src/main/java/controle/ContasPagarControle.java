/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import converter.MoneyConverter;
import entidades.ContasPagar;
import facade.ContasPagarFacede;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author joaom
 */
@ManagedBean
@SessionScoped
public class ContasPagarControle implements Serializable{
    
    private ContasPagar contasPagar;
    @EJB
    private ContasPagarFacede contasPagarFacede;
    
    private MoneyConverter moneyConverter;

    public MoneyConverter getMoneyConverter() {
     if(moneyConverter == null){
        moneyConverter = new MoneyConverter();}
        return moneyConverter;
    }

    public void setMoneyConverter(MoneyConverter moneyConverter) {
        this.moneyConverter = moneyConverter;
    }

    public ContasPagar getContasPagar() {
        return contasPagar;
    }

    public void setContasPagar(ContasPagar contasPagar) {
        this.contasPagar = contasPagar;
    }

    public void salvar() {
         contasPagarFacede.salvar(contasPagar);
          
        }
    
    public void novo(){
        contasPagar = new ContasPagar();
    }
    public List<ContasPagar> listaContasPagar(){
        return contasPagarFacede.listaTodos();
    }

    public void excluir(ContasPagar cpag) {
        contasPagarFacede.remover(cpag);
    }
    
    public void editar(ContasPagar cpag){
        this.contasPagar = cpag;
    }
     
}
