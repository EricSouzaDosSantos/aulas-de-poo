package com.senai.estudos.poo.aula_05.polimorfismo.exercicios.sensor.entities;

public class SensorTemperatura extends Sensor {
    private double temperatura;

    public SensorTemperatura(String id, double temperatura) {
        super(id);
        this.temperatura = temperatura;
    }

    @Override
    public String reportarValor() {
        return "Sensor de Temperatura [ID: " + id + "] - Temperatura: " + temperatura + "°C";
    }
}