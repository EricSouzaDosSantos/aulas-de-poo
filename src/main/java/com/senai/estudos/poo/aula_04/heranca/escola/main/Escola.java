package com.senai.estudos.poo.aula_04.heranca.escola.main;

import com.senai.estudos.poo.aula_04.heranca.escola.entities.Coordenadores;
import com.senai.estudos.poo.aula_04.heranca.escola.entities.Professores;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Escola {
    static List<Professores> listaDeProfessores = new ArrayList<>();
    static List<Coordenadores> listaDeCoordenadores = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        byte optionSwitch = 0;
        do {
            try {
                System.out.println("Digite a opção que você deseja:");
                System.out.println("1 - Cadastrar um funcionario");
                System.out.println("2 - Listar Algum funcionario");
                System.out.println("3 - Sair");
                optionSwitch = scanner.nextByte();
                scanner.nextLine();

                switch (optionSwitch) {
                    case 1:
                        System.out.println("Digite o tipo de funcionario que deseja cadastrar: ");
                        System.out.println("1 - Professor");
                        System.out.println("2 - Coordenador");
                        byte tipoFuncionario = scanner.nextByte();
                        scanner.nextLine();
                        if (tipoFuncionario == 1) {
                            cadastrarProfessor();
                        } else if (tipoFuncionario == 2) {
                            cadastrarCoordenadores();
                        } else {
                            System.out.println("Opção inválida.");
                        }
                        break;
                    case 2:
                        System.out.println("Digite o tipo de funcionario que deseja listar: ");
                        System.out.println("1 - Professores");
                        System.out.println("2 - Coordenadores");
                        byte tipoListar = scanner.nextByte();
                        scanner.nextLine();
                        if (tipoListar == 1) {
                            listarProfessores();
                        } else if (tipoListar == 2) {
                            listarCoordenadores();
                        } else {
                            System.out.println("Opção inválida.");
                        }
                        break;
                    case 3:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite um número válido.");
                scanner.nextLine();
            }
        } while (optionSwitch != 3);
    }

    static void cadastrarProfessor() {
        System.out.println("Digite o nome do professor:");
        String nome = scanner.nextLine();
        System.out.println("Digite o salario do professor:");
        double salario = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Digite a disciplina do professor:");
        String disciplina = scanner.nextLine();
        Professores professor = new Professores(nome, salario, disciplina);
        listaDeProfessores.add(professor);
        System.out.println("Professor cadastrado com sucesso.");
    }

    static void cadastrarCoordenadores() {
        if (!listaDeProfessores.isEmpty()) {
            System.out.println("Digite o nome do coordenador:");
            String nome = scanner.nextLine();
            System.out.println("Digite o salario do coordenador:");
            double salario = scanner.nextDouble();
            scanner.nextLine();
            int listaQuantidadeDeProfessor = listaDeProfessores.size();
            byte quantidadeDeProfessores = 0;
            do {
            System.out.println("Quantos professores deseja adicionar:");
                quantidadeDeProfessores = scanner.nextByte();
                scanner.nextLine();
                if (quantidadeDeProfessores > listaQuantidadeDeProfessor) {
                    System.out.println("A quantidade de professores é menor que a quantidade que deseja adicionar.");
                }
            }while (listaQuantidadeDeProfessor < quantidadeDeProfessores);
            List<Professores> professoresDoCoordenador = new ArrayList<>();
            for (int i = 0; i < quantidadeDeProfessores; i++) {
                System.out.println("Digite o ID de um dos professores que deseja adicionar:");
                listarProfessores();
                int idProfessor = scanner.nextInt();
                scanner.nextLine();
                if (idProfessor >= 0 && idProfessor < listaDeProfessores.size()) {
                    professoresDoCoordenador.add(listaDeProfessores.get(idProfessor));
                } else {
                    System.out.println("ID inválido.");
                }
            }
            Coordenadores coordenador = new Coordenadores(nome, salario, professoresDoCoordenador);
            listaDeCoordenadores.add(coordenador);
            System.out.println("Coordenador cadastrado com sucesso.");
        } else {
            System.out.println("Você não pode salvar um coordenador sem antes salvar um professor.");
        }
    }

    static void listarProfessores() {
        if (listaDeProfessores.isEmpty()) {
            System.out.println("Não existem professores cadastrados.");
        } else {
            int indexDaLista = 0;
            for (Professores professor : listaDeProfessores) {
                System.out.println("ID: " + indexDaLista + " - " + professor);
                indexDaLista++;
            }
        }
    }

    static void listarCoordenadores() {

        if (listaDeCoordenadores.isEmpty()) {
            System.out.println("Não existem coordenadores cadastrados.");
        } else {
            for (Coordenadores coordenador : listaDeCoordenadores) {
                System.out.println(coordenador);
            }
        }
    }
}