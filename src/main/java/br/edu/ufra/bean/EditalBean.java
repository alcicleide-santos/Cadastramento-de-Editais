package br.edu.ufra.bean;


import br.edu.ufra.entidade.Edital;
import br.edu.ufra.rn.EditalRN;
import br.edu.ufra.util.UtilBean;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import java.util.List;


@ManagedBean
@RequestScoped
public class EditalBean {

    private List<Edital> editais;
    private Edital edital = new Edital();
    private final EditalRN EDITAL_RN = new EditalRN();

    /**
     * Creates a new instance of AnimalBean
     */
    public EditalBean() {
    }

    @PostConstruct
    public void init() {
        editais = EDITAL_RN.listar();
    }

    public List<Edital> getEditais() {
        return editais;
    }

    public void setEditais(List<Edital> editais) {
        this.editais = editais;
    }

    public Edital getEdital() {
        return edital;
    }

    public void setEdital(Edital edital) {
        this.edital = edital;
    }

    public void excluir() {
        if (EDITAL_RN.excluir(edital)) {
            UtilBean.criarMensagemDeInformacao("Edital excluído");
            editais = EDITAL_RN.listar();
        } else {
            UtilBean.criarMensagemDeErro("Não foi possível excluir o edital");
        }
    }

    public void salvar() {
        if (EDITAL_RN.salvar(edital)) {
            UtilBean.criarMensagemDeInformacao("Edital salvo");
        } else {
            UtilBean.criarMensagemDeErro("Não foi possível salvar o edital");
        }
    }

}