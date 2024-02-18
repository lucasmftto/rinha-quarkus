package br.com.rinha.controller;

import br.com.rinha.domain.*;
import io.quarkus.logging.Log;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.jboss.resteasy.reactive.RestResponse;

import java.time.LocalDateTime;
import java.util.List;

@Path("/clientes")
@RunOnVirtualThread
public class TransactionController {

    private void log() {
        Log.infof("Called on %s", Thread.currentThread());
    }

    @GET
    public String getAll() {
        log();
        // pinTheCarrierThread(); // To demonstrate pinning detection
        return "All transactions";
    }

    @POST()
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/{id}/transacoes")
    public RestResponse<TransactionCarried> newTransaction(Integer id,
                                                           @Valid TransactionResource transactionResource) {

        TransactionCarried body = new TransactionCarried();
        body.setLimite(2314);
        body.setSaldo(543);

        System.out.println("Thread: " + Thread.currentThread().getName() + " - " + LocalDateTime.now());
        return RestResponse.ResponseBuilder.ok(body).build();
    }

    @GET()
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}/extrato")
    public RestResponse<Statement> statement(Integer id) {
        Statement statement = new Statement();
        Balance saldo = new Balance();
        saldo.setData_extrato(LocalDateTime.now());
        saldo.setLimite(1000);
        saldo.setTotal(9999);
        statement.setSaldo(saldo);
        Transaction e1 = new Transaction();
        e1.setDescricao("Compra de pão");
        e1.setValor(10);
        e1.setTipo(TransactionType.c);
        e1.setRealizada_em(LocalDateTime.now());

        statement.setUltimas_transacoes(List.of(e1));

        System.out.println("Thread: " + Thread.currentThread().getName() + " - " + LocalDateTime.now());

        return RestResponse.ResponseBuilder.ok(statement).build();
    }
}
