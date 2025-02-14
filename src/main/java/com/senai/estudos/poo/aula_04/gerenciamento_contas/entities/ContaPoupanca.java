package com.senai.estudos.poo.aula_04.gerenciamento_contas.entities;

public class ContaPoupanca extends Conta{
    private double taxaRendimento;

    public ContaPoupanca(String titular, double saldo, double taxaRendimento) {
        super(titular, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento(){
        super.depositar(super.getSaldo() * taxaRendimento);
    }
}
