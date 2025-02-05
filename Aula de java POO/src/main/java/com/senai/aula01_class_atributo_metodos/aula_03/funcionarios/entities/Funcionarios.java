package com.senai.aula01_class_atributo_metodos.aula_03.funcionarios.entities;

public class Funcionarios {

    private String nome;
    private String cargo;
    private double salario;

    public Funcionarios(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.isEmpty()){
            System.out.println("O nome está vazio");
        }else {
        this.nome = nome;
        }
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
