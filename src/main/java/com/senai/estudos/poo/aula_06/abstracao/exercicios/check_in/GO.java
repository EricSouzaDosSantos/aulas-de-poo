package com.senai.estudos.poo.aula_06.abstracao.exercicios.check_in;

public class GO implements CheckIn{
    @Override
    public void validarDocumento(String documento) {
        if (documento == null || documento.isEmpty()) {
            throw new IllegalArgumentException("Documento inválido!");
        }
        System.out.println("Documento " + documento + " validado com sucesso pela GO.");
    }

    @Override
    public void emitirCartaoEmbarque(String passageiro) {
        System.out.println("Cartão de embarque da GO emitido para: " + passageiro);
    }
}
