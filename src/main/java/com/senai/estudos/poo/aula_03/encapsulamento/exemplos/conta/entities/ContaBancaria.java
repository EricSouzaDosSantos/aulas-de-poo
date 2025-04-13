package com.senai.estudos.poo.aula_03.encapsulamento.exemplos.conta.entities;

public class ContaBancaria {

    private Usuario usuario;
    private double saldo;
    private int numeroDaConta;
    private String banco;
    private String tipo;

    public ContaBancaria(Usuario usuario, double saldo, int numeroDaConta, String banco, String tipo) {
        this.usuario = usuario;
        this.saldo = saldo;
        this.numeroDaConta = numeroDaConta;
        this.banco = banco;
        this.tipo = tipo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }else {
            System.out.println("Deposito do valor de R$: " + valor + " foi depositado na conta do usuário " + this.usuario.getNome() + " valor depois da transação: R$: " + saldo);
        }
    }

    public double sacar(double valor) {
        if (saldo >= valor && saldo >= 0) {
            saldo -= valor;
            return saldo;
        }
        return saldo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public double getSaldo() {
        System.out.println("");
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("não pode depositar um valor negativo");
        }
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" + "usuario=" + usuario + ", saldo=" + saldo + ", numeroDaConta=" + numeroDaConta + ", banco='" + banco + '\'' + ", tipo='" + tipo + '\'' + '}';
    }

    public void trasnferir(double valor, ContaBancaria contaDestino) {
        contaDestino.depositar(valor);
        this.sacar(valor);
    }
}
