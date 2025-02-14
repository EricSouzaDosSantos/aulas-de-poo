package com.senai.estudos.poo.aula_04.funcionarios.main;

import com.senai.estudos.poo.aula_04.funcionarios.etities.Funcionario;
import com.senai.estudos.poo.aula_04.funcionarios.etities.Gerente;


public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("João", 3000);
        Gerente gerente = new Gerente("Carlos", 4000, 1200);

        funcionario.exibirDados();
        gerente.exibirDados();



    }

}
