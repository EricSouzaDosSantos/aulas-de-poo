package com.senai.estudos.poo.aula_05.polimorfismo.funcionarios.entities;

public abstract class Beneficio {
    private double salario;
    private String nome;

    public Beneficio(String nome, double salario) {
        this.salario = salario;
    }

    public abstract double descontoSalarial(double salario);

    @Override
    public String toString() {
        return "O salario do funcionario "+nome+" é de "+salario+" e com o desconto fica no valor de "+descontoSalarial(this.salario);
    }
}
