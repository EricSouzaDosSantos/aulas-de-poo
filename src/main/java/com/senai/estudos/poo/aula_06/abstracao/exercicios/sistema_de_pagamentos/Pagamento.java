package com.senai.estudos.poo.aula_06.abstracao.exercicios.sistema_de_pagamentos;

public abstract class Pagamento {
    protected String usuario;
    protected double valor;

    public Pagamento(String usuario, double valor) {
        this.usuario = usuario;
        this.valor = valor;
    }

    public final void processarPagamento() {
        autenticarUsuario();
        if (!validarAntifraude()) {
            System.out.println("Pagamento negado por suspeita de fraude.");
            return;
        }
        executarPagamento();
        registrarTransacao();
        registrarLog();
    }

    protected abstract void autenticarUsuario();
    protected abstract boolean validarAntifraude();
    protected abstract void executarPagamento();

    private void registrarLog() {
        System.out.println("Log registrado para o pagamento de " + valor + " do usuário " + usuario);
    }

    private void registrarTransacao() {
        System.out.println("Transação registrada com sucesso para o usuário " + usuario);
    }
}

