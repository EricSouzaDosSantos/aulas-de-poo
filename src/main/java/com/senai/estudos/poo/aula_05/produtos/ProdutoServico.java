package com.senai.estudos.poo.aula_05.produtos;

public class ProdutoServico implements Produto {
    private String nome;
    private double precoBase;
    private static final double IMPOSTO = 0.20;

    public ProdutoServico(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase + (precoBase * IMPOSTO);
    }

    @Override
    public String getDescricao() {
        return "Produto Serviço: " + nome + " | Preço Final: R$ " + calcularPrecoFinal();
    }
}

