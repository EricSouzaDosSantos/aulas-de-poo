package com.senai.estudos.poo.aula_04.heranca.exemplos.funcionarios.main;

import com.senai.estudos.poo.aula_04.heranca.exemplos.funcionarios.etities.Funcionario;
import com.senai.estudos.poo.aula_04.heranca.exemplos.funcionarios.etities.Gerente;


public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("João", 3000);
        Gerente gerente = new Gerente("Carlos", 4000, 1200);

        funcionario.exibirDados();
        gerente.exibirDados();



    }

}
