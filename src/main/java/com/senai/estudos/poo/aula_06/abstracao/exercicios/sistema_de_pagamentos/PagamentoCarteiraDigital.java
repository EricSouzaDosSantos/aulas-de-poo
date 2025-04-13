package com.senai.estudos.poo.aula_06.abstracao.exercicios.sistema_de_pagamentos;

public class PagamentoCarteiraDigital extends Pagamento {
    public PagamentoCarteiraDigital(String usuario, double valor) {
        super(usuario, valor);
    }

    @Override
    protected void autenticarUsuario() {
        System.out.println("Autenticando usuário para pagamento via carteira digital...");
    }

    @Override
    protected boolean validarAntifraude() {
        System.out.println("Validando antifraude para carteira digital...");
        return true;
    }

    @Override
    protected void executarPagamento() {
        System.out.println("Pagamento via carteira digital concluído com sucesso!");
    }
}
