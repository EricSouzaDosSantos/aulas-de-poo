package com.senai.estudos.poo.aula_05.polimorfismo.funcionarios.entities;

public class AuxilioTransporte extends Beneficio {

    public AuxilioTransporte(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double descontoSalarial(double salario) {
        return salario - (salario * 0.15);
    }
}
