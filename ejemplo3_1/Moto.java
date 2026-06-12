package com.bancolombia.CursoSpringBootconMaven.ejemplo3_1;

public class Moto extends Vehiculo {

    private double consumoCombustible;
    private double precioCombustible;

    public Moto(String marca, double velocidad, double consumoCombustible, double precioCombustible) {
        super(marca, velocidad);
        this.consumoCombustible = consumoCombustible;
        this.precioCombustible = precioCombustible;
    }

    @Override
    public double calcularCostoViaje(double distancia) {
        // Las motos suelen gastar menos
        return distancia * consumoCombustible * precioCombustible * 0.8;
    }
}