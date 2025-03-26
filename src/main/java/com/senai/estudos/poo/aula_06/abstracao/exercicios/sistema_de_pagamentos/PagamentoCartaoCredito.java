package com.senai.estudos.poo.aula_06.abstracao.exercicios.sistema_de_pagamentos;

public class PagamentoCartaoCredito extends Pagamento {
    public PagamentoCartaoCredito(String usuario, double valor) {
        super(usuario, valor);
    }

    @Override
    protected void autenticarUsuario() {
        System.out.println("Autenticando usuário para pagamento com cartão de crédito...");
    }

    @Override
    protected boolean validarAntifraude() {
        System.out.println("Validando antifraude para cartão de crédito...");
        return true;
    }

    @Override
    protected void executarPagamento() {
        System.out.println("Pagamento com cartão de crédito processado com sucesso!");
    }
}

