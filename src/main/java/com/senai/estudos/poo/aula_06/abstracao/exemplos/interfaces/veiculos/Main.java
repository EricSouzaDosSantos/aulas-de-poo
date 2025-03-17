package com.senai.estudos.poo.aula_06.abstracao.exemplos.interfaces.veiculos;

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro();

        carro.acelerar();
        carro.frear();
        carro.buzinar();

    }
}
