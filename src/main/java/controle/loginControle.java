/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author joaom
 */
@SessionScoped
@ManagedBean 
public class loginControle implements Serializable{
 private String usuario;
 private String senha;        
    public String entrar(){
    if(usuario.equals("admin")&& senha.equals("admin")){
        return "/faces/index?faces-redirect=true";
      }
    else{
         return "/faces/seguranca/login?faces-redirect=true";
         
     }
    }

  

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
  
 
    
  
}
