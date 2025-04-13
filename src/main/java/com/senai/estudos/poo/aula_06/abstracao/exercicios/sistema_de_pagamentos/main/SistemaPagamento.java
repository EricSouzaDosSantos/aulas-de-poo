package com.senai.estudos.poo.aula_06.abstracao.exercicios.sistema_de_pagamentos.main;

import com.senai.estudos.poo.aula_06.abstracao.exercicios.sistema_de_pagamentos.*;


public class SistemaPagamento {
    public static void main(String[] args) {
        Pagamento pagamentoCartaoCredito = new PagamentoCartaoCredito("João", 150.75);
        testarPAgamento(pagamentoCartaoCredito);
        
        Pagamento pagamentoPIX = new PagamentoPIX("Maria", 500.00);
        testarPAgamento(pagamentoPIX);
        
        Pagamento pagamentoCarteiraDigital = new PagamentoCarteiraDigital("Carlos", 300.50);
        testarPAgamento(pagamentoCarteiraDigital);
    }
    
    
    private static void testarPAgamento(Pagamento pagamento){
        System.out.println("----------------------------------");
        pagamento.processarPagamento();
    }
}
