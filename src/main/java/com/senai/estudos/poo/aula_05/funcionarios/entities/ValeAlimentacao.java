package com.senai.estudos.poo.aula_05.funcionarios.entities;

public class ValeAlimentacao extends Beneficio {

    public ValeAlimentacao(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double descontoSalarial(double salario) {
        return salario - (salario * 0.15);
    }

}
