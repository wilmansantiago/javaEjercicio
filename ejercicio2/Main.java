package co.com.bancolombia.ejercicio2;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Factura factura = new Factura("F-001");

// Añadir productos
        factura.agregarItem(new Producto("Laptop", 999.99, 1));
        factura.agregarItem(new Producto(
                "Mouse", 25.00, 2));

// Añadir servicios (misma lista!)
        factura.agregarItem(new Servicio(
                "Soporte Técnico", 80.0, 3));

        factura.imprimir();
    }
}

