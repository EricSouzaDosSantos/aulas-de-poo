package com.senai.estudos.poo.aula_05.relatorios.entities;

import com.senai.estudos.poo.aula_05.hotel.Relatorio;

class RelatorioCSV extends Relatorio {
    public RelatorioCSV(String nome) {
        super(nome);
    }

    @Override
    public void gerar() {
        System.out.println("Gerando relatório CSV: " + nome);
    }
}
