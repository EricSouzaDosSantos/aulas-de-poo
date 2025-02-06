package com.senai.aula01_class_atributo_metodos.aula_03.funcionarios.main;

import com.senai.aula01_class_atributo_metodos.aula_03.funcionarios.entities.Funcionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Funcionarios> listaDeFuncionarios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("Digite a opção que você deseja:");
            System.out.println("1 - Salvar funcionario");
            System.out.println("2 - Visualizar Funcionarios");
            System.out.println("3 - Alterar salario do funcionario");
            System.out.println("4 - Sair");
            opcao = scanner.nextInt();

        scanner.nextLine();

        switch (opcao){
            case 1:
                System.out.println("-----------------------------------------");

                System.out.println("Qual o cargo você deseja adicionar:");
                System.out.println("1 - Gerente");
                System.out.println("2 - Programador");
                System.out.println("3 - Analista");
                int opcaoFuncionario = scanner.nextInt()-1;
                scanner.nextLine();
                System.out.println("Qual o nome do funcionario:");
                String nome = scanner.nextLine();
                System.out.println("Qual o salário do funcionario:");
                double salario = scanner.nextDouble();
                Funcionarios funcionarios = new Funcionarios(nome, opcaoFuncionario, salario);
                listaDeFuncionarios.add(funcionarios);
                System.out.println("-----------------------------------------");

                break;
            case 2:
                if (listaDeFuncionarios.isEmpty()){
                    System.out.println("-----------------------------------------");
                    System.out.println("Você ainda não cadastrou nehum funcionario");
                    System.out.println("-----------------------------------------");
                }else {
                    int number = 0;
                    System.out.println("-------------------------------------");
                    for (Funcionarios funcionario : listaDeFuncionarios){
                        System.out.println("Numero do funcionario: "+number++);
                        System.out.println("Nome: "+funcionario.getNome());
                        System.out.println("Cargo: "+funcionario.getCargo());
                        System.out.println("Salario: "+funcionario.getSalario());
                        System.out.println("-------------------------------------");
                    }
                }
                break;
            case 3:
                if (listaDeFuncionarios.isEmpty()){
                    System.out.println("-----------------------------------------");
                    System.out.println("Você ainda não cadastrou nehum funcionario");
                    System.out.println("-----------------------------------------");
                }else {
                    int number = 0;
                    System.out.println("-------------------------------------");
                    for (Funcionarios funcionario : listaDeFuncionarios){
                        System.out.println("Numero do funcionario: "+number++);
                        System.out.println("Nome: "+funcionario.getNome());
                        System.out.println("Cargo: "+funcionario.getCargo());
                        System.out.println("Salario: "+funcionario.getSalario());
                        System.out.println("-------------------------------------");
                    }
                    System.out.println("Qual o numero do funcionario que você deseja dar um aumento:");
                    int numeroFuncionario = scanner.nextInt();
                    scanner.nextLine();
                    if (numeroFuncionario > listaDeFuncionarios.size()){
                        System.out.println("Esse funcionario não existe");
                    }else {
                    System.out.println("Qual o aumento percentual que você deseja dar para esse funcionario:");
                        double aumentopercentual = scanner.nextDouble();
                        Funcionarios funcionarioEncontrado = listaDeFuncionarios.get(numeroFuncionario);
                        funcionarioEncontrado.aumentoSalarial(aumentopercentual);
                        listaDeFuncionarios.set(numeroFuncionario, funcionarioEncontrado);
                    }
                }
                break;
        }
        } while (!(opcao >= 4));
    }
}
