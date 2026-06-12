package com.bancolombia.CursoSpringBootconMaven.ejemplo3_1;

import java.util.ArrayList;
import java.util.List;

public class Flota {

    private List<Vehiculo> vehiculos;

    public Flota() {
        vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void mostrarCostos(double distancia) {
        for (Vehiculo v : vehiculos) {
            System.out.println(v.getMarca() + " costo: $" + v.calcularCostoViaje(distancia));
        }
    }

    // ✅ Buscar el mejor vehículo (más barato)
    public Vehiculo obtenerMasEconomico(double distancia) {
        Vehiculo mejor = null;
        double menorCosto = Double.MAX_VALUE;

        for (Vehiculo v : vehiculos) {
            double costo = v.calcularCostoViaje(distancia);

            if (costo < menorCosto) {
                menorCosto = costo;
                mejor = v;
            }
        }

        return mejor;
    }
}