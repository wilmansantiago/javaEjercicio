package com.bancolombia.CursoSpringBootconMaven.ejemplo1;

public interface Pagable {
    double calcularpago();

    double aplicarDescuento(double porcentaje);

    String descripcion();
}
