package com.senai.estudos.poo.aula_06.abstracao.exercicios.check_in;

public interface CheckIn {
    int MAX_BAGAGENS_NACIONAL = 2;
    int MAX_BAGAGENS_INTERNACIONAL = 3;
    double PESO_MAXIMO_NACIONAL = 23.0;
    double PESO_MAXIMO_INTERNACIONAL = 32.0;

    void validarDocumento(String documento);
    void emitirCartaoEmbarque(String passageiro);

    default void mensagemSeguranca() {
        System.out.println("Check-in seguro realizado pela FlySecure.");
    }

    static void mensagemBoasVindas() {
        System.out.println("Bem-vindo ao sistema de check-in da FlySecure!");
    }

    default boolean validarBagagem(int quantidade, double peso) {
        return quantidade <= MAX_BAGAGENS_NACIONAL && peso <= PESO_MAXIMO_NACIONAL;
    }
}
