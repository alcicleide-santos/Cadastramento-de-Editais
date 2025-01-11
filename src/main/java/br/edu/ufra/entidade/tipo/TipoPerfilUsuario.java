/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ufra.entidade.tipo;

public enum TipoPerfilUsuario {

    ADMINISTRADOR('A', "Administrador"),
    GERENTE('G', "Gerente"),
    PESQUISADOR('P', "Pesquisador"),
    DISCENTE('D', "Discente");

    private Character valor;
    private String descricao;

    private TipoPerfilUsuario(Character tipo, String descricao) {
        this.valor = tipo;
        this.descricao = descricao;
    }

    public static TipoPerfilUsuario obter(char valor) {
        TipoPerfilUsuario resposta = GERENTE;
        TipoPerfilUsuario[] values = values();
        for (TipoPerfilUsuario t : values) {
            if (t.getValor() == valor) {
                resposta = t;
                return resposta;
            }
        }
        return resposta;
    }

    public boolean isAdministrador() {
        return equals(ADMINISTRADOR);
    }

    public boolean isGerente() {
        return equals(GERENTE);
    }

    public boolean isPesquisador() {
        return equals(PESQUISADOR);
    }

    public boolean isDiscente() {return equals(DISCENTE);}

    public Character getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

}
