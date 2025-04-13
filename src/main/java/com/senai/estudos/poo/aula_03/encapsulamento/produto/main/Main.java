package com.senai.estudos.poo.aula_03.encapsulamento.produto.main;

import com.senai.estudos.poo.aula_03.encapsulamento.produto.entities.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto();
        List<Produto> listaDeProdutos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {

            System.out.println("digite o que você deseja fazer:");
            System.out.println("1 - Criar produto");
            System.out.println("2 - Ver produtos");
            System.out.println("3 - deletar produtos");
            opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {

            case 1:
                System.out.println("Digite o nome do produto");
                produto.setNome(scanner.nextLine());
                System.out.println("Digite o preço do produto");
                produto.setPreco(scanner.nextDouble());
                listaDeProdutos.add(produto);
                break;

            case 2:
                if (!listaDeProdutos.isEmpty()) {
                    System.out.println("Lista de produtos:");
                    System.out.println("----------------------------------------");
                    for (Produto produtos : listaDeProdutos) {
                        System.out.println("nome do produto: " + produtos.getNome());
                        System.out.println("Preço do produto: " + produtos.getPreco());
                        System.out.println("----------------------------------------");
                    }
                } else {
                    System.out.println("Você ainda não cadastrou nenhum produto");
                }
                break;

            case 3:
                if (!listaDeProdutos.isEmpty()) {
                    System.out.println("Qual o nome do produto que você deseja deletar");
                    String nome = scanner.nextLine();
                    for (Produto produtos : listaDeProdutos) {
                        if (produtos.getNome().equals(nome)) {
                            listaDeProdutos.remove(produtos);
                        }
                    }
                } else {
                    System.out.println("Você ainda não cadastrou nenhum produto");
                }
                break;

            default:
                System.out.println("opção indisponível");
        }
        } while (!(opcao >= 4));

    }
}
