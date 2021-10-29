/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecgarca.pontuacaodocente.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Rafael
 */
@ManagedBean
@RequestScoped
public class PontuacaoChange {
    
    private String campo;
    private List<String> magisterioOpcoes = new ArrayList<String>();
    
    private String result;
    private Map<String, String> magisterioResult = new HashMap<String, String>();

    /**
     * Creates a new instance of PontuacaoChange
     */
   public PontuacaoChange() {
       magisterioOpcoes.add("Sim");
       magisterioOpcoes.add("Não");
       
       magisterioResult.put("Sim", "5");
       magisterioResult.put("Não", "0");
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }
    
    public String getCampo() {
        return this.campo;
    }
    
    public void setMagisterioOpcoes(List<String> magisterioOpcoes) {
        this.magisterioOpcoes = magisterioOpcoes;
    }

    public List<String> getMagisterioOpcoes() {
        return this.magisterioOpcoes;
    }

    public String getResult() {
        return result;
    }
   
    public void magisterioChange() {
        
        if ((campo != null) && (!campo.equals(""))) {
            result = (magisterioResult.get(campo));
        }
        
    }
}
