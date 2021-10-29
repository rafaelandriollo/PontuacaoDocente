/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecgarca.pontuacaodocente.beans;

import br.edu.fatecgarca.pontuacaodocente.ejb.DocenteFacade;
import br.edu.fatecgarca.pontuacaodocente.entidades.Docente;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;

/**
 *
 * @author Rafael
 */

@ManagedBean
@SessionScoped
public class Login implements Serializable {
    private boolean logado;
    private boolean admin;
    private String email;
    private String senha;
    
    private Docente docenteLogado;
    
    @EJB
    private DocenteFacade docenteFacade;
    
    public Login() {
        logado = false;
    }
    
    public Docente getDocenteLogado() {
        return docenteLogado;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String e_mail) {
        email = e_mail;
    }
    
    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String umaSenha) {
        senha = umaSenha;
    }
    
    public boolean isLogado() {
        return logado;
    }
    
    public String validar() {
        docenteLogado = docenteFacade.localizarLogin(email, senha);
        RequestContext context = RequestContext.getCurrentInstance();  
        FacesMessage msg;  
        if (docenteLogado != null) {
            logado = true;
            if (docenteLogado.getNome().equals("admin")) {
                admin=true;
            }
            msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bem-Vindo(a)", docenteLogado.getNome() + " Você será redirecionado(a)...");
            FacesContext.getCurrentInstance().addMessage(null, msg);  
            context.addCallbackParam("logado", logado);
            return "pontuacao";
        } else {
            msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Erro de Login", "Credenciais Inválidas");  
            FacesContext.getCurrentInstance().addMessage(null, msg);  
            logado = false;
            context.addCallbackParam("logado", logado);  
            return "erro";
        }
    }
    
    public String logout() {
        logado = false;
        return "logout";
        
    }
    
    public boolean isAdmin() {
        return admin;
    }
    
}

