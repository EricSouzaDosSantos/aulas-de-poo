package com.senai.estudos.poo.aula_06.abstracao.exercicios.gerenciamento_de_eventos.main;

import com.senai.estudos.poo.aula_06.abstracao.exercicios.gerenciamento_de_eventos.Evento;
import com.senai.estudos.poo.aula_06.abstracao.exercicios.gerenciamento_de_eventos.FeiraDeCiencias;
import com.senai.estudos.poo.aula_06.abstracao.exercicios.gerenciamento_de_eventos.Hackaton;

public class Main {
    public static void main(String[] args) {
        Evento hackaton = new Hackaton();
        testarEventos(hackaton);
        Evento feiraDeCiencias = new FeiraDeCiencias();
        testarEventos(feiraDeCiencias);

    }

    private static void testarEventos(Evento evento){
        System.out.println("-----------------------");
        if (evento instanceof Hackaton hackaton){
            String[] participantes = {"Eric", "Lucas", "Beatriz", "Gabriel"};
            evento.iniciarEvento(participantes);
            hackaton.mostrarParticipantes(participantes);
            hackaton.premiarParticipantes();
        }else if(evento instanceof FeiraDeCiencias feiraDeCiencias){
            String[] participantes = {"Roberto", "Rafael", "Pedro", "Livia"};
            feiraDeCiencias.iniciarEvento(participantes);
            feiraDeCiencias.mostrarParticipantes(participantes);
            feiraDeCiencias.premiarParticipantes();
        }

        evento.finalizarEvento();
    }
}
