package com.senai.estudos.poo.aula_06.abstracao.exemplos.classes_abstratas.animais;

abstract class Animal {
    String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    void dormir(){
        System.out.println(nome + " esta dormindo.");
    }

    abstract public void fazerSom();


}
