package com.senai.estudos.poo.aula_02.Exercicio01;

public class principal {
    public static void main(String[] args) {
        Produto produto1= new Produto("Peixe",17.99,15);

        produto1.exibirDetalhes();
        produto1.atualizaEstoque(-5);
        produto1.calcularValorEstoque();

        System.out.println("");

        Produto produto2= new Produto("Desodorante",5.99, 23);

        produto2.exibirDetalhes();
        produto2.atualizaEstoque(0);
        produto2.calcularValorEstoque();

    }


}
