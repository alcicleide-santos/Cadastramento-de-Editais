package br.edu.ufra.rn;

import br.edu.ufra.dao.GenericDAO;
import br.edu.ufra.entidade.Pesquisador;

import java.util.List;

public class PesquisadorRN{
    private final GenericDAO<Pesquisador> PESQUISADOR_DAO = new GenericDAO<Pesquisador>();

    public boolean salvar(Pesquisador pesquisador) {
        if (pesquisador == null) {
            return false;
        } else {
            if (pesquisador.getId() == null || pesquisador.getId() == 0) {
                return PESQUISADOR_DAO.criar(pesquisador);
            } else {
                return PESQUISADOR_DAO.alterar(pesquisador);
            }
        }
    }

    public List<Pesquisador> listar() {
        return PESQUISADOR_DAO.obterTodos(Pesquisador.class);
    }


    public boolean excluir(Pesquisador pesquisador) {
        if (pesquisador == null) {
            return false;
        } else {
            return PESQUISADOR_DAO.excluir(pesquisador);
        }
    }
}
