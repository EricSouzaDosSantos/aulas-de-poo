package com.senai.estudos.poo.aula_06.abstracao.exemplos.classes_abstratas.gerenciamento_de_funcionarios;

public class FuncionarioEfetivo extends Funcionarios{
    private double bonusMensal;

    public FuncionarioEfetivo(String nome, double salario, double bonusMensal) {
        super(nome, salario);
        this.bonusMensal = bonusMensal;
    }

    @Override
    public void calcularBonus() {
        salario += bonusMensal;
    }
}
