package com.bancolombia.CursoSpringBootconMaven.ejemplo2;

public class Servicio implements Pagable {
    private String descripcion;
    private double precioHora;
    private double horasTrabajadas;

    public Servicio(String desc,
                    double ph, double h) {
        this.descripcion = desc;
        this.precioHora = ph;
        this.horasTrabajadas = h;
    }

    @Override
    public double calcularTotal() {
        return precioHora * horasTrabajadas;
    }

    @Override
    public double aplicarDescuento(double pct) {
        return calcularTotal() * (1 - pct);
    }
}
