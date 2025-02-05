package com.senai.aula01_class_atributo_metodos.aula_01.alunos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Aluno> aluno = new ArrayList<>();
        int opcao;
        do{
            System.out.println("----------------Gerenciamento de alunos-------------------");
            System.out.println("Digite qual das opções abaixo você deseja:");
            System.out.println("1 - Criar aluno");
            System.out.println("2 - atualizar nota");
            System.out.println("3 - informações de todos alunos");
            System.out.println("4 - situação escolar");
            System.out.println("5 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Digite o nome do aluno(a):");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a idade do aluno(a):");
                    int idade = scanner.nextInt();
                    System.out.println("Digite a nota do aluno(a):");
                    double nota = scanner.nextDouble();
                    Aluno novoAluno = new Aluno(nome, idade, nota);
                    aluno.add(novoAluno);
                    break;
                case 2:
                    int index = 0;
                    int indexAluno = 0;
                    System.out.println("Qual dos alunos vocÊ deseja atualizar:");
                    for (Aluno alunos : aluno) {
                        System.out.println(index + " - " + alunos.getNome());
                        alunos.informacoesAluno();
                        index++;

                    }
                    System.out.print("Digite aqui: ");
                    indexAluno = scanner.nextInt();
                    Aluno meuAluno = aluno.get(indexAluno);
                    System.out.println("Nota atual: "+meuAluno.getNota());
                    System.out.println("Qual o novo valor da nota do aluno(a): ");
                    double novaNota = scanner.nextDouble();
                    meuAluno.atualizarNota(novaNota);
                    System.out.println("Nota atualizada com sucesso");
                    break;
                case 3:
                    int numero = 0;
                    for (Aluno alunos : aluno) {
                        System.out.println("Todos alunos caddastrados:");
                        System.out.println(numero + " - " + alunos.getNome());
                        alunos.informacoesAluno();
                    }
                    break;
                case 4:
                    index = 0;
                    indexAluno = 0;
                    System.out.println("Qual dos alunos você deseja ver a situação escolar:");
                    for (Aluno alunos : aluno) {
                        System.out.println(index + " - " + alunos.getNome());
                        alunos.informacoesAluno();
                        index++;

                    }
                    System.out.print("Digite aqui: ");
                    indexAluno = scanner.nextInt();
                    meuAluno = aluno.get(indexAluno);
                    System.out.println("situação escolar atual: "+ (meuAluno.verificarAprovacao(meuAluno.getNota()) ? "aprovado(a)" : "reprovado(a)"));

                    break;
            }

        }while (!(opcao == 5));


    }
}
