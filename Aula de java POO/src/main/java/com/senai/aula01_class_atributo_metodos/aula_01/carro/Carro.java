package com.senai.aula01_class_atributo_metodos.aula_01.carro;

import java.util.Objects;

public class Carro {
    String marca;
    String modelo;
    String cor;
    int anoFabricacao;
    double motor;
    byte porta;
    double precoBase;

    public Carro(String marca, String modelo, String cor, int anoFabricacao, double motor, byte porta, double precoBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.motor = motor;
        this.porta = porta;
        this.precoBase = precoBase;
    }

    public void verificarInformacoes(){
        System.out.println("Marca = "+ marca);
        System.out.println("Modelo = "+ modelo);
        System.out.println("Cor = "+ cor);
        System.out.println("Ano de Fabricação = "+ anoFabricacao);
        System.out.println("Motor = "+ motor);
        System.out.println("Portas = "+ porta);
    }
    public void ligarCarro(){
        System.out.println("Vrrummm");
    }
    public void testarSom(){
        System.out.println("Som ligado");
    }
    public void buzinar(){
        System.out.println("bibi");
    }
    public void consultarPreco(int anoatual){
        int idadeDoCarro = anoatual - anoFabricacao;
        double precoAtual = precoBase;
        for (int i = 0; i < idadeDoCarro; i++) {
            precoAtual -= (precoAtual*0.05);
        }

        System.out.println("O valor atual do carro é de "+ precoAtual);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                ", motor=" + motor +
                ", porta=" + porta +
                ", precoBase=" + precoBase +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return anoFabricacao == carro.anoFabricacao && Double.compare(motor, carro.motor) == 0 && porta == carro.porta && Double.compare(precoBase, carro.precoBase) == 0 && Objects.equals(marca, carro.marca) && Objects.equals(modelo, carro.modelo) && Objects.equals(cor, carro.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, cor, anoFabricacao, motor, porta, precoBase);
    }
}
