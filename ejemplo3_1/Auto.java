package com.bancolombia.CursoSpringBootconMaven.ejemplo3_1;

public class Auto extends Vehiculo {

    private double consumoCombustible; //
    private double precioCombustible;

    public Auto(String marca, double velocidad, double consumoCombustible, double precioCombustible) {
        super(marca, velocidad);
        this.consumoCombustible = consumoCombustible;
        this.precioCombustible = precioCombustible;
    }

    @Override
    public double calcularCostoViaje(double distancia) {
        return distancia * consumoCombustible * precioCombustible;
    }
}
