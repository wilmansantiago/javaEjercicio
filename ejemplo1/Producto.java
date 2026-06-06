package com.bancolombia.CursoSpringBootconMaven.ejemplo1;

public class Producto implements Pagable, Serializable {

    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double calculaTotal() {

        return this.precio * (double)this.cantidad;
    }

    public double aplicarDescuento(double porcentaje){
        double total = this.calculaTotal();
        return total =(total * porcentaje / 100);
    }

    public String descripcion() {
        return String.format("Producto: %s | Precio: $%.2f Cantidad: %d | Total con Descuento: $%.2f", this.nombre, this.precio, this.cantidad, this.aplicarDescuento(10));
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public String toString() {
        return this.descripcion();
    }


    @Override
    public double calcularpago() {
        return this.calculaTotal();
    }


    @Override
    public String serializar() {
        return String.format(
                "{tipo:'Producto', nombre:'%s', precio:%.2f, cantidad:%d, total:%.2f}",
                nombre, precio, cantidad, calculaTotal()
        );
    }




}
