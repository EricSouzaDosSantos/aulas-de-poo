package com.senai.estudos.poo.aula_06.abstracao.exemplos.interfaces.eletronicos;

public class TV implements Eletronico {
    @Override
    public void ligar() {
        System.out.println("TV Ligada");
    }

    @Override
    public void desligar() {
        System.out.println("TV Desligada");
    }
}
