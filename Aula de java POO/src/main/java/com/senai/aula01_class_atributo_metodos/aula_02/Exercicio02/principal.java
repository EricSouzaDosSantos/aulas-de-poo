package com.senai.aula01_class_atributo_metodos.aula_02.Exercicio02;

public class principal {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", 16, 7.9);

        aluno1.exibirInformacoes();
        aluno1.atualizaNota(-1);

}
}