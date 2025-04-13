package com.senai.estudos.poo.aula_04.heranca.consultorio.entities;

public class PacienteParticular extends Paciente {
    private double custoConsulta;

    public PacienteParticular(String nome, int idade, double custoConsulta) {
        super(nome, idade);
        this.custoConsulta = custoConsulta;
    }

    @Override
    public String toString() {
        return "Paciente Particular - " + super.toString() + " | Custo da Consulta: R$" + custoConsulta;
    }
}
