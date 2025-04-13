package com.senai.estudos.poo.aula_04.heranca.pedidos.entities;

public class Pedido {
    protected int numero;
    protected double valorTotal;

    public Pedido(int numero, double valorTotal) {
        this.numero = numero;
        this.valorTotal = valorTotal;
    }

    public double calcularTotal() {
        return valorTotal;
    }

    public void exibirDetalhes() {
        System.out.println("Pedido número: " + numero);
        System.out.println("Valor total: R$" + calcularTotal());
    }
}
