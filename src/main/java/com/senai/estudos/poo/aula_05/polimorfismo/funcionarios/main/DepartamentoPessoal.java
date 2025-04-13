package com.senai.estudos.poo.aula_05.polimorfismo.funcionarios.main;

import com.senai.estudos.poo.aula_05.polimorfismo.funcionarios.entities.Beneficio;
import com.senai.estudos.poo.aula_05.polimorfismo.funcionarios.entities.ValeAlimentacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepartamentoPessoal {
    private static List<Beneficio> beneficioList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n=== Menu de Reservas ===");
            System.out.println("1 - Criar Beneficios Vale Alimentação");
            System.out.println("2 - Criar Beneficio de Plano de Saúde");
            System.out.println("3 - Criar Beneficio de Vale Transporte");
            System.out.println("4 - Listar Todos os Beneficios");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    criarBeneficoVA();
                    break;
                case 2:
                    criarBeneficoPS();
                    break;
                case 3:
                    criarBeneficoVT();
                    break;
                case 4:
                    listarBeneficios();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 5);
    }

    private static void criarBeneficoVA() {
        System.out.print("Nome do funcionario que vai receber: ");
        String nome = scanner.nextLine();
        System.out.print("Salario do funcionario: ");
        double salario = scanner.nextDouble();
        Beneficio beneficioVA = new ValeAlimentacao(nome, salario);
        beneficioList.add(beneficioVA);
        System.out.println("Salario do funcionario com desconto do vale alimentação: " + beneficioVA.descontoSalarial(salario));
    }

    private static void criarBeneficoPS() {
        System.out.print("Nome do funcionario que vai receber: ");
        String nome = scanner.nextLine();
        System.out.print("Salario do funcionario: ");
        double salario = scanner.nextDouble();
        Beneficio beneficioVA = new ValeAlimentacao(nome, salario);
        beneficioList.add(beneficioVA);
        System.out.println("Salario do funcionario com desconto do plano de saúde: " + beneficioVA.descontoSalarial(salario));
    }

    private static void criarBeneficoVT() {
        System.out.print("Nome do funcionario que vai receber: ");
        String nome = scanner.nextLine();
        System.out.print("Salario do funcionario: ");
        double salario = scanner.nextDouble();
        Beneficio beneficioVA = new ValeAlimentacao(nome, salario);
        beneficioList.add(beneficioVA);
        System.out.println("Salario do funcionario com desconto do vale transporte: " + beneficioVA.descontoSalarial(salario));
    }

    private static void listarBeneficios() {
        if (beneficioList.isEmpty()) {
            System.out.println("Nenhum beneficio cadastrado.");
        } else {
            System.out.println("\n=== Lista de Reservas ===");
            for (Beneficio beneficio : beneficioList) {
                System.out.println(beneficio.toString());
            }
        }
    }
}
