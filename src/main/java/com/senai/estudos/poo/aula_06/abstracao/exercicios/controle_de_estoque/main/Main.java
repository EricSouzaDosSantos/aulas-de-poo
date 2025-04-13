package com.senai.estudos.poo.aula_06.abstracao.exercicios.controle_de_estoque.main;

import com.senai.estudos.poo.aula_06.abstracao.exercicios.controle_de_estoque.BicicletaEntrega;
import com.senai.estudos.poo.aula_06.abstracao.exercicios.controle_de_estoque.MotoEntrega;
import com.senai.estudos.poo.aula_06.abstracao.exercicios.controle_de_estoque.VeiculoEntrega;

public class Main {
    public static void main(String[] args) {
        MotoEntrega moto = new MotoEntrega(60, 20, 30);
        testarVeiculo(moto);

        BicicletaEntrega bicicleta = new BicicletaEntrega(20, 10, 10);
        testarVeiculo(bicicleta);

    }

    private static void testarVeiculo(VeiculoEntrega veiculoEntrega){
        System.out.println("--------------------------------------");
        if (veiculoEntrega instanceof MotoEntrega){
            System.out.println("Detalhes da Moto de Entrega:");
        }else {
            System.out.println("Detalhes da Bicicleta de Entrega:");
        }
        veiculoEntrega.exibirDetalhes();
    }
}

