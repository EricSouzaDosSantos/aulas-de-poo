package com.senai.estudos.poo.aula_06.abstracao.exercicios.sistema_de_pagamentos;

public class PagamentoPIX extends Pagamento {
    public PagamentoPIX(String usuario, double valor) {
        super(usuario, valor);
    }

    @Override
    protected void autenticarUsuario() {
        System.out.println("Autenticando usuário para pagamento via PIX...");
    }

    @Override
    protected boolean validarAntifraude() {
        System.out.println("Validando antifraude para PIX...");
        return true;
    }

    @Override
    protected void executarPagamento() {
        System.out.println("Pagamento via PIX realizado com sucesso!");
    }
}
