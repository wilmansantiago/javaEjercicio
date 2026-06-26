package proyecto.model;

import jakarta.persistence.Entity;

@Entity
public class AutoElectrico extends Vehiculo {

    private double capacidadBateriaKwh;
    private double nivelCargaPorcentaje;
    private double consumoKwhPor100km;
    private double precioKwh;

    public AutoElectrico() {
    }

    public AutoElectrico(String marca, String modelo, int anio,
                         double capacidadBateriaKwh, double nivelCargaPorcentaje,
                         double consumoKwhPor100km, double precioKwh) {
        super(marca, modelo, anio);
        this.capacidadBateriaKwh = capacidadBateriaKwh;
        this.nivelCargaPorcentaje = nivelCargaPorcentaje;
        this.consumoKwhPor100km = consumoKwhPor100km;
        this.precioKwh = precioKwh;
    }

    public double getCapacidadBateriaKwh() { return capacidadBateriaKwh; }

    public void setCapacidadBateriaKwh(double capacidadBateriaKwh) {
        this.capacidadBateriaKwh = capacidadBateriaKwh;
    }

    public double getNivelCargaPorcentaje() { return nivelCargaPorcentaje; }

    public void setNivelCargaPorcentaje(double nivelCargaPorcentaje) {
        if (nivelCargaPorcentaje < 0 || nivelCargaPorcentaje > 100) {
            throw new IllegalArgumentException("El nivel de carga debe estar entre 0 y 100.");
        }
        this.nivelCargaPorcentaje = nivelCargaPorcentaje;
    }

    public double getConsumoKwhPor100km() { return consumoKwhPor100km; }

    public double getPrecioKwh() { return precioKwh; }


    @Override
    public double calcularCostoViaje(double distanciaKm) {
        double energiaNecesaria = (distanciaKm / 100.0) * consumoKwhPor100km;
        return energiaNecesaria * precioKwh;
    }

}