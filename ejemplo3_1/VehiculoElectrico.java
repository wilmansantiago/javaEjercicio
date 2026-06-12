package com.bancolombia.CursoSpringBootconMaven.ejemplo3_1;

public abstract class VehiculoElectrico extends Vehiculo {

    protected double consumoKWh;

    public VehiculoElectrico(String marca, double velocidad, double consumoKWh) {
        super(marca, velocidad);
        this.consumoKWh = consumoKWh;
    }
}

