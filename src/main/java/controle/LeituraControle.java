/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import converter.ConverterGenerico;
import entidades.Leitura;
import entidades.Associado;
import facade.LeituraFacade;
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
public class LeituraControle implements Serializable {

    private Leitura leitura;
    @EJB
    private LeituraFacade leituraFacade;
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
    
    public Leitura getLeitura() {
        return leitura;
    }

    public void setLeitura(Leitura leitura) {
        this.leitura = leitura;
    }
    
    public void novo(){
        leitura = new Leitura();
    }

    public void salvar() {
        leituraFacade.salvar(leitura);
    }

    public List<Leitura> listaLeituras() {
        return leituraFacade.listaTodos();
    }

    public void excluir(Leitura cid) {
        leituraFacade.remover(cid);
    }

    public void editar(Leitura cid) {
        this.leitura = cid;
    }
    
    public List<Associado> listaAssociados(String parte){
        return associadoFacade.listaFiltrando(parte, "casaQuadra","lote");
    }

}