/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;


import converter.MoneyConverter;
import entidades.ContaCorrente;
import facade.ContaCorrenteFacede;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * 
 */
@ManagedBean
@SessionScoped
public class ContaCorrenteControle implements Serializable {

    private ContaCorrente contaCorrente;
    @EJB
    private ContaCorrenteFacede contaCorrenteFacede;
   
       private MoneyConverter moneyConverter;

    public MoneyConverter getMoneyConverter() {
     if(moneyConverter == null){
        moneyConverter = new MoneyConverter();}
        return moneyConverter;
    }

    public void setMoneyConverter(MoneyConverter moneyConverter) {
        this.moneyConverter = moneyConverter;
    }

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(ContaCorrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public ContaCorrenteFacede getContaCorrenteFacede() {
        return contaCorrenteFacede;
    }

    public void setContaCorrenteFacede(ContaCorrenteFacede contaCorrenteFacede) {
        this.contaCorrenteFacede = contaCorrenteFacede;
    }
    
}