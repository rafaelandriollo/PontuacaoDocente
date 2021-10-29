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
public class Pontuacao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    //------------grupo 1----------------
    private String Magisterio;
    private String Licenci_gradu;
    private String Pedagogia;
    private String Pos_grad;
    private String Mestrado;
    private String Doutorado;

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

    //-------grupo 3-----------------------
    private Double Tempo_ceeteps;
    private Double Tempo_ue;

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

    //-----grupo 3d ------
    private Integer Anoant2;
    private Integer Anoatu1;
    private Integer Anoatu2;
    private Integer Aulasant2;
    private Integer Aulasatu1;
    private Integer Aulasatu2;

    //-------grupo 3e-------
    private Integer Sindicancia_ue;
    private Integer Bancas_avmerito_ue;
    private Integer Com_trabalho_ue;
    private Integer Sindicancia_ceeteps;
    private Integer Bancas_avmerito_ceeteps;
    private Integer Com_trabalho_ceeteps;
    private Integer Conselho_escola;
    private Integer Cipa;
    private Integer Apm;

    //-----grupo 4------
    private Integer Carga_horaria;
    private Integer Faltas;
    private Integer Semanas_assiduidade;
    private Integer Reunioes_comparec;
    private Integer Reunioes_num;
    private Integer Docs_solicit;
    private Integer Docs_naoentreg;
    private Integer Aulas_semanais;
    private Integer Aulas_atrasos;
    private Integer Aulas_semanas;
    private Integer Bonus_aulassem;
    private Integer Bonus_faltas;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMagisterio() {
        return Magisterio;
    }

    public void setMagisterio(String Magisterio) {
        this.Magisterio = Magisterio;
    }

    public String getLicenci_gradu() {
        return Licenci_gradu;
    }

    public void setLicenci_gradu(String Licenci_gradu) {
        this.Licenci_gradu = Licenci_gradu;
    }

    public String getPedagogia() {
        return Pedagogia;
    }

    public void setPedagogia(String Pedagogia) {
        this.Pedagogia = Pedagogia;
    }

    public String getPos_grad() {
        return Pos_grad;
    }

    public void setPos_grad(String Pos_grad) {
        this.Pos_grad = Pos_grad;
    }

    public String getMestrado() {
        return Mestrado;
    }

    public void setMestrado(String Mestrado) {
        this.Mestrado = Mestrado;
    }

    public String getDoutorado() {
        return Doutorado;
    }

    public void setDoutorado(String Doutorado) {
        this.Doutorado = Doutorado;
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

    public Integer getAnoant2() {
        return Anoant2;
    }

    public void setAnoant2(Integer Anoant2) {
        this.Anoant2 = Anoant2;
    }

    public Integer getAnoatu1() {
        return Anoatu1;
    }

    public void setAnoatu1(Integer Anoatu1) {
        this.Anoatu1 = Anoatu1;
    }

    public Integer getAnoatu2() {
        return Anoatu2;
    }

    public void setAnoatu2(Integer Anoatu2) {
        this.Anoatu2 = Anoatu2;
    }

    public Integer getAulasant2() {
        return Aulasant2;
    }

    public void setAulasant2(Integer Aulasant2) {
        this.Aulasant2 = Aulasant2;
    }

    public Integer getAulasatu1() {
        return Aulasatu1;
    }

    public void setAulasatu1(Integer Aulasatu1) {
        this.Aulasatu1 = Aulasatu1;
    }

    public Integer getAulasatu2() {
        return Aulasatu2;
    }

    public void setAulasatu2(Integer Aulasatu2) {
        this.Aulasatu2 = Aulasatu2;
    }

    public Integer getSindicancia_ue() {
        return Sindicancia_ue;
    }

    public void setSindicancia_ue(Integer Sindicancia_ue) {
        this.Sindicancia_ue = Sindicancia_ue;
    }

    public Integer getBancas_avmerito_ue() {
        return Bancas_avmerito_ue;
    }

    public void setBancas_avmerito_ue(Integer Bancas_avmerito_ue) {
        this.Bancas_avmerito_ue = Bancas_avmerito_ue;
    }

    public Integer getCom_trabalho_ue() {
        return Com_trabalho_ue;
    }

    public void setCom_trabalho_ue(Integer Com_trabalho_ue) {
        this.Com_trabalho_ue = Com_trabalho_ue;
    }

    public Integer getSindicancia_ceeteps() {
        return Sindicancia_ceeteps;
    }

    public void setSindicancia_ceeteps(Integer Sindicancia_ceeteps) {
        this.Sindicancia_ceeteps = Sindicancia_ceeteps;
    }

    public Integer getBancas_avmerito_ceeteps() {
        return Bancas_avmerito_ceeteps;
    }

    public void setBancas_avmerito_ceeteps(Integer Bancas_avmerito_ceeteps) {
        this.Bancas_avmerito_ceeteps = Bancas_avmerito_ceeteps;
    }

    public Integer getCom_trabalho_ceeteps() {
        return Com_trabalho_ceeteps;
    }

    public void setCom_trabalho_ceeteps(Integer Com_trabalho_ceeteps) {
        this.Com_trabalho_ceeteps = Com_trabalho_ceeteps;
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

    public Integer getCarga_horaria() {
        return Carga_horaria;
    }

    public void setCarga_horaria(Integer Carga_horaria) {
        this.Carga_horaria = Carga_horaria;
    }

    public Integer getFaltas() {
        return Faltas;
    }

    public void setFaltas(Integer Faltas) {
        this.Faltas = Faltas;
    }

    public Integer getSemanas_assiduidade() {
        return Semanas_assiduidade;
    }

    public void setSemanas_assiduidade(Integer Semanas_assiduidade) {
        this.Semanas_assiduidade = Semanas_assiduidade;
    }

    public Integer getReunioes_comparec() {
        return Reunioes_comparec;
    }

    public void setReunioes_comparec(Integer Reunioes_comparec) {
        this.Reunioes_comparec = Reunioes_comparec;
    }

    public Integer getReunioes_num() {
        return Reunioes_num;
    }

    public void setReunioes_num(Integer Reunioes_num) {
        this.Reunioes_num = Reunioes_num;
    }

    public Integer getDocs_solicit() {
        return Docs_solicit;
    }

    public void setDocs_solicit(Integer Docs_solicit) {
        this.Docs_solicit = Docs_solicit;
    }

    public Integer getDocs_naoentreg() {
        return Docs_naoentreg;
    }

    public void setDocs_naoentreg(Integer Docs_naoentreg) {
        this.Docs_naoentreg = Docs_naoentreg;
    }

    public Integer getAulas_semanais() {
        return Aulas_semanais;
    }

    public void setAulas_semanais(Integer Aulas_semanais) {
        this.Aulas_semanais = Aulas_semanais;
    }

    public Integer getAulas_atrasos() {
        return Aulas_atrasos;
    }

    public void setAulas_atrasos(Integer Aulas_atrasos) {
        this.Aulas_atrasos = Aulas_atrasos;
    }

    public Integer getAulas_semanas() {
        return Aulas_semanas;
    }

    public void setAulas_semanas(Integer Aulas_semanas) {
        this.Aulas_semanas = Aulas_semanas;
    }

    public Integer getBonus_aulassem() {
        return Bonus_aulassem;
    }

    public void setBonus_aulassem(Integer Bonus_aulassem) {
        this.Bonus_aulassem = Bonus_aulassem;
    }

    public Integer getBonus_faltas() {
        return Bonus_faltas;
    }

    public void setBonus_faltas(Integer Bonus_faltas) {
        this.Bonus_faltas = Bonus_faltas;
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
        if (!(object instanceof Pontuacao)) {
            return false;
        }
        Pontuacao other = (Pontuacao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.fatecgarca.pontuacaodocente.entidades.Pontuacao[ id=" + id + " ]";
    }
    
}
