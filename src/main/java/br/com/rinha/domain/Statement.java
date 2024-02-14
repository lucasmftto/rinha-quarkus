package br.com.rinha.domain;

import java.util.List;

public class Statement {

    private Balance saldo;
    private List<Transaction> ultimas_transacoes;

    public Balance getSaldo() {
        return saldo;
    }

    public void setSaldo(Balance saldo) {
        this.saldo = saldo;
    }

    public List<Transaction> getUltimas_transacoes() {
        return ultimas_transacoes;
    }

    public void setUltimas_transacoes(List<Transaction> ultimas_transacoes) {
        this.ultimas_transacoes = ultimas_transacoes;
    }
}
