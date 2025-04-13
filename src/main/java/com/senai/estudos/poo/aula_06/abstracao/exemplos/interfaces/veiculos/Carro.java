package com.senai.estudos.poo.aula_06.abstracao.exemplos.interfaces.veiculos;

public class Carro implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Carro acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("Carro freando...");
    }

    @Override
    public void buzinar() {
        System.out.println("Carro buzinando...");
    }
}
