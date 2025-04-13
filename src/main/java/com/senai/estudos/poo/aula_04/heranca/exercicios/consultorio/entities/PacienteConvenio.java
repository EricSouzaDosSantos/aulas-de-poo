package com.senai.estudos.poo.aula_04.heranca.exercicios.consultorio.entities;

public class PacienteConvenio extends Paciente {
    private double desconto;

    public PacienteConvenio(String nome, int idade, double desconto) {
        super(nome, idade);
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return "Paciente Convênio - " + super.toString() + " | Desconto: " + desconto + "%";
    }
}
