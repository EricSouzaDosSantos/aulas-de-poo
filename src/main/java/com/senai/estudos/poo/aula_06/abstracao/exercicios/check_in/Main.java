package com.senai.estudos.poo.aula_06.abstracao.exercicios.check_in;

public class Main {
    public static void main(String[] args) {
        CheckIn.mensagemBoasVindas();
        LATAM companhia = new LATAM();

        companhia.validarDocumento("123456789");
        companhia.emitirCartaoEmbarque("João Silva");
        companhia.mensagemSeguranca();

        boolean bagagemValida = companhia.validarBagagem(2, 22.5);
        System.out.println("Bagagem válida: " + bagagemValida);
    }
}
