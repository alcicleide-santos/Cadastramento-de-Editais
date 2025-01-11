package br.edu.ufra.entidade;

import javax.persistence.*;

@Entity
@Table(name = "pesquisador")
@NamedQueries({
        @NamedQuery(name = "Pesquisador.findAll", query = "SELECT p FROM Pesquisador p"),
        @NamedQuery(name = "Pesquisador.findById", query = "SELECT p FROM Pesquisador p WHERE p.id = :id")})
public class Pesquisador {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nome", length = 50)
    private String nome;

    @Column(name = "cpf", length = 11)
    private String cpf;

    @Column(name = "telefone", length = 11)
    private String telefone;

    @Column(name = "email")
    private String email;

    @Column(name = "instituicao", length = 100)
    private String instituicao;

    @Column(name = "siap")
    private Integer siap;

    @Column(name = "area_pesquisa", length = 100)
    private String areaPesquisa;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "edital_id")
    private Edital edital;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public Integer getSiap() {
        return siap;
    }

    public void setSiap(Integer siap) {
        this.siap = siap;
    }

    public String getAreaPesquisa() {
        return areaPesquisa;
    }

    public void setAreaPesquisa(String areaPesquisa) {
        this.areaPesquisa = areaPesquisa;
    }

    public Edital getEdital() {
        return edital;
    }

    public void setEdital(Edital edital) {
        this.edital = edital;
    }

}