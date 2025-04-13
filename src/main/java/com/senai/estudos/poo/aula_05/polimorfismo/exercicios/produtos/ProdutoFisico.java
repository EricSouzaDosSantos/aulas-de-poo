package com.senai.estudos.poo.aula_05.polimorfismo.exercicios.produtos;

public class ProdutoFisico implements Produto {
    private String nome;
    private double precoBase;
    private static final double IMPOSTO = 0.15;

    public ProdutoFisico(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase + (precoBase * IMPOSTO);
    }

    @Override
    public String getDescricao() {
        return "Produto Físico: " + nome + " | Preço Final: R$ " + calcularPrecoFinal();
    }
}