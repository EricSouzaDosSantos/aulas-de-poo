package com.senai.estudos.poo.aula_04.escola.main;

import com.senai.estudos.poo.aula_04.escola.entities.Coordenadores;
import com.senai.estudos.poo.aula_04.escola.entities.Professores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Escola {
    static List<Professores> listaDeProfessores = new ArrayList<>();
    static List<Coordenadores> listaDeCoordenadores = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        byte optionSwitch = 0;

        do {
            System.out.println("Digite a opção que você deseja:");
            System.out.println("1 - Cadastrar um funcionario");
            System.out.println("2 - Listar Algum funcionario");
            System.out.println("3 - Sair");
            optionSwitch = scanner.nextByte();
            scanner.nextLine();

            switch (optionSwitch){
                case 1:
                    System.out.println("Digite o tipo de funcionario que deseja cadastrar: ");
                    System.out.println("1 - ");
                    break;
            }

        }while (!(optionSwitch == 3));

    }

    static void cadastrarProfessor(){
        System.out.println("Digite o nome do professor:");
        String nome = scanner.nextLine();
        System.out.println("Digite o salario do professor:");
        double salario = scanner.nextDouble();
        System.out.println("Digite a disciplina do professor:");
        String disciplina = scanner.nextLine();
    }

    static void cadastrarCoordenadores(){
        if (listaDeProfessores.isEmpty()) {
            System.out.println("Digite o nome do professor:");
            String nome = scanner.nextLine();
            System.out.println("Digite o salario do professor:");
            double salario = scanner.nextDouble();
            System.out.println("quantos professores deseja adicionar:");
            byte quantidadeDeProfessores = scanner.nextByte();
            for (int i = 0; i < quantidadeDeProfessores; i++) {
                System.out.println("Digite o ID de um dos professores que deseja adicionar:");
                listarProfessores();
            }
        }else {
            System.out.println("Você não pode salvar um coordenador sem antes salvar um professor");
        }
    }

    static void listarProfessores(){
        if (listaDeProfessores.isEmpty()){
            System.out.println("Não existem professores cadastrados");
        }else {
            int indexDaLista = 0;
            for (Professores professores : listaDeProfessores) {
                System.out.println("ID: " + indexDaLista);
                indexDaLista++;
                professores.toString();
            }
        }
    }

    static void listarCoordenadores(){
        if (listaDeCoordenadores.isEmpty()){
            System.out.println("Não existem coordenadores cadastrados");
        }else {
            for (Coordenadores coordenador : listaDeCoordenadores){
                coordenador.toString();
            }
        }
    }
}
