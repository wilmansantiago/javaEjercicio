package com.bancolombia.CursoSpringBootconMaven.ejemplo3_1;

public class Main {

    public static void main(String[] args) {

        Flota flota = new Flota();

        flota.agregarVehiculo(new Auto("Toyota", 120, 0.08, 15000));
        flota.agregarVehiculo(new Moto("Yamaha", 100, 0.05, 15000));
        flota.agregarVehiculo(new AutoElectrico("Tesla", 130, 0.15, 800));

        double distancia = 100;

        System.out.println("=== Costos de viaje ===");
        flota.mostrarCostos(distancia);
        System.out.println("\n");
        System.out.println("\n=== Vehículo más económico ===");
        Vehiculo mejor = flota.obtenerMasEconomico(distancia);

        System.out.println(mejor.getMarca() + " es el más barato");
    }
}
