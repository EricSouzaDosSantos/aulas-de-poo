package com.senai.estudos.poo.aula_04.heranca.exemplos.gerenciamento_contas.entities;

public class Conta {
    private String titular;
    private double saldo;

    public  Conta(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public  void sacar(double valor){
        if (valor <= saldo) {
            saldo -= valor;
        }else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void exibirSaldo(){
        System.out.println("Titular: "+titular+", Saldo: R$"+saldo);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
