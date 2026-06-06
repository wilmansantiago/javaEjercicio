package com.bancolombia.CursoSpringBootconMaven.ejemplo2;

import java.util.List;
import java.util.ArrayList;
public class Factura {

    public Factura(String numero) {
        this.numero = numero;
    }

    private String numero;


    private List<Pagable> items = new ArrayList<>();

    public void agregarItem(Pagable item) {

        items.add(item);

    }



    public double calcularGrandTotal() {

        return items.stream()

                // ← polimorfismo: cada item sabe cómo

                .mapToDouble(Pagable::calcularTotal)

                .sum();

    }

    public void imprimir() {

        items.forEach(i ->

                System.out.println(i.resumen()));

        System.out.println("TOTAL: $"

                + calcularGrandTotal());

    }

}