package br.edu.ufra.rn;

import br.edu.ufra.dao.GenericDAO;
import br.edu.ufra.entidade.Edital;

import java.util.List;

public class EditalRN {
    private final GenericDAO<Edital> EDITAL_DAO = new GenericDAO<Edital>();

    public boolean salvar(Edital edital) {
        if (edital == null) {
            return false;
        } else {
            if (edital.getId() == null || edital.getId() == 0) {
                return EDITAL_DAO.criar(edital);
            } else {
                return EDITAL_DAO.alterar(edital);
            }
        }
    }

    public List<Edital> listar() {
        return EDITAL_DAO.obterTodos(Edital.class);
    }


    public boolean excluir(Edital edital) {
        if (edital == null) {
            return false;
        } else {
            return EDITAL_DAO.excluir(edital);
        }
    }
}
