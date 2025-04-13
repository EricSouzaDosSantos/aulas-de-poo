package com.senai.estudos.poo.aula_03.encapsulamento.conta.main;

import com.senai.estudos.poo.aula_03.encapsulamento.conta.entities.ContaBancaria;
import com.senai.estudos.poo.aula_03.encapsulamento.conta.entities.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Eric", "123.456.789.10", "20/03/2007");
        Usuario usuario1 = new Usuario("Bia", "019.876.543-21", "10/11/2005");
        Scanner scanner = new Scanner(System.in);


        ContaBancaria contaBancaria = new ContaBancaria(
                usuario,
                17.0,
                123456789,
                "Santander",
                "corrente"
        );

        ContaBancaria contaBancaria1 = new ContaBancaria(
                usuario1,
                10.0,
                987654321,
                "PicPay",
                "poupança"
        );





        System.out.println(contaBancaria.getSaldo());
        contaBancaria.setSaldo(17.81);
        System.out.println(contaBancaria.getSaldo());
        System.out.println(contaBancaria.getUsuario());

//        System.out.println("Qual quantidade deseja sacar:");
//        contaBancaria.sacar(scanner.nextDouble());
//
//        System.out.println("Qual quantidade deseja depositar");
//        contaBancaria.depositar(scanner.nextDouble());

        contaBancaria1.getSaldo();
        contaBancaria.getSaldo();
        contaBancaria1.trasnferir(5, contaBancaria);


        System.out.println(contaBancaria1.getSaldo());
        System.out.println(contaBancaria.getSaldo());

        System.out.println("Qual a quantidade deseja tranferir");
        contaBancaria.trasnferir(5.0, contaBancaria1);

        System.out.println(contaBancaria1.getSaldo());
        System.out.println(contaBancaria.getSaldo());
    }
}
