package br.com.rinha.domain;

import java.time.LocalDateTime;

public class Transaction {
    private TransactionType tipo;
    private Integer valor;
    private String descricao;
    private LocalDateTime realizada_em;

    public TransactionType getTipo() {
        return tipo;
    }

    public void setTipo(TransactionType tipo) {
        this.tipo = tipo;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getRealizada_em() {
        return realizada_em;
    }

    public void setRealizada_em(LocalDateTime realizada_em) {
        this.realizada_em = realizada_em;
    }
}
