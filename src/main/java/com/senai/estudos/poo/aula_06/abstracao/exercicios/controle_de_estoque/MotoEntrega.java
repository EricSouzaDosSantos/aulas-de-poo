package com.senai.estudos.poo.aula_06.abstracao.exercicios.controle_de_estoque;

public class MotoEntrega extends VeiculoEntrega {
    private static final double ATRASO_TRANSITO = 0.5; // Simula atraso devido ao trânsito

    public MotoEntrega(double velocidadeAtual, double capacidadeMaxima, double distanciaDestino) {
        super(velocidadeAtual, capacidadeMaxima, distanciaDestino);
    }

    @Override
    public double calcularTempoEntrega() {
        return (distanciaDestino / velocidadeAtual) + ATRASO_TRANSITO;
    }
}

