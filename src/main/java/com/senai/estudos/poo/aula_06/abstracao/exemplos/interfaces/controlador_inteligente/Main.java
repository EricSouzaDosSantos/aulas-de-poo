package com.senai.estudos.poo.aula_06.abstracao.exemplos.interfaces.controlador_inteligente;

public class Main {
    public static void main(String[] args) {
        testarAparelhosInteligentes(new TVSmart());
        testarAparelhosInteligentes(new LampadaInteligente());

    }
    private static void testarAparelhosInteligentes(AparelhoInteligente aparelhoInteligente){
        System.out.println("-------------------Teste de aparelhos--------------------");

        aparelhoInteligente.ligar();

        if (aparelhoInteligente instanceof TVSmart tvSmart){
            tvSmart.aumentarVolume();
            tvSmart.aumentarVolume();
            tvSmart.desligar();
        }

        if (aparelhoInteligente instanceof LampadaInteligente lampadaInteligente){
            lampadaInteligente.aumentarBrilho();
            lampadaInteligente.aumentarBrilho();
            lampadaInteligente.desligar();
        }
    }
}
