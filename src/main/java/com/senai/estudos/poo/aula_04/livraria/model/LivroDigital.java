package com.senai.estudos.poo.aula_04.livraria.model;

public class LivroDigital extends Livro {
    private double tamanhoArquivo;

    public LivroDigital(String titulo, String autor, double tamanhoArquivo) {
        super(titulo, autor);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tamanho do arquivo: " + tamanhoArquivo + " MB";
    }
}

