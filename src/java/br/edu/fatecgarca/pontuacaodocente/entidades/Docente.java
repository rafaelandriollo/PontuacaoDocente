/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecgarca.pontuacaodocente.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Rafael
 */

@Entity
@NamedQuery(
        name="docente.localizarlogin",
        query="SELECT d FROM Docente d WHERE d.email = :email"
        + " AND d.senha = :senha"
)
@Table(name= "docente")
public class Docente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nome;
    private String RG;
    private String Area;
    private String Formacao;
    private String PrazoContrato;
    private String email;
    private String senha;
    private int numetec;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Docente)) {
            return false;
        }
        Docente other = (Docente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.fatecgarca.pontuacaodocente.entidades.Docente[ id=" + id + " ]";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public String getFormacao() {
        return Formacao;
    }

    public void setFormacao(String Formacao) {
        this.Formacao = Formacao;
    }

    public String getPrazoContrato() {
        return PrazoContrato;
    }

    public void setPrazoContrato(String PrazoContrato) {
        this.PrazoContrato = PrazoContrato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNumetec() {
        return numetec;
    }

    public void setNumetec(int numetec) {
        this.numetec = numetec;
    }
    
    
    
}
