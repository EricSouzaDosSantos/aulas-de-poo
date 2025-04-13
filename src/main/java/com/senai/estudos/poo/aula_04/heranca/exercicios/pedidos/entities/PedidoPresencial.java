package com.senai.estudos.poo.aula_04.heranca.exercicios.pedidos.entities;

public class PedidoPresencial extends Pedido {
    private double desconto;

    public PedidoPresencial(int numero, double valorTotal, double desconto) {
        super(numero, valorTotal);
        this.desconto = desconto;
    }

    @Override
    public double calcularTotal() {
        return valorTotal - desconto;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Desconto aplicado: R$" + desconto);
        System.out.println("Total com desconto: R$" + calcularTotal());
    }
}
