package com.senai.estudos.poo.aula_02.pessoa;

import java.util.Objects;

public class Pessoa {
    String nome;
    int idade;
    Endereco endereco;

    public Pessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public void Falar(){
        System.out.println("0i!");
    }


    @Override
    public String toString() {
        return "A pessoa tem o nome de "+ this.nome +" e idade "+ this.idade +" e mora no endereço "+ endereco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return idade == pessoa.idade && Objects.equals(nome, pessoa.nome) && Objects.equals(endereco, pessoa.endereco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, endereco);
    }
}

