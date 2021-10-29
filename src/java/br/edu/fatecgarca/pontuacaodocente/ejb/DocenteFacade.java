/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecgarca.pontuacaodocente.ejb;

import br.edu.fatecgarca.pontuacaodocente.entidades.Docente;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author Rafael
 */

@Stateless
@LocalBean
public class DocenteFacade {
     @PersistenceContext(unitName = "PontuacaoDocentePU")
    private EntityManager em;
    
    public void criar(Docente d) {
        em.persist(d);
    }
    
    public void editar(Docente d) {
        em.merge(d);
    }
    
    public void excluir(Docente d) {
        em.remove(em.merge(d));
    }
    
    public List<Docente> obterDocentes() {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Docente.class));
        return em.createQuery(cq).getResultList();
    }
    
    public Docente localizarLogin(String email, String senha) {
        Docente doc;
        Query consulta = em.createNamedQuery("docente.localizarlogin");
        consulta.setParameter("email", email);
        consulta.setParameter("senha", senha);
        try {
            doc = (Docente)consulta.getSingleResult();
        } catch (NoResultException ex) {
            System.out.println("Consulta falhou: " + ex.toString());
            doc = null;
        }
        return doc;
    }
    public Docente localizarDocente(String nome) {
        Docente doc;
        String cons;
        cons = "SELECT nome, area, formacao, email, numetec FROM docente WHERE nome='"+nome+"'";
        //Query consulta = em.createNativeQuery(cons);
        
        Query consulta = em.createQuery(cons);        
       // doc = (Docente)consulta.getSingleResult();
        try {
            doc = (Docente)consulta.getSingleResult();
        } catch (NoResultException ex) {
            System.out.println("Consulta falhou: " + ex.toString());
            doc = null;
        }
        return doc;
    }
}
