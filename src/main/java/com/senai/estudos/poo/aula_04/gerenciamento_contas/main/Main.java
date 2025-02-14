package com.senai.estudos.poo.aula_04.gerenciamento_contas.main;

import com.senai.estudos.poo.aula_04.gerenciamento_contas.entities.Conta;
import com.senai.estudos.poo.aula_04.gerenciamento_contas.entities.ContaCorrente;
import com.senai.estudos.poo.aula_04.gerenciamento_contas.entities.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
         Conta conta = new Conta("João", 1000);
         conta.depositar(500);
         conta.sacar(200);
         conta.exibirSaldo();

         ContaCorrente contaCorrente = new ContaCorrente("Maria", 1000, 500);
         contaCorrente.depositar(500);
         contaCorrente.sacar(200);
         contaCorrente.exibirSaldo();

         ContaPoupanca contaPoupanca = new ContaPoupanca("José", 1000, 0.1);
         contaPoupanca.depositar(500);
         contaPoupanca.sacar(200);
         contaPoupanca.aplicarRendimento();
         contaPoupanca.exibirSaldo();

    }
}
