/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import converter.ConverterGenerico;
import entidades.Pessoa;
import entidades.Associado;
import facade.PessoaFacade;
import facade.AssociadoFacade;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * 
 */
@ManagedBean
@SessionScoped
public class PessoaControle implements Serializable {

    private Pessoa pessoa;
    @EJB
    private PessoaFacade pessoaFacade;
    @EJB
    private AssociadoFacade associadoFacade;      
    private ConverterGenerico associadoConverter;

    public ConverterGenerico getAssociadoConverter() {
        if(associadoConverter == null){
            associadoConverter = new ConverterGenerico(associadoFacade);
        }
        return associadoConverter;
    }

    public void setAssociadoConverter(ConverterGenerico associadoConverter) {
        this.associadoConverter = associadoConverter;
    }
    
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    public void novo(){
        pessoa = new Pessoa();
    }

    public void salvar() {
        pessoaFacade.salvar(pessoa);
    }

    public List<Pessoa> listaPessoas() {
        return pessoaFacade.listaTodos();
    }

    public void excluir(Pessoa cid) {
        pessoaFacade.remover(cid);
    }

    public void editar(Pessoa cid) {
        this.pessoa = cid;
    }
    
    public List<Associado> listaAssociados(String parte){
        return associadoFacade.listaFiltrando(parte, "casaQuadra","lote");
    }

}