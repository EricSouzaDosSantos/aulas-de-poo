package com.senai.estudos.poo.aula_06.abstracao.exercicios.controle_de_estoque;

public abstract class VeiculoEntrega {
    protected double velocidadeAtual;
    protected double capacidadeMaxima;
    protected double distanciaDestino;

    public VeiculoEntrega(double velocidadeAtual, double capacidadeMaxima, double distanciaDestino) {
        this.velocidadeAtual = velocidadeAtual;
        this.capacidadeMaxima = capacidadeMaxima;
        this.distanciaDestino = distanciaDestino;
    }

    public void aumentarVelocidade(double incremento) {
        this.velocidadeAtual += incremento;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public double getDistanciaDestino() {
        return distanciaDestino;
    }

    public abstract double calcularTempoEntrega();

    public void exibirDetalhes() {
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
        System.out.println("Capacidade Máxima: " + capacidadeMaxima + " kg");
        System.out.println("Distância até o Destino: " + distanciaDestino + " km");
        System.out.println("Tempo estimado de entrega: " + calcularTempoEntrega() + " horas");
    }
}

