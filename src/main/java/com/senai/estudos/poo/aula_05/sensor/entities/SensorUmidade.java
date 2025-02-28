package com.senai.estudos.poo.aula_05.sensor.entities;

public class SensorUmidade extends Sensor {
    private double umidade;

    public SensorUmidade(String id, double umidade) {
        super(id);
        this.umidade = umidade;
    }

    @Override
    public String reportarValor() {
        return "Sensor de Umidade [ID: " + id + "] - Umidade: " + umidade + "%";
    }
}
