package com.senai.estudos.poo.aula_05.polimorfismo.exercicios.hotel.entitites;

public abstract class Reserva {
    protected String nome;
    protected int dias;

    public Reserva(String nome, int dias) {
        this.nome = nome;
        this.dias = dias;
    }

    public abstract double calcularCusto();

    @Override
    public String toString() {
        return "Reserva de " + nome + " por " + dias + " dias. Custo: R$ " + calcularCusto();
    }
}
