package com.senai.estudos.poo.aula_05.polimorfismo.produtos;

public class ProdutoDigital implements Produto {
    private String nome;
    private double precoBase;
    private static final double IMPOSTO = 0.05;

    public ProdutoDigital(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase + (precoBase * IMPOSTO);
    }

    @Override
    public String getDescricao() {
        return "Produto Digital: " + nome + " | Preço Final: R$ " + calcularPrecoFinal();
    }
}
