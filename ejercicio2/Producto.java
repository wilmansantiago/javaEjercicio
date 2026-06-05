package co.com.bancolombia.ejercicio2;

public class Producto implements Pagable {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String n, double p, int q) {
        this.nombre = n; this.precio = p;
        this.cantidad = q;
    }

    @Override
    public double calcularTotal() {
        return precio * cantidad;
    }
    @Override
    public double aplicarDescuento(double pct) {
        return calcularTotal() * (1 - pct);
    }
}