/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import converter.MoneyConverter;
import entidades.Fundo;
import facade.FundoFacade;
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
public class FundoControle implements Serializable{
    
    private Fundo fundo;
    @EJB
    private FundoFacade fundoFacede;
    
    private MoneyConverter moneyConverter;

    public MoneyConverter getMoneyConverter() {
     if(moneyConverter == null){
        moneyConverter = new MoneyConverter();}
        return moneyConverter;
    }

    public void setMoneyConverter(MoneyConverter moneyConverter) {
        this.moneyConverter = moneyConverter;
    }

    public Fundo getFundo() {
        return fundo;
    }

    public void setFundo(Fundo fundo) {
        this.fundo = fundo;
    }

    public void salvar() {
         fundoFacede.salvar(fundo);
          
        }
    
    public void novo(){
        fundo = new Fundo();
    }
    public List<Fundo> listaFundo(){
        return fundoFacede.listaTodos();
    }

    public void excluir(Fundo fun) {
        fundoFacede.remover(fun);
    }
    
    public void editar(Fundo fun){
        this.fundo = fun;
    }
     
}
