package com.senai.estudos.poo.aula_06.abstracao.exemplos.classes_abstratas.gerenciamento_de_funcionarios;

public abstract class Funcionarios {
    protected String nome;
    protected double salario;

    public Funcionarios(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double porcentageDeAumento){
        salario += salario * porcentageDeAumento / 100;
    }

    public abstract void calcularBonus();

    public void exibirDados(){
        System.out.printf("%s recebe R$: %,.2f \n", nome, salario);
    }
}

