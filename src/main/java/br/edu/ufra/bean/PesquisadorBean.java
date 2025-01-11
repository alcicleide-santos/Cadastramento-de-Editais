package br.edu.ufra.bean;

import br.edu.ufra.entidade.Pesquisador;
import br.edu.ufra.rn.PesquisadorRN;
import br.edu.ufra.util.UtilBean;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean; //
import javax.faces.bean.RequestScoped;
import java.util.List;

@ManagedBean
@RequestScoped
public class PesquisadorBean {
    private List<Pesquisador> pesquisadores;
    private Pesquisador pesquisador = new Pesquisador();
    private final PesquisadorRN PESQUISADOR_RN = new PesquisadorRN();

    /**
     * Creates a new instance of AnimalBean
     */
    public PesquisadorBean() {
    }

    @PostConstruct
    public void init() {
        pesquisadores = PESQUISADOR_RN.listar();
    }

    public List<Pesquisador> getPesquisadores() {
        return pesquisadores;
    }

    public void setPesquisadores(List<Pesquisador> pesquisadores) {
        this.pesquisadores = pesquisadores;
    }

    public Pesquisador getPesquisador() {
        return pesquisador;
    }

    public void setPesquisador(Pesquisador pesquisador) {
        this.pesquisador = pesquisador;
    }

    public void excluir() {
        if (PESQUISADOR_RN.excluir(pesquisador)) {
            UtilBean.criarMensagemDeInformacao("Pesquisador excluído");
            pesquisadores = PESQUISADOR_RN.listar();
        } else {
            UtilBean.criarMensagemDeErro("Não foi possível excluir o pesquisador");
        }
    }

    public void salvar() {
        if (PESQUISADOR_RN.salvar(pesquisador)) {
            UtilBean.criarMensagemDeInformacao("Pesquisador salvo");
        } else {
            UtilBean.criarMensagemDeErro("Não foi possível salvar o pesquisador");
        }
    }

}