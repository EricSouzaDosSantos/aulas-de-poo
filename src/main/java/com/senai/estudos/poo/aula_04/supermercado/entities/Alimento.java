package com.senai.estudos.poo.aula_04.supermercado.entities;

public class Alimento extends Produto {
    private String dataValidade;

    public Alimento(String nome, double preco, short quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public void exibirAlimento() {
        super.exibirProduto();
        System.out.println("Data de validade: " + dataValidade);
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return"Nome: "+super.getNome()+", Preço: R$"+super.getPreco()+", Quantidade: "+super.getQuantidade()+ "data de validade: "+dataValidade;
    }


}
