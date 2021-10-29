/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecgarca.pontuacaodocente.ejb;

import br.edu.fatecgarca.pontuacaodocente.entidades.PontosCalculados;
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
public class PontosCalculadosFacade {
    
    @PersistenceContext(unitName = "PontuacaoDocentePU")
    private EntityManager em;
    
    public void criar(PontosCalculados pc) {
        em.persist(pc);
    }
    
    public void editar(PontosCalculados pc) {
        em.merge(pc);
    }
    
    public void excluir(PontosCalculados pc) {
        em.remove(em.merge(pc));
    }
    
    public List<PontosCalculados> obterPontosCalculados() {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(PontosCalculados.class));
        return em.createQuery(cq).getResultList();
    }
    
}
