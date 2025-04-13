package com.senai.estudos.poo.aula_06.abstracao.exercicios.check_in;

class LATAM implements CheckIn {
    @Override
    public void validarDocumento(String documento) {
        if (documento == null || documento.isEmpty()) {
            throw new IllegalArgumentException("Documento inválido!");
        }
        System.out.println("Documento " + documento + " validado com sucesso pela latam.");
    }

    @Override
    public void emitirCartaoEmbarque(String passageiro) {
        System.out.println("Cartão de embarque da latam emitido para: " + passageiro);
    }
}
