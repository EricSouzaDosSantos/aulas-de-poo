package com.senai.estudos.poo.aula_06.abstracao.exercicios.check_in;

public class Main {
    public static void main(String[] args) {
        CheckIn latam = new LATAM();
        CheckIn GO = new GO();
        testarCheckIn(latam);
        testarCheckIn(GO);

    }

    private static void testarCheckIn(CheckIn checkIn){
        System.out.println("-----------------------------");
        CheckIn.mensagemBoasVindas();
        checkIn.validarDocumento("123456789");
        checkIn.emitirCartaoEmbarque("João Silva");
        checkIn.mensagemSeguranca();

        boolean bagagemValida = checkIn.validarBagagem(2, 22.5);


        if (bagagemValida) {
            System.out.println("Bagagem válida: ");
        }else {
            System.out.println("Bagagem inválida");
        }

    }
}
