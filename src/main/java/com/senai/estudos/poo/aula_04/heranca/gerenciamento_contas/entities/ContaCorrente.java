package com.senai.estudos.poo.aula_04.heranca.gerenciamento_contas.entities;

public class ContaCorrente extends  Conta{
    private double limite;

    public ContaCorrente(String titular, double saldo, double limite) {
        super(titular, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= (super.getSaldo() + limite)) {
            super.setSaldo(valor);
        }else {
            System.out.println("Saldo insuficiente");
        }
    }
}
