package com.senai.estudos.poo.aula_04.consultorio.entities;

public class Paciente {
    protected String nome;
    protected int idade;

    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para apresentar as informações do paciente
    @Override
    public String toString() {
        return "Nome: " + nome + " | Idade: " + idade;
    }
}