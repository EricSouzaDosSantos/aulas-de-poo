package com.senai.estudos.poo.aula_05.sensor.main;

import com.senai.estudos.poo.aula_05.sensor.entities.Sensor;
import com.senai.estudos.poo.aula_05.sensor.entities.SensorTemperatura;
import com.senai.estudos.poo.aula_05.sensor.entities.SensorUmidade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaSensores {
    private static final List<Sensor> sensores = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Cadastrar Sensor de Temperatura");
            System.out.println("2. Cadastrar Sensor de Umidade");
            System.out.println("3. Listar Sensores");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> cadastrarSensorTemperatura();
                case 2 -> cadastrarSensorUmidade();
                case 3 -> listarSensores();
                case 4 -> {
                    System.out.println("Saindo...");
                    return;
                }
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private static void cadastrarSensorTemperatura() {
        System.out.print("Digite o ID do sensor: ");
        String id = scanner.nextLine();
        System.out.print("Digite a temperatura: ");
        double temperatura = scanner.nextDouble();
        scanner.nextLine();

        sensores.add(new SensorTemperatura(id, temperatura));
        System.out.println("Sensor de temperatura cadastrado com sucesso!");
    }

    private static void cadastrarSensorUmidade() {
        System.out.print("Digite o ID do sensor: ");
        String id = scanner.nextLine();
        System.out.print("Digite a umidade: ");
        double umidade = scanner.nextDouble();
        scanner.nextLine();

        sensores.add(new SensorUmidade(id, umidade));
        System.out.println("Sensor de umidade cadastrado com sucesso!");
    }

    private static void listarSensores() {
        if (sensores.isEmpty()) {
            System.out.println("Nenhum sensor cadastrado.");
        } else {
            System.out.println("\nLista de Sensores:");
            for (Sensor sensor : sensores) {
                System.out.println(sensor.reportarValor());
            }
        }
    }
}

