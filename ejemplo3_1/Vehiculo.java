package com.bancolombia.CursoSpringBootconMaven.ejemplo3_1;

public abstract class Vehiculo {

    protected String marca;
    protected double velocidad;

    public Vehiculo(String marca, double velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public abstract double calcularCostoViaje(double distancia);

    public String getMarca() {
        return marca;
    }
}