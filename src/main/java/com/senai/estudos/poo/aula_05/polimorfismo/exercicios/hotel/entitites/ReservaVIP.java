package com.senai.estudos.poo.aula_05.polimorfismo.exercicios.hotel.entitites;

public class ReservaVIP extends Reserva {
    private static final double PRECO_POR_DIA = 200.0;
    private static final double TAXA_VIP = 50.0;

    public ReservaVIP(String nome, int dias) {
        super(nome, dias);
    }

    @Override
    public double calcularCusto() {
        return (dias * PRECO_POR_DIA) + TAXA_VIP;
    }
}