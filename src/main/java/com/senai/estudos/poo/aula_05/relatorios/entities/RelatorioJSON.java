package com.senai.estudos.poo.aula_05.relatorios.entities;

import com.senai.estudos.poo.aula_05.relatorios.entities.Relatorio;

public class RelatorioJSON extends Relatorio {
    public RelatorioJSON(String nome) {
        super(nome);
    }

    @Override
    public void gerar() {
        System.out.println("Gerando relatório JSON: " + nome);
    }
}
