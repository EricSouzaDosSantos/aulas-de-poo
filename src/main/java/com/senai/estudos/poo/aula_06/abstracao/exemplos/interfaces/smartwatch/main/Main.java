package com.senai.estudos.poo.aula_06.abstracao.exemplos.interfaces.smartwatch.main;

import com.senai.estudos.poo.aula_06.abstracao.exemplos.interfaces.smartwatch.SmartWatch;

public class Main {
    public static void main(String[] args) {
        SmartWatch smartWatch = new SmartWatch();

        smartWatch.exibirDispositivos();
        smartWatch.medirFrequenciaCardiaca();
        smartWatch.contarPassos();
        smartWatch.medirQualidadeDeSono();
    }
}
