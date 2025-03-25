package com.senai.estudos.poo.aula_06.abstracao.exercicios.controle_de_estoque;

public class BicicletaEntrega extends VeiculoEntrega {
    private static final double VELOCIDADE_MAXIMA = 25.0;

    public BicicletaEntrega(double velocidadeAtual, double capacidadeMaxima, double distanciaDestino) {
        super(Math.min(velocidadeAtual, VELOCIDADE_MAXIMA), capacidadeMaxima, distanciaDestino);
    }

    @Override
    public double calcularTempoEntrega() {
        return distanciaDestino / velocidadeAtual;
    }
}

