package com.senai.estudos.poo.aula_05.polimorfismo.exercicios.relatorios.entities;

public class RelatorioPDF extends Relatorio {
    public RelatorioPDF(String nome) {
        super(nome);
    }

    @Override
    public void gerar() {
        System.out.println("Gerando relatório PDF: " + nome);
    }
}