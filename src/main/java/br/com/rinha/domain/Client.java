package br.com.rinha.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "clientes")
public class Client {
    @Id
    private Long id;
    private String nome;
    private Long limite;
    private Long balance;

    public Long getId() {
        return id;
    }

    public Long getLimite() {
        return limite;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLimit(Long limite) {
        this.limite = limite;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public Long getBalance() {
        return balance;
    }

    public String getNome() {
        return nome;
    }

    public void setName(String nome) {
        this.nome = nome;
    }

}
