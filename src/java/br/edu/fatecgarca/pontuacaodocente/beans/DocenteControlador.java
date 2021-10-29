/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecgarca.pontuacaodocente.beans;

import br.edu.fatecgarca.pontuacaodocente.ejb.DocenteFacade;
import br.edu.fatecgarca.pontuacaodocente.entidades.Docente;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author Rafael
 */

@ManagedBean
//@SessionScoped
public class DocenteControlador implements Serializable {
    
    @EJB
    private DocenteFacade docenteFacade;
    
    private Docente docenteSendoIncluido;
    
    public Docente getDocenteSendoIncluido() {
        return docenteSendoIncluido;
    }
    
    public String novoDocente() {
        docenteSendoIncluido = new Docente();
        return "novodocente.xhtml";
    }
    
    public String criarDocente() {
        docenteFacade.criar(docenteSendoIncluido);
        return "index";
    }
    
    public List<Docente> listagemDeDocentes() {
        return docenteFacade.obterDocentes();
    }
    
    public String listarDocente(String nome) {
        Docente doc;
        doc=docenteFacade.localizarDocente(nome);
        return doc.getNome();
    }
    
    public void onEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edição concluída");

        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    public void onCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edição cancelada");

        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}
