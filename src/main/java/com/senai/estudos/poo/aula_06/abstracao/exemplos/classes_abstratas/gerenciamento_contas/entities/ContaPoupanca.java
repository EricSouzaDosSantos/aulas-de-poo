package com.senai.estudos.poo.aula_06.abstracao.exemplos.classes_abstratas.gerenciamento_contas.entities;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void aplicarTaxaMensal() {
        saldo += saldo * 0.05;
    }
}
