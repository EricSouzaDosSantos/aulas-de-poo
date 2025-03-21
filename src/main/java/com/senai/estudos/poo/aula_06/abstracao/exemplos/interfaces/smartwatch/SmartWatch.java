package com.senai.estudos.poo.aula_06.abstracao.exemplos.interfaces.smartwatch;

public class SmartWatch implements SensorCardiaco, SensorDePassos, SensorDeSono{

    @Override
    public void medirFrequenciaCardiaca() {
        System.out.println("Pressão cardiaca: 80bpm");
    }
    @Override
    public void contarPassos() {
        System.out.println("Passos hoje: 7875 passos");
    }
    @Override
    public void medirQualidadeDeSono() {
        System.out.println("Qualidade de sono: Sono desregulado");
    }

    public void exibirDispositivos(){
        System.out.println("SmartWatch conectado aos dispositivos...");
    }
}
