package com.senai.estudos.poo.aula_04.supermercado.entities;

public class Produto {
    private String nome;
    private double preco;
    private short quantidade;

    public Produto(String nome, double preco, short quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirProduto(){
        System.out.println("Nome: "+nome+", Preço: R$"+preco+", Quantidade: "+quantidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public short getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(short quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return"Nome: "+nome+", Preço: R$"+preco+", Quantidade: "+quantidade;
    }
}
