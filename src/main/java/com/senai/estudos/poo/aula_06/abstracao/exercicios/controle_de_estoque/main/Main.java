package com.senai.estudos.poo.aula_06.abstracao.exercicios.controle_de_estoque.main;

import com.senai.estudos.poo.aula_06.abstracao.exercicios.controle_de_estoque.BicicletaEntrega;
import com.senai.estudos.poo.aula_06.abstracao.exercicios.controle_de_estoque.MotoEntrega;

public class Main {
    public static void main(String[] args) {
        MotoEntrega moto = new MotoEntrega(60, 20, 30);
        BicicletaEntrega bicicleta = new BicicletaEntrega(20, 10, 10);

        System.out.println("Detalhes da Moto de Entrega:");
        moto.exibirDetalhes();
        System.out.println();

        System.out.println("Detalhes da Bicicleta de Entrega:");
        bicicleta.exibirDetalhes();
    }
}

