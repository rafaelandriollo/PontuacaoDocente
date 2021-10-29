/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecgarca.pontuacaodocente.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Rafael
 */
@Entity
public class PontosCalculados implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    //------------grupo 1----------------
    private Integer Magisterio;
    private Integer Licenci_gradu;
    private Integer Pedagogia;
    private Integer Pos_grad;
    private Integer Mestrado;
    private Integer Doutorado;
    private Double Treinamento_total;
    private Double Grupo1_subtotal;

    //-----grupo 1 a-----------------
    private Double Treinamento;
    private Double Semin_congressos;

    //------------grupo 2------------------
    private Integer Livro;
    private Integer Apostila;
    private Integer Pesq_cientifica;
    private Integer Ensaios_artigos;
    private Integer Trabalhos_seminarios;
    private Integer Cursos;
    private Integer Palestras;
    private Integer Orientacao_tcc;
    private Integer Grupo2_subtotal;

    //-------grupo 3-----------------------
    private Double Tempo_ceeteps;
    private Double Tempo_ue;
    private Double Grupo3_subtotal;

    //----grupo 3 c-----
    private Integer Diretor_super;
    private Integer Vice_diretor_super;
    private Integer Chefe_gabinete;
    private Integer Coord_cetec;
    private Integer Diretor_ue;
    private Integer Diretor_acad;
    private Integer Atd_dirservico;
    private Integer Prd_acetec;
    private Integer Resp_projinstitucional;
    private Integer Coord_area;
    private Integer Superv_estagio;
    private Integer Resp_projetosue;
    private Integer Tecadm_ceeteps_total;

    //-----grupo 3d ------
    private Double Pontosacumulados;
    private Double Anoant2_total;
    private Double Anoatu1_total;
    private Double Anoatu2_total;
    private Double Total_semestres;
    private Double Atdocente_total; //(acumulados+total_semestreS)


    //-------grupo 3e-------
    private Integer Sindicancia;
    private Integer Bancas_avmerito;
    private Integer Com_trabalho;
    private Integer Conselho_escola;
    private Integer Cipa;
    private Integer Apm;
    private Integer Comissaobanca_total;

    //-----grupo 4------
    private Integer Total_assiduidade;
    private Integer Total_reunioes;
    private Integer Total_docs;
    private Integer Total_horarios;
    private Integer Total_bonus;
    private Integer Grupo4_subtotal;

    private Double Pontuacao_final;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMagisterio() {
        return Magisterio;
    }

    public void setMagisterio(Integer Magisterio) {
        this.Magisterio = Magisterio;
    }

    public Integer getLicenci_gradu() {
        return Licenci_gradu;
    }

    public void setLicenci_gradu(Integer Licenci_gradu) {
        this.Licenci_gradu = Licenci_gradu;
    }

    public Integer getPedagogia() {
        return Pedagogia;
    }

    public void setPedagogia(Integer Pedagogia) {
        this.Pedagogia = Pedagogia;
    }

    public Integer getPos_grad() {
        return Pos_grad;
    }

    public void setPos_grad(Integer Pos_grad) {
        this.Pos_grad = Pos_grad;
    }

    public Integer getMestrado() {
        return Mestrado;
    }

    public void setMestrado(Integer Mestrado) {
        this.Mestrado = Mestrado;
    }

    public Integer getDoutorado() {
        return Doutorado;
    }

    public void setDoutorado(Integer Doutorado) {
        this.Doutorado = Doutorado;
    }

    public Double getTreinamento_total() {
        return Treinamento_total;
    }

    public void setTreinamento_total(Double Treinamento_total) {
        this.Treinamento_total = Treinamento_total;
    }

    public Double getGrupo1_subtotal() {
        return Grupo1_subtotal;
    }

    public void setGrupo1_subtotal(Double Grupo1_subtotal) {
        this.Grupo1_subtotal = Grupo1_subtotal;
    }

    public Double getTreinamento() {
        return Treinamento;
    }

    public void setTreinamento(Double Treinamento) {
        this.Treinamento = Treinamento;
    }

    public Double getSemin_congressos() {
        return Semin_congressos;
    }

    public void setSemin_congressos(Double Semin_congressos) {
        this.Semin_congressos = Semin_congressos;
    }

    public Integer getLivro() {
        return Livro;
    }

    public void setLivro(Integer Livro) {
        this.Livro = Livro;
    }

    public Integer getApostila() {
        return Apostila;
    }

    public void setApostila(Integer Apostila) {
        this.Apostila = Apostila;
    }

    public Integer getPesq_cientifica() {
        return Pesq_cientifica;
    }

    public void setPesq_cientifica(Integer Pesq_cientifica) {
        this.Pesq_cientifica = Pesq_cientifica;
    }

    public Integer getEnsaios_artigos() {
        return Ensaios_artigos;
    }

    public void setEnsaios_artigos(Integer Ensaios_artigos) {
        this.Ensaios_artigos = Ensaios_artigos;
    }

    public Integer getTrabalhos_seminarios() {
        return Trabalhos_seminarios;
    }

    public void setTrabalhos_seminarios(Integer Trabalhos_seminarios) {
        this.Trabalhos_seminarios = Trabalhos_seminarios;
    }

    public Integer getCursos() {
        return Cursos;
    }

    public void setCursos(Integer Cursos) {
        this.Cursos = Cursos;
    }

    public Integer getPalestras() {
        return Palestras;
    }

    public void setPalestras(Integer Palestras) {
        this.Palestras = Palestras;
    }

    public Integer getOrientacao_tcc() {
        return Orientacao_tcc;
    }

    public void setOrientacao_tcc(Integer Orientacao_tcc) {
        this.Orientacao_tcc = Orientacao_tcc;
    }

    public Integer getGrupo2_subtotal() {
        return Grupo2_subtotal;
    }

    public void setGrupo2_subtotal(Integer Grupo2_subtotal) {
        this.Grupo2_subtotal = Grupo2_subtotal;
    }

    public Double getTempo_ceeteps() {
        return Tempo_ceeteps;
    }

    public void setTempo_ceeteps(Double Tempo_ceeteps) {
        this.Tempo_ceeteps = Tempo_ceeteps;
    }

    public Double getTempo_ue() {
        return Tempo_ue;
    }

    public void setTempo_ue(Double Tempo_ue) {
        this.Tempo_ue = Tempo_ue;
    }

    public Double getGrupo3_subtotal() {
        return Grupo3_subtotal;
    }

    public void setGrupo3_subtotal(Double Grupo3_subtotal) {
        this.Grupo3_subtotal = Grupo3_subtotal;
    }

    public Integer getDiretor_super() {
        return Diretor_super;
    }

    public void setDiretor_super(Integer Diretor_super) {
        this.Diretor_super = Diretor_super;
    }

    public Integer getVice_diretor_super() {
        return Vice_diretor_super;
    }

    public void setVice_diretor_super(Integer Vice_diretor_super) {
        this.Vice_diretor_super = Vice_diretor_super;
    }

    public Integer getChefe_gabinete() {
        return Chefe_gabinete;
    }

    public void setChefe_gabinete(Integer Chefe_gabinete) {
        this.Chefe_gabinete = Chefe_gabinete;
    }

    public Integer getCoord_cetec() {
        return Coord_cetec;
    }

    public void setCoord_cetec(Integer Coord_cetec) {
        this.Coord_cetec = Coord_cetec;
    }

    public Integer getDiretor_ue() {
        return Diretor_ue;
    }

    public void setDiretor_ue(Integer Diretor_ue) {
        this.Diretor_ue = Diretor_ue;
    }

    public Integer getDiretor_acad() {
        return Diretor_acad;
    }

    public void setDiretor_acad(Integer Diretor_acad) {
        this.Diretor_acad = Diretor_acad;
    }

    public Integer getAtd_dirservico() {
        return Atd_dirservico;
    }

    public void setAtd_dirservico(Integer Atd_dirservico) {
        this.Atd_dirservico = Atd_dirservico;
    }

    public Integer getPrd_acetec() {
        return Prd_acetec;
    }

    public void setPrd_acetec(Integer Prd_acetec) {
        this.Prd_acetec = Prd_acetec;
    }

    public Integer getResp_projinstitucional() {
        return Resp_projinstitucional;
    }

    public void setResp_projinstitucional(Integer Resp_projinstitucional) {
        this.Resp_projinstitucional = Resp_projinstitucional;
    }

    public Integer getCoord_area() {
        return Coord_area;
    }

    public void setCoord_area(Integer Coord_area) {
        this.Coord_area = Coord_area;
    }

    public Integer getSuperv_estagio() {
        return Superv_estagio;
    }

    public void setSuperv_estagio(Integer Superv_estagio) {
        this.Superv_estagio = Superv_estagio;
    }

    public Integer getResp_projetosue() {
        return Resp_projetosue;
    }

    public void setResp_projetosue(Integer Resp_projetosue) {
        this.Resp_projetosue = Resp_projetosue;
    }

    public Integer getTecadm_ceeteps_total() {
        return Tecadm_ceeteps_total;
    }

    public void setTecadm_ceeteps_total(Integer Tecadm_ceeteps_total) {
        this.Tecadm_ceeteps_total = Tecadm_ceeteps_total;
    }

    public Double getPontosacumulados() {
        return Pontosacumulados;
    }

    public void setPontosacumulados(Double Pontosacumulados) {
        this.Pontosacumulados = Pontosacumulados;
    }

    public Double getAnoant2_total() {
        return Anoant2_total;
    }

    public void setAnoant2_total(Double Anoant2_total) {
        this.Anoant2_total = Anoant2_total;
    }

    public Double getAnoatu1_total() {
        return Anoatu1_total;
    }

    public void setAnoatu1_total(Double Anoatu1_total) {
        this.Anoatu1_total = Anoatu1_total;
    }

    public Double getAnoatu2_total() {
        return Anoatu2_total;
    }

    public void setAnoatu2_total(Double Anoatu2_total) {
        this.Anoatu2_total = Anoatu2_total;
    }

    public Double getTotal_semestres() {
        return Total_semestres;
    }

    public void setTotal_semestres(Double Total_semestres) {
        this.Total_semestres = Total_semestres;
    }

    public Double getAtdocente_total() {
        return Atdocente_total;
    }

    public void setAtdocente_total(Double Atdocente_total) {
        this.Atdocente_total = Atdocente_total;
    }

    public Integer getSindicancia() {
        return Sindicancia;
    }

    public void setSindicancia(Integer Sindicancia) {
        this.Sindicancia = Sindicancia;
    }

    public Integer getBancas_avmerito() {
        return Bancas_avmerito;
    }

    public void setBancas_avmerito(Integer Bancas_avmerito) {
        this.Bancas_avmerito = Bancas_avmerito;
    }

    public Integer getCom_trabalho() {
        return Com_trabalho;
    }

    public void setCom_trabalho(Integer Com_trabalho) {
        this.Com_trabalho = Com_trabalho;
    }

    public Integer getConselho_escola() {
        return Conselho_escola;
    }

    public void setConselho_escola(Integer Conselho_escola) {
        this.Conselho_escola = Conselho_escola;
    }

    public Integer getCipa() {
        return Cipa;
    }

    public void setCipa(Integer Cipa) {
        this.Cipa = Cipa;
    }

    public Integer getApm() {
        return Apm;
    }

    public void setApm(Integer Apm) {
        this.Apm = Apm;
    }

    public Integer getComissaobanca_total() {
        return Comissaobanca_total;
    }

    public void setComissaobanca_total(Integer Comissaobanca_total) {
        this.Comissaobanca_total = Comissaobanca_total;
    }

    public Integer getTotal_assiduidade() {
        return Total_assiduidade;
    }

    public void setTotal_assiduidade(Integer Total_assiduidade) {
        this.Total_assiduidade = Total_assiduidade;
    }

    public Integer getTotal_reunioes() {
        return Total_reunioes;
    }

    public void setTotal_reunioes(Integer Total_reunioes) {
        this.Total_reunioes = Total_reunioes;
    }

    public Integer getTotal_docs() {
        return Total_docs;
    }

    public void setTotal_docs(Integer Total_docs) {
        this.Total_docs = Total_docs;
    }

    public Integer getTotal_horarios() {
        return Total_horarios;
    }

    public void setTotal_horarios(Integer Total_horarios) {
        this.Total_horarios = Total_horarios;
    }

    public Integer getTotal_bonus() {
        return Total_bonus;
    }

    public void setTotal_bonus(Integer Total_bonus) {
        this.Total_bonus = Total_bonus;
    }

    public Double getPontuacao_final() {
        return Pontuacao_final;
    }

    public void setPontuacao_final(Double Pontuacao_final) {
        this.Pontuacao_final = Pontuacao_final;
    }

    public Integer getGrupo4_subtotal() {
        return Grupo4_subtotal;
    }

    public void setGrupo4_subtotal(Integer Grupo4_subtotal) {
        this.Grupo4_subtotal = Grupo4_subtotal;
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
        if (!(object instanceof PontosCalculados)) {
            return false;
        }
        PontosCalculados other = (PontosCalculados) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.fatecgarca.pontuacaodocente.entidades.PontosCalculados[ id=" + id + " ]";
    }
    
}
