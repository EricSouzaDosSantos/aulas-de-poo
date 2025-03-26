package com.senai.estudos.poo.aula_06.abstracao.exercicios.sistema_de_pagamentos.main;

import com.senai.estudos.poo.aula_06.abstracao.exercicios.sistema_de_pagamentos.*;


public class SistemaPagamento {
    public static void main(String[] args) {
        Pagamento pagamento1 = new PagamentoCartaoCredito("João", 150.75);
        pagamento1.processarPagamento();

        System.out.println();

        Pagamento pagamento2 = new PagamentoPIX("Maria", 500.00);
        pagamento2.processarPagamento();

        System.out.println();

        Pagamento pagamento3 = new PagamentoCarteiraDigital("Carlos", 300.50);
        pagamento3.processarPagamento();
    }
}
