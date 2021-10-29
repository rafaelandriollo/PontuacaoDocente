/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecgarca.pontuacaodocente.ejb;

import br.edu.fatecgarca.pontuacaodocente.entidades.Pontuacao;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author Rafael
 */
@Stateless
@LocalBean
public class PontuacaoFacade {
    @PersistenceContext(unitName = "PontuacaoDocentePU")
    private EntityManager em;
    
    public void criar(Pontuacao p) {
        em.persist(p);
    }
    
    public void editar(Pontuacao p) {
        em.merge(p);
    }
    
    public void excluir(Pontuacao p) {
        em.remove(em.merge(p));
    }
    
    public List<Pontuacao> obterPontuacao() {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Pontuacao.class));
        return em.createQuery(cq).getResultList();
    }
    
}
