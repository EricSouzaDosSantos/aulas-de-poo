package com.senai.aula01_class_atributo_metodos.aula_01.alunos;


public class Aluno {
    private String nome;
    private int idade;
    private double nota;

    Aluno(String nome, int idade, double nota){
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public void informacoesAluno(){
        System.out.println("nome do aluno(a): "+this.nome);
        System.out.println("idade do aluno(a): "+this.idade);
        System.out.println("nota do aluno(a" +
                "): "+this.nota);
    }

    public void atualizarNota(double nota){
        this.nota = nota;
    }

    public boolean verificarAprovacao(double nota){
        return nota >= 6;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNota() {
        return nota;
    }
}
