package com.senai.estudos.poo.aula_06.abstracao.exemplos.interfaces.controlador_inteligente;

public interface AparelhoInteligente {
    int NIVEL_MAXIMO = 100;

    void ligar();
    void desligar();

    default int ajustarNivel(int nivelAtual, int ajuste){
        if (validarNivel(nivelAtual, ajuste)){
            return nivelAtual + ajuste;
        }else {
            return nivelAtual;
        }
    }

    static void mensagemBemVindo(){
        System.out.println("Bem-Vindo ao controle Remoto inteligente");
    }

    private boolean validarNivel(int nivel, int ajuste){
        return (nivel >= 0) && (nivel <= NIVEL_MAXIMO) && (nivel+ajuste != -1) && (nivel+ajuste != 101);
    }
}
