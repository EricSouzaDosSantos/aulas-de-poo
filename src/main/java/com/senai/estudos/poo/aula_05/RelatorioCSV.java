package com.senai.estudos.poo.aula_05;

class RelatorioCSV extends Relatorio {
    public RelatorioCSV(String nome) {
        super(nome);
    }

    @Override
    public void gerar() {
        System.out.println("Gerando relatório CSV: " + nome);
    }
}
