package com.bancolombia.CursoSpringBootconMaven.ejemplo3_1;

public class AutoElectrico extends VehiculoElectrico {

    private double costoKWh;

    public AutoElectrico(String marca, double velocidad, double consumoKWh, double costoKWh) {
        super(marca, velocidad, consumoKWh);
        this.costoKWh = costoKWh;
    }

    @Override
    public double calcularCostoViaje(double distancia) {
        return distancia * consumoKWh * costoKWh;
    }
}
