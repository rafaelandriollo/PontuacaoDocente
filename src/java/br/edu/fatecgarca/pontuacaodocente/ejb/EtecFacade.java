/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecgarca.pontuacaodocente.ejb;

import br.edu.fatecgarca.pontuacaodocente.entidades.Etec;
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
public class EtecFacade {
    
    @PersistenceContext(unitName = "PontuacaoDocentePU")
    private EntityManager em;
    
    public void criar(Etec e) {
        em.persist(e);
    }
    
    public void editar(Etec e) {
        em.merge(e);
    }
    
    public void excluir(Etec e) {
        em.remove(em.merge(e));
    }
    
    public List<Etec> obterEtec() {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Etec.class));
        return em.createQuery(cq).getResultList();
    }
    
}
