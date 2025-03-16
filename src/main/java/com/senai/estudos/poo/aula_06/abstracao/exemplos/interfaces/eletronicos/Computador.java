package com.senai.estudos.poo.aula_06.abstracao.exemplos.interfaces.eletronicos;

public class Computador implements Eletronico {

    @Override
    public void ligar() {
        System.out.println("Computador Ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Computador Desligado");
    }
}
