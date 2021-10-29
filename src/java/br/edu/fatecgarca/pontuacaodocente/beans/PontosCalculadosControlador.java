/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecgarca.pontuacaodocente.beans;

import br.edu.fatecgarca.pontuacaodocente.ejb.PontosCalculadosFacade;
import br.edu.fatecgarca.pontuacaodocente.entidades.PontosCalculados;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Rafael
 */

@ManagedBean
//@SessionScoped
public class PontosCalculadosControlador implements Serializable {
    
    @EJB
    private PontosCalculadosFacade pontosCalculadosFacade;
    
    private PontosCalculados pontosCalculadosSendoIncluidos;
    
    public PontosCalculados getPontosCalculadosSendoIncluidos() {
        return pontosCalculadosSendoIncluidos;
    }
    
    public String novosPontosCalculados() {
        pontosCalculadosSendoIncluidos = new PontosCalculados();
        return "cadpontuacao.xhtml";
    }
    
    public String criarEtec() {
        pontosCalculadosFacade.criar(pontosCalculadosSendoIncluidos);
        return "index";
    }
    
    public List<PontosCalculados> listagemDePontosCalculados() {
        return pontosCalculadosFacade.obterPontosCalculados();
    }
    
}
