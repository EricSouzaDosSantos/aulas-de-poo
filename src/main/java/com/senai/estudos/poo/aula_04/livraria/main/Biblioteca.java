package com.senai.estudos.poo.aula_04.livraria.main;

import com.senai.estudos.poo.aula_04.livraria.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    private static final List<Livro> livros = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Livro Físico");
            System.out.println("2. Adicionar Livro Digital");
            System.out.println("3. Listar Livros");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarLivroFisico();
                    break;
                case 2:
                    adicionarLivroDigital();
                    break;
                case 3:
                    listarLivros();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void adicionarLivroFisico() {
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("Número de páginas: ");
        int paginas = scanner.nextInt();
        scanner.nextLine();

        livros.add(new LivroFisico(titulo, autor, paginas));
        System.out.println("Livro físico adicionado com sucesso!");
    }

    private static void adicionarLivroDigital() {
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("Tamanho do arquivo (MB): ");
        double tamanho = scanner.nextDouble();
        scanner.nextLine();

        livros.add(new LivroDigital(titulo, autor, tamanho));
        System.out.println("Livro digital adicionado com sucesso!");
    }

    private static void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            System.out.println("\nLista de Livros:");
            for (Livro livro : livros) {
                System.out.println(livro);
            }
        }
    }
}
