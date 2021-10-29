/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecgarca.pontuacaodocente.beans;

import br.edu.fatecgarca.pontuacaodocente.ejb.EtecFacade;
import br.edu.fatecgarca.pontuacaodocente.entidades.Etec;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Rafael
 */

@ManagedBean
//@SessionScoped
public class EtecControlador implements Serializable {
    
    @EJB
    private EtecFacade etecFacade;
    
    private Etec etecSendoIncluida;
    
    public Etec getEtecSendoIncluida() {
        return etecSendoIncluida;
    }
    
    public String novaEtec() {
        etecSendoIncluida = new Etec();
        return "novaetec.xhtml";
    }
    
    public String criarEtec() {
        etecFacade.criar(etecSendoIncluida);
        return "index";
    }
    
    public List<Etec> listagemDeEtecs() {
        return etecFacade.obterEtec();
    }
    
}
