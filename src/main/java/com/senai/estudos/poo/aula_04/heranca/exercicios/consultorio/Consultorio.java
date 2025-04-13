package com.senai.estudos.poo.aula_04.heranca.exercicios.consultorio;

import com.senai.estudos.poo.aula_04.consultorio.entities.*;
import com.senai.estudos.poo.aula_04.heranca.exercicios.consultorio.entities.Paciente;
import com.senai.estudos.poo.aula_04.heranca.exercicios.consultorio.entities.PacienteConvenio;
import com.senai.estudos.poo.aula_04.heranca.exercicios.consultorio.entities.PacienteParticular;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Consultorio {
        static Scanner scanner = new Scanner(System.in);
        static List<Paciente> pacientes = new ArrayList<>();
    public static void main(String[] args) {
        int opcao = 0;

        do {
            try {
                System.out.println("=== Menu ===");
                System.out.println("1 - Adicionar Paciente Particular");
                System.out.println("2 - Adicionar Paciente Convênio");
                System.out.println("3 - Listar Pacientes");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o nome: ");
                        String nomeParticular = scanner.nextLine();
                        System.out.print("Digite a idade: ");
                        int idadeParticular = scanner.nextInt();
                        System.out.print("Digite o custo da consulta: R$");
                        double custoConsulta = scanner.nextDouble();
                        scanner.nextLine();
                        pacientes.add(new PacienteParticular(nomeParticular, idadeParticular, custoConsulta));
                        System.out.println("Paciente Particular adicionado com sucesso!");
                        break;

                    case 2:
                        System.out.print("Digite o nome: ");
                        String nomeConvenio = scanner.nextLine();
                        System.out.print("Digite a idade: ");
                        int idadeConvenio = scanner.nextInt();
                        System.out.print("Digite o desconto no custo (%): ");
                        double desconto = scanner.nextDouble();
                        scanner.nextLine();
                        pacientes.add(new PacienteConvenio(nomeConvenio, idadeConvenio, desconto));
                        System.out.println("Paciente Convênio adicionado com sucesso!");
                        break;

                    case 3:
                        System.out.println("\n=== Lista de Pacientes ===");
                        if (pacientes.isEmpty()) {
                            System.out.println("Nenhum paciente cadastrado.");
                        } else {
                            for (Paciente paciente : pacientes) {
                                System.out.println(paciente);
                            }
                        }
                        break;

                    case 0:
                        System.out.println("Encerrando o sistema...");
                        break;

                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite um número válido.");
                scanner.nextLine();
            }
        } while (opcao != 0);

//        scanner.close();
    }
}



