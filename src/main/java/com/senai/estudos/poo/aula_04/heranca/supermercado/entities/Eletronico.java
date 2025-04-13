package com.senai.estudos.poo.aula_04.heranca.supermercado.entities;

public class Eletronico extends Produto {
    private int voltagem;

    public Eletronico(String nome, double preco, short quantidade, int voltagem) {
        super(nome, preco, quantidade);
        this.voltagem = voltagem;
    }

    public void exibirEletronico() {
        super.exibirProduto();
        System.out.println("Voltagem: " + voltagem);
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    @Override
    public String toString() {
        return"Nome: "+super.getNome()+", Preço: R$"+super.getPreco()+", Quantidade: "+super.getQuantidade()+ "voltagem: "+voltagem;
    }
}
