package com.senai.estudos.poo.aula_06.abstracao.exemplos.classes_abstratas.animais;

public class Cachorro extends Animal{
    public Cachorro(String nome) {
        super(nome);
    }
    @Override
    public void fazerSom() {
        System.out.println(nome + " está fazendo: AUAUAUAUAUAUAU!!!!");
    }
}
