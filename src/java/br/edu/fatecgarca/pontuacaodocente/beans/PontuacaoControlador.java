/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecgarca.pontuacaodocente.beans;

import br.edu.fatecgarca.pontuacaodocente.ejb.PontuacaoFacade;
import br.edu.fatecgarca.pontuacaodocente.entidades.Pontuacao;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author Rafael
 */
@ManagedBean
//@SessionScoped
public class PontuacaoControlador implements Serializable {
     @EJB
    private PontuacaoFacade pontuacaoFacade;
    
    private Pontuacao pontuacaoSendoIncluida;
    
    public Pontuacao getPontuacaoSendoIncluida() {
        return pontuacaoSendoIncluida;
    }
    
    public String novaPontuacao() {
        pontuacaoSendoIncluida = new Pontuacao();
        return "cadpontuacao.xhtml";
    }
    
    public String criarPontuacao() {
        pontuacaoFacade.criar(pontuacaoSendoIncluida);
        FacesMessage msg = null; 
        
        msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cadastro de Pontuação", "Pontuação cadastrada com sucesso!");  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
        return "pontuacao";
    }
    
    public List<Pontuacao> listagemDePontuacao() {
        return pontuacaoFacade.obterPontuacao();
    }
}
