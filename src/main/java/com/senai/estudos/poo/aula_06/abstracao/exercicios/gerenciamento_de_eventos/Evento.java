package com.senai.estudos.poo.aula_06.abstracao.exercicios.gerenciamento_de_eventos;

public interface Evento {
    String PREMIACOES[] = {"R$: 1000.00", "R$: 750.00", "R$: 500.00"};
    String TEMPOLIMITE = "8 horas";

    void iniciarEvento(String[] participantes);
    void finalizarEvento();
    void premiarParticipantes();
    default void mensagemDeBoasVindas(){
        System.out.println("Bem vindo ao nosso evento");
    }
    default void mostrarParticipantes(String[] participantes){
        System.out.println("-------------------");
        System.out.println("Lista de participantes do evento:");
        for (String participante : participantes){
            System.out.println(participante);
        }
        System.out.println("-------------------");
    }

}
