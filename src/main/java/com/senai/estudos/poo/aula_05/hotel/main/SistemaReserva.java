package com.senai.estudos.poo.aula_05.hotel.main;

import com.senai.estudos.poo.aula_05.hotel.entitites.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaReserva {
    private static List<Reserva> reservas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n=== Menu de Reservas ===");
            System.out.println("1 - Criar Reserva Simples");
            System.out.println("2 - Criar Reserva VIP");
            System.out.println("3 - Listar Reservas");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    criarReservaSimples();
                    break;
                case 2:
                    criarReservaVIP();
                    break;
                case 3:
                    listarReservas();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 4);
    }

    private static void criarReservaSimples() {
        System.out.print("Nome da reserva: ");
        String nome = scanner.nextLine();
        System.out.print("Quantidade de dias: ");
        int dias = scanner.nextInt();
        reservas.add(new ReservaSimples(nome, dias));
        System.out.println("Reserva Simples criada com sucesso!");
    }

    private static void criarReservaVIP() {
        System.out.print("Nome da reserva: ");
        String nome = scanner.nextLine();
        System.out.print("Quantidade de dias: ");
        int dias = scanner.nextInt();
        reservas.add(new ReservaVIP(nome, dias));
        System.out.println("Reserva VIP criada com sucesso!");
    }

    private static void listarReservas() {
        if (reservas.isEmpty()) {
            System.out.println("Nenhuma reserva cadastrada.");
        } else {
            System.out.println("\n=== Lista de Reservas ===");
            for (Reserva reserva : reservas) {
                System.out.println(reserva);
            }
        }
    }
}