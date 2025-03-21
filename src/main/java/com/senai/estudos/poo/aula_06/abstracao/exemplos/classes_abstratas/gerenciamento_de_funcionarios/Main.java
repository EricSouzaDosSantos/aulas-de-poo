package com.senai.estudos.poo.aula_06.abstracao.exemplos.classes_abstratas.gerenciamento_de_funcionarios;

public class Main {
    public static void main(String[] args) {
        testeFuncionarios(new FuncionarioEfetivo("Eric", 1000, 90));
        testeFuncionarios(new FuncionarioTemporario("Lucas", 2000, 10, 100));
    }
    private static void testeFuncionarios(Funcionarios funcionarios){
        System.out.println("-------------------Teste de funcionarios--------------------");
        funcionarios.exibirDados();
        funcionarios.aumentarSalario(10);
        funcionarios.exibirDados();
        funcionarios.calcularBonus();
        funcionarios.exibirDados();
    }
}
