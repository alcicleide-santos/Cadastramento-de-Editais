package br.edu.ufra.entidade;

import javax.persistence.*;

import java.util.*;

@Entity
@Table(name = "edital")
@NamedQueries({
        @NamedQuery(name = "Edital.findAll", query = "SELECT e FROM Edital e"),
        @NamedQuery(name = "Edital.findById", query = "SELECT e FROM Edital e WHERE e.id = :id")})
public class Edital {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "titulo", nullable = false, length = 50)
    private String titulo;

    @Column(name = "edital_numero")
    private Integer editalNumero;

    @Column(name = "data_inicio")
    @Temporal(TemporalType.DATE)
    private Date dataInicio;

    @Column(name = "data_fim")
    @Temporal(TemporalType.DATE)
    private Date dataFim;

    @OneToMany(mappedBy = "edital")
    private List<Pesquisador> pesquisadores = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getEditalNumero() {
        return editalNumero;
    }

    public void setEditalNumero(Integer editalNumero) {

        this.editalNumero = editalNumero;
    }

    public Date getDataInicio() {

        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public List<Pesquisador> getPesquisadores() {
        return pesquisadores;
    }

    public void setPesquisadores(List<Pesquisador> pesquisadores) {
        this.pesquisadores = pesquisadores;
    }

}