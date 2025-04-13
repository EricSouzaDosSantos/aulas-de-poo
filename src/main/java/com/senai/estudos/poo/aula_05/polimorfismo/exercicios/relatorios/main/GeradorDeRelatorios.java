package com.senai.estudos.poo.aula_05.polimorfismo.exercicios.relatorios.main;

import com.senai.estudos.poo.aula_05.polimorfismo.exercicios.relatorios.entities.Relatorio;
import com.senai.estudos.poo.aula_05.polimorfismo.exercicios.relatorios.entities.RelatorioCSV;
import com.senai.estudos.poo.aula_05.polimorfismo.exercicios.relatorios.entities.RelatorioJSON;
import com.senai.estudos.poo.aula_05.polimorfismo.exercicios.relatorios.entities.RelatorioPDF;
import com.senai.estudos.poo.aula_05.relatorios.entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GeradorDeRelatorios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Relatorio> relatorios = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu Interativo:");
            System.out.println("1. Criar Relatório");
            System.out.println("2. Listar Relatórios");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    criarRelatorio(scanner, relatorios);
                    break;
                case 2:
                    listarRelatorios(relatorios);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void criarRelatorio(Scanner scanner, List<Relatorio> relatorios) {
        System.out.print("Digite o nome do relatório: ");
        String nome = scanner.nextLine();

        System.out.println("Escolha o formato:");
        System.out.println("1 - PDF");
        System.out.println("2 - CSV");
        System.out.println("3 - JSON");
        System.out.print("Opção: ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        Relatorio relatorio;
        switch (tipo) {
            case 1:
                relatorio = new RelatorioPDF(nome);
                break;
            case 2:
                relatorio = new RelatorioCSV(nome);
                break;
            case 3:
                relatorio = new RelatorioJSON(nome);
                break;
            default:
                System.out.println("Tipo inválido!");
                return;
        }

        relatorios.add(relatorio);
        System.out.println("Relatório criado com sucesso!");
    }

    private static void listarRelatorios(List<Relatorio> relatorios) {
        if (relatorios.isEmpty()) {
            System.out.println("Nenhum relatório criado ainda.");
            return;
        }
        System.out.println("\nLista de Relatórios:");
        for (int i = 0; i < relatorios.size(); i++) {
            System.out.println((i + 1) + ". " + relatorios.get(i).getNome());
        }
    }
}
