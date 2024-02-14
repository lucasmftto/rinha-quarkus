package br.com.rinha.domain;

import java.time.LocalDateTime;

public class Balance {
    private Integer total;
    private LocalDateTime data_extrato;
    private Integer limite;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public LocalDateTime getData_extrato() {
        return data_extrato;
    }

    public void setData_extrato(LocalDateTime data_extrato) {
        this.data_extrato = data_extrato;
    }

    public Integer getLimite() {
        return limite;
    }

    public void setLimite(Integer limite) {
        this.limite = limite;
    }
}
