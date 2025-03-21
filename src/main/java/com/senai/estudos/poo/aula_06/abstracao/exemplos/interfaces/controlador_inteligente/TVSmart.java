package com.senai.estudos.poo.aula_06.abstracao.exemplos.interfaces.controlador_inteligente;

public class TVSmart implements AparelhoInteligente{
    private int volume;

    public TVSmart(){
        this.volume =0;
    }

    @Override
    public void ligar() {
        System.out.println("Tv ligada");
    }

    @Override
    public void desligar() {
        System.out.println("Tv desligada");
    }

    public void aumentarVolume(){
        System.out.println("Volume "+(volume = ajustarNivel(volume, 1)));
    }

    public void baixarVolume(){
        System.out.println("Volume "+(volume = ajustarNivel(volume, -1)));
    }
}
