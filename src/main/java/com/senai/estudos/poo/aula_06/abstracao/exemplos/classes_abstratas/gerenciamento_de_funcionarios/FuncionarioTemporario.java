package com.senai.estudos.poo.aula_06.abstracao.exemplos.classes_abstratas.gerenciamento_de_funcionarios;

public class FuncionarioTemporario extends Funcionarios{
    private int horasExtras;
    private double valorHoraExtra;

    public FuncionarioTemporario(String nome, double salario, int horasExtras, double valorHoraExtra) {
        super(nome, salario);
        this.horasExtras = horasExtras;
        this.valorHoraExtra = valorHoraExtra;
    }


    @Override
    public void calcularBonus() {
        salario += horasExtras * valorHoraExtra;
    }
}
