package com.senai.aula01_class_atributo_metodos.aula_03.produto.entities;

public class Produto {

    private String nome;
    private double preco;

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
        if (preco <= 0) {
            System.out.println("não aceitamos valor negativo");
        } else {
            this.preco = preco;
        }
    }
}
