package com.senai.estudos.poo.aula_06.abstracao.exemplos.interfaces.controlador_inteligente;

public class LampadaInteligente implements AparelhoInteligente{
    private int brilho;

    public LampadaInteligente(){
        this.brilho = 0;
    }

    @Override
    public void ligar() {
        System.out.println("Lampada ligada!");
    }

    @Override
    public void desligar() {
        System.out.println("Lampada desligada");
    }

    public void aumentarBrilho(){
        System.out.println("Brilho "+(brilho = ajustarNivel(brilho, 1)));
    }

    public void baixarBrilho(){
        System.out.println("Brilho "+(brilho = ajustarNivel(brilho, -1)));
    }

}
