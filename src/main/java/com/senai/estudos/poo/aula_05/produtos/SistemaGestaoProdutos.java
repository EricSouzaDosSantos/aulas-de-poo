package com.senai.estudos.poo.aula_05.produtos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaGestaoProdutos {
    private static List<Produto> produtos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n=== Menu de Gestão de Produtos ===");
            System.out.println("1. Criar Produto Físico");
            System.out.println("2. Criar Produto Digital");
            System.out.println("3. Criar Produto Serviço");
            System.out.println("4. Listar Produtos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    criarProdutoFisico();
                    break;
                case 2:
                    criarProdutoDigital();
                    break;
                case 3:
                    criarProdutoServico();
                    break;
                case 4:
                    listarProdutos();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 5);
    }

    private static void criarProdutoFisico() {
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Preço base: R$ ");
        double preco = scanner.nextDouble();
        produtos.add(new ProdutoFisico(nome, preco));
        System.out.println("Produto Físico criado com sucesso!");
    }

    private static void criarProdutoDigital() {
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Preço base: R$ ");
        double preco = scanner.nextDouble();
        produtos.add(new ProdutoDigital(nome, preco));
        System.out.println("Produto Digital criado com sucesso!");
    }

    private static void criarProdutoServico() {
        System.out.print("Nome do serviço: ");
        String nome = scanner.nextLine();
        System.out.print("Preço base: R$ ");
        double preco = scanner.nextDouble();
        produtos.add(new ProdutoServico(nome, preco));
        System.out.println("Produto Serviço criado com sucesso!");
    }

    private static void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            System.out.println("\n=== Lista de Produtos ===");
            for (Produto produto : produtos) {
                System.out.println(produto.getDescricao());
            }
        }
    }
}

