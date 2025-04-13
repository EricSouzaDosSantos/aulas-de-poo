package com.senai.estudos.poo.aula_06.abstracao.exercicios.gerenciamento_de_eventos;

public class FeiraDeCiencias implements Evento{
    private String[] participantes;

    private void adicionarParticipantes(String[] participantes){
        this.participantes = participantes;
    }

    @Override
    public void iniciarEvento(String[] participantes) {
        System.out.println("A feira de ciências começou e vai terminar em "+Evento.TEMPOLIMITE);
        mensagemDeBoasVindas();
        adicionarParticipantes(participantes);
    }

    @Override
    public void premiarParticipantes() {
        for (int i = 0; i < 3; i++) {
            System.out.println("O participante "+participantes[i]+" ganhou em "+(1+i)+"° lugar e vai receber "+Evento.PREMIACOES[i]);
        }
    }

    @Override
    public void finalizarEvento() {
        System.out.println("FEira de ciências finalizada");
    }


}
