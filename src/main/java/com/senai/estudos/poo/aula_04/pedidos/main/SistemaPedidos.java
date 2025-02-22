package com.senai.estudos.poo.aula_04.pedidos.main;

import com.senai.estudos.poo.aula_04.pedidos.entities.*;

import java.util.Scanner;

public class SistemaPedidos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try{
            System.out.println("\nMenu de Pedidos:");
            System.out.println("1 - Criar Pedido Online");
            System.out.println("2 - Criar Pedido Presencial");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 3) {
                System.out.println("Saindo...");
                break;
            } else if (opcao > 3 || opcao < 0) {
                System.out.println("Opção inválida!");
                continue;
            }

                System.out.print("Número do pedido: ");
            int numero = scanner.nextInt();
            System.out.print("Valor total do pedido: R$");
            double valorTotal = scanner.nextDouble();

            if (opcao == 1) {
                System.out.print("Taxa de entrega: R$");
                double taxaEntrega = scanner.nextDouble();
                Pedido pedido = new PedidoOnline(numero, valorTotal, taxaEntrega);
                pedido.exibirDetalhes();
            } else if (opcao == 2) {
                System.out.print("Desconto para pagamento à vista: R$");
                double desconto = scanner.nextDouble();
                Pedido pedido = new PedidoPresencial(numero, valorTotal, desconto);
                pedido.exibirDetalhes();
            }
        }
        catch (Exception e){
            System.out.println("Digite um número válido.");
            scanner.nextLine();
        }
        }

        scanner.close();
    }
}
