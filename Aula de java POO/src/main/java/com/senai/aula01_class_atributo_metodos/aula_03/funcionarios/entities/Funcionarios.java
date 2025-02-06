package com.senai.aula01_class_atributo_metodos.aula_03.funcionarios.entities;

public class Funcionarios {

    private String nome;
    private String cargo;
    private double salario;
    private String[] listaDeCArgos = {"Gerente","Programador","Analista"};

    public Funcionarios(String nome, int cargo, double salario) {
        if (cargo < 0 && cargo > 2 && nome.isEmpty() && salario < 1320){
            System.out.println("valores faltando");
        }else {
            this.nome = nome;
            this.cargo = this.listaDeCArgos[cargo];
            this.salario = salario;
        }
    }

    public void aumentoSalarial(double percentual) {
        if (percentual < 0) {
            System.out.println("não pode ser numero negativo");
        } else {
            this.salario = this.salario * (percentual / 100) + this.salario;
        }
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
        if (salario < 1320) {
            System.out.println("O salário não pode ser menor do que o salário mínimo");
        }else {
            this.salario = salario;
        }
    }
}
