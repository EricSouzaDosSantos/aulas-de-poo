package com.senai.estudos.poo.aula_06.abstracao.exemplos.classes_abstratas.gerenciamento_contas.main;

import com.senai.estudos.poo.aula_06.abstracao.exemplos.classes_abstratas.gerenciamento_contas.entities.Conta;
import com.senai.estudos.poo.aula_06.abstracao.exemplos.classes_abstratas.gerenciamento_contas.entities.ContaCorrente;
import com.senai.estudos.poo.aula_06.abstracao.exemplos.classes_abstratas.gerenciamento_contas.entities.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente("Eric", 2000);
        Conta contaPoupanca = new ContaPoupanca("Eric", 4000);
        System.out.println("Teste da conta corrente");
        testeContas(contaCorrente);
        System.out.println("Teste da conta poupanca");
        testeContas(contaPoupanca);

    }
    private static void testeContas(Conta conta){
        System.out.println("--------------Testando as Contas-----------------");
        System.out.println("Antes");
        conta.exibirSaldo();
        conta.aplicarTaxaMensal();
        System.out.println("Depois");
        conta.exibirSaldo();
    }
}
