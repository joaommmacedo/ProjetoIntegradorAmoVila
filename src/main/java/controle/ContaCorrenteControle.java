/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;


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
   

}