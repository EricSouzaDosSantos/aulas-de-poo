package com.senai.estudos.poo.aula_04.livraria.model;

public class Livro {
    protected String titulo;
    protected String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor;
    }
}
