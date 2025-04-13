package com.senai.estudos.poo.aula_05.polimorfismo.hotel.entitites;

public class ReservaSimples extends Reserva {
    private static final double PRECO_POR_DIA = 100.0;

    public ReservaSimples(String nome, int dias) {
        super(nome, dias);
    }

    @Override
    public double calcularCusto() {
        return dias * PRECO_POR_DIA;
    }
}
