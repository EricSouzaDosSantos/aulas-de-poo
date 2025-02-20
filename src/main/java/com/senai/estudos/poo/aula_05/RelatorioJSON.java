package com.senai.estudos.poo.aula_05;

class RelatorioJSON extends Relatorio {
    public RelatorioJSON(String nome) {
        super(nome);
    }

    @Override
    public void gerar() {
        System.out.println("Gerando relatório JSON: " + nome);
    }
}
