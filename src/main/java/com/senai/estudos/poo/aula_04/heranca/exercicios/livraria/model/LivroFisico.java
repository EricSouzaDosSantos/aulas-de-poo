package com.senai.estudos.poo.aula_04.heranca.exercicios.livraria.model;

public class LivroFisico extends Livro {
    private int numeroPaginas;

    public LivroFisico(String titulo, String autor, int numeroPaginas) {
        super(titulo, autor);
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Páginas: " + numeroPaginas;
    }
}
