/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import converter.ConverterGenerico;
import converter.MoneyConverter;
import entidades.ContasReceber;
import entidades.Pessoa;
import facade.ContasReceberFacade;
import facade.PessoaFacade;
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
public class ContasReceberControle implements Serializable{
    
    private ContasReceber contasReceber;
    @EJB
    private ContasReceberFacade contasReceberFacade;
    
    private MoneyConverter moneyConverter;
    
    @EJB
    private PessoaFacade pessoaFacade;
    private ConverterGenerico pessoaConverter;

    public ContasReceberFacade getContasReceberFacade() {
        return contasReceberFacade;
    }

    public void setContasReceberFacade(ContasReceberFacade contasReceberFacade) {
        this.contasReceberFacade = contasReceberFacade;
    }

    public PessoaFacade getPessoaFacade() {
        return pessoaFacade;
    }

    public void setPessoaFacade(PessoaFacade pessoaFacade) {
        this.pessoaFacade = pessoaFacade;
    }

    public ConverterGenerico getPessoaConverter() {
        if(pessoaConverter == null){
        pessoaConverter = new ConverterGenerico(pessoaFacade);
         }
        return pessoaConverter;
    }

    public void setPessoaConverter(ConverterGenerico pessoaConverter) {
        this.pessoaConverter = pessoaConverter;
    }

    
    public MoneyConverter getMoneyConverter() {
     if(moneyConverter == null){
        moneyConverter = new MoneyConverter();}
        return moneyConverter;
    }

    public void setMoneyConverter(MoneyConverter moneyConverter) {
        this.moneyConverter = moneyConverter;
    }

    public ContasReceber getContasReceber() {
        return contasReceber;
    }

    public void setContasReceber(ContasReceber contasReceber) {
        this.contasReceber = contasReceber;
    }

    public void salvar() {
         contasReceberFacade.salvar(contasReceber);
          
        }
    
    public void novo(){
        contasReceber = new ContasReceber();
    }
    public List<ContasReceber> listaContasReceber(){
        return contasReceberFacade.listaTodos();
    }

    public void excluir(ContasReceber crec) {
        contasReceberFacade.remover(crec);
    }
    
    public void editar(ContasReceber crec){
        this.contasReceber = crec;
    }
    public List<Pessoa> listaPessoa(String parte){
        return pessoaFacade.listaFiltrando(parte, "nome");
    }
          
     
}
