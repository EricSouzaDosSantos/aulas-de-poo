package com.senai.estudos.poo.aula_06.abstracao.exemplos.interfaces.eletronicos;

public class Main {
    public static void main(String[] args) {
        Eletronico tv = new TV();
        Eletronico computador = new Computador();

        System.out.println("Testando TV");
        ligarEDesligarAparelhos(tv);

        System.out.println("Testando Computador");
        ligarEDesligarAparelhos(computador);
    }

    private static void ligarEDesligarAparelhos(Eletronico eletronico) {
        eletronico.ligar();
        eletronico.desligar();
    }
}
