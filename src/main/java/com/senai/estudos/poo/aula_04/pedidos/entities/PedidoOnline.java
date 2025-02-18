package com.senai.estudos.poo.aula_04.pedidos.entities;

public class PedidoOnline extends Pedido {
    private double taxaEntrega;

    public PedidoOnline(int numero, double valorTotal, double taxaEntrega) {
        super(numero, valorTotal);
        this.taxaEntrega = taxaEntrega;
    }

    @Override
    public double calcularTotal() {
        return valorTotal + taxaEntrega;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Taxa de entrega: R$" + taxaEntrega);
        System.out.println("Total com entrega: R$" + calcularTotal());
    }
}