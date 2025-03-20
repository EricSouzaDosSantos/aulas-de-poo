package com.senai.estudos.poo.aula_06.abstracao.exemplos.classes_abstratas.gerenciamento_contas.entities;

public class ContaCorrente extends Conta{
    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void aplicarTaxaMensal() {
        saldo -= 20;
    }
}
