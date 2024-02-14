package br.com.rinha.domain;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class TransactionResource {
    @NotNull
    private TransactionType tipo;
    @NotNull
    private Integer valor;
    @NotNull
    @Size(min = 1, max = 10)
    private String descricao;

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

    public TransactionType getTipo() {
        return tipo;
    }

    public void setTipo(TransactionType tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "TransactionResource{" +
                "tipo=" + tipo +
                ", valor=" + valor +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
