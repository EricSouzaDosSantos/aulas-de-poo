package com.senai.estudos.poo.aula_05.sensor.entities;

public abstract class Sensor {
    protected String id;

    public Sensor(String id) {
        this.id = id;
    }

    public abstract String reportarValor();

    public String getId() {
        return id;
    }
}
