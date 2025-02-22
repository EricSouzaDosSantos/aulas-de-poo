package com.senai.estudos.poo.aula_04.supermercado.main;

import com.senai.estudos.poo.aula_04.supermercado.entities.Alimento;
import com.senai.estudos.poo.aula_04.supermercado.entities.Eletronico;
import com.senai.estudos.poo.aula_04.supermercado.entities.Produto;

import java.util.*;

public class Supermercado {

    public static Scanner scanner = new Scanner(System.in);
    public static List<Produto> listaDeProdutos = new ArrayList<>();
    public static List<Alimento> listaDeAlimentos = new ArrayList<>();
    public static List<Eletronico> listaDeEletronicos = new ArrayList<>();
    public static List<Produto> todosProdutos = new ArrayList<>();

    public static void main(String[] args) {

        byte opcao = 0;
        do {
            try {
                System.out.println("Supermercado");
                System.out.println("Digite a opção desejada:");
                System.out.println("1 - Cadastrar produto");
                System.out.println("2 - Listar produtos");
                System.out.println("3 - Sair");
                opcao = scanner.nextByte();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        byte productOption = 0;
                        System.out.println("O que deseja cadastrar?");
                        System.out.println("1 - Alimento");
                        System.out.println("2 - Eletrônico");
                        System.out.println("3 - Outros");
                        productOption = scanner.nextByte();
                        scanner.nextLine();
                        if (productOption == 1) {
                            cadastrarAlimento();
                        } else if (productOption == 2) {
                            cadastrarEletronico();
                        } else if (productOption == 3) {
                            cadastrarProduto();
                        } else {
                            System.out.println("Opção inválida");
                        }

                        break;

                    case 2:
                        byte listOption = 0;
                        System.out.println("O que deseja listar:");
                        System.out.println("1 - Todos os Produtos");
                        System.out.println("2 - Alimentos");
                        System.out.println("3 - Eletrônicos");
                        System.out.println("4 - Outros");
                        listOption = scanner.nextByte();
                        scanner.nextLine();

                        if (listOption == 1) {
                            listarProdutos();
                        } else if (listOption == 2) {
                            listarAlimentos();
                        } else if (listOption == 3) {
                            listarEletronicos();
                        } else if (listOption == 4) {
                            listarOutros();
                        } else {
                            System.out.println("Opção inválida");
                        }

                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite um número válido.");
                scanner.nextLine();
            }
        } while (!(opcao == 3));
    }

    public static void listarOutros() {
        if (listaDeProdutos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado");
        } else {
            for (Produto produto : listaDeProdutos) {
                produto.exibirProduto();
            }
        }
    }

    public static void listarAlimentos() {
        if (listaDeAlimentos.isEmpty()) {
            System.out.println("Nenhum alimento cadastrado");
        } else {
            for (Alimento alimento : listaDeAlimentos) {
                alimento.exibirAlimento();
            }
        }
    }

    public static void listarEletronicos() {
        if (listaDeEletronicos.isEmpty()) {
            System.out.println("Nenhum eletrônico cadastrado");
        }else {
            for (Eletronico eletronico : listaDeEletronicos) {
                eletronico.exibirEletronico();
            }
        }
    }

    public static void listarProdutos() {
        if (todosProdutos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado");
        } else {
            for (Object object : todosProdutos) {
                System.out.println(object.toString());
            }
        }
    }

    public static void cadastrarProduto() {
        System.out.println("Digite o nome do produto:");
        String nome = scanner.nextLine();
        System.out.println("Digite o preço do produto:");
        double preco = scanner.nextDouble();
        System.out.println("Digite a quantidade do produto:");
        short quantidade = scanner.nextShort();
        Produto produto = new Produto(nome, preco, quantidade);
        listaDeProdutos.add(produto);
        todosProdutos.add(produto);
    }

    public static void cadastrarAlimento() {
        System.out.println("Digite o nome do alimento:");
        String nomeAlimento = scanner.nextLine();
        System.out.println("Digite o preço do alimento:");
        double preco = scanner.nextDouble();
        System.out.println("Digite a quantidade do alimento:");
        short quantidade = scanner.nextShort();
        scanner.nextLine();
        System.out.println("Digite a data de validade do alimento:");
        String dataValidade = scanner.nextLine();
        Alimento alimento = new Alimento(nomeAlimento, preco, quantidade, dataValidade);
        listaDeAlimentos.add(alimento);
        todosProdutos.add(alimento);
    }

    public static void cadastrarEletronico() {
        System.out.println("Digite o nome do eletrônico:");
        String nomeEletronico = scanner.nextLine();
        System.out.println("Digite o preço do eletrônico:");
        double preco = scanner.nextDouble();
        System.out.println("Digite a quantidade do eletrônico:");
        short quantidade = scanner.nextShort();
        System.out.println("Digite a voltagem do eletrônico:");
        int voltagem = scanner.nextInt();
        Eletronico eletronico = new Eletronico(nomeEletronico, preco, quantidade, voltagem);
        listaDeEletronicos.add(eletronico);
        todosProdutos.add(eletronico);
    }
}
