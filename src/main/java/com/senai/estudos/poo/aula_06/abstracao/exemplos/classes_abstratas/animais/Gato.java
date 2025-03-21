package com.senai.estudos.poo.aula_06.abstracao.exemplos.classes_abstratas.animais;

public class Gato extends Animal{
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println(nome + " está miando: MIAU MIAU MIAU MIAU!!!!!!!!");
    }
}
