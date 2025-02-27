package com.senai.estudos.poo.aula_05.relatorios.entities;

abstract class Relatorio {
    protected String nome;

    public Relatorio(String nome) {
        this.nome = nome;
    }

    public abstract void gerar();

    public String getNome() {
        return nome;
    }
}
