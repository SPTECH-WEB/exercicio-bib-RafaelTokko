package com.school.sptech;

public class Biblioteca {
    private String nome;
    private Double multaDiaria;
    private Integer qtdLivros;
    private Boolean ativa;

    public Biblioteca(String nome, Double multaDiaria) {
        qtdLivros = 0;
        ativa = true;
        this.multaDiaria = multaDiaria;
        this.nome = nome;
    }

    public void registrarLivro(Integer quantidade) {
        if (quantidade != null && quantidade > 0 && ativa) {
            qtdLivros += quantidade;
        }
    }
    public Integer emprestar(Integer quantidade) {
        if (quantidade != null && quantidade > 0 && quantidade <= qtdLivros && ativa) {
            qtdLivros -= quantidade;
            return quantidade;
        } else {
            return null;
        }
    }
    public Integer devolver(Integer quantidade) {
        if (quantidade != null && ativa && quantidade > 0) {
            qtdLivros += quantidade;
            return quantidade;
        } else {
            return null;
        }
    }
    public Integer desativar() {
        if (!ativa) {
            return null;
        } else {
            ativa = false;
            Integer qtdLivrosAntigo = qtdLivros;
            qtdLivros = 0;
            return qtdLivrosAntigo;
        }

    }
    public void transferir(Biblioteca destino, Integer quantidade) {
        if (destino.ativa && ativa && quantidade != null && quantidade <= qtdLivros && quantidade > 0) {
            destino.qtdLivros += quantidade;
            qtdLivros -= quantidade;
        }
    }
    public Boolean reajustarMulta(Double percentual) {
        if (percentual != null && percentual > 0) {
            multaDiaria *= (1 + percentual);
            return true;
        } else {
            return false;
        }
    }
    public String getNome() {
        return nome;
    }

    public Double getMultaDiaria() {
        return multaDiaria;
    }

    public Integer getQtdLivros() {
        return qtdLivros;
    }

    public Boolean getAtiva() {
        return ativa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
