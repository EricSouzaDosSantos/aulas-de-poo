package com.senai.estudos.poo.aula_03.encapsulamento.exercicios.funcionarios.entities;

import java.util.Arrays;
import java.util.Objects;

public class Funcionarios {

    private String nome;
    private String cargo;
    private double salario;
    private String[] listaDeCArgos = {"Gerente","Programador","Analista"};

    public Funcionarios(String nome, int cargo, double salario) {
        if (salario < 1320 || nome.isEmpty()){
            System.out.println(nome.isEmpty() ? "O nome não deve ser nulo" : "");
            System.out.println(salario < 1320 ? "O Salário deve ser maior do que 1320" : "");
        }else {
            this.nome = nome;
            this.cargo = this.listaDeCArgos[cargo];
            this.salario = salario;
        }
    }

    public void aumentoSalarial(double percentual) {
        if (percentual < 0) {
            System.out.println("o valor do percentual não pode ser um numero negativo");
        } else {
            this.salario += salario * (percentual / 100);
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Funcionarios that = (Funcionarios) o;
        return Double.compare(salario, that.salario) == 0 && Objects.equals(nome, that.nome) && Objects.equals(cargo, that.cargo) && Objects.deepEquals(listaDeCArgos, that.listaDeCArgos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cargo, salario, Arrays.hashCode(listaDeCArgos));
    }
}
