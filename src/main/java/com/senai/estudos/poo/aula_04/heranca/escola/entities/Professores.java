package com.senai.estudos.poo.aula_04.heranca.escola.entities;

public class Professores extends Funcionario{
    private String disciplina;

    public Professores(String nome, double salario, String disciplina) {
        super(nome, salario);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Nome: "+super.getNome()+"\nSalario: "+super.getSalario()+"\nDisciplina: "+disciplina;
    }
}
