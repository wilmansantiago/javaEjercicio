package co.com.bancolombia.ejercicio1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
        System.out.println("Ejercicio 4: Factura con Polimorfismo y Serialización\n");

        Producto laptop = new Producto(nombre:"Laptop", (double) 1200.00F, cantidad:2);
        Producto teclado = new Producto(nombre:"teclado", (double) 1500.00F, cantidad:4);
        Producto monitor = new Producto(nombre:"monitor", (double) 5200.00F, cantidad:2);
        Servicio soporte = new Servicio(descripcion:"Soporte Técnico", (double) 300.00F, horasTrabajadas:5);
        Servicio desarrollo = new Servicio(descripcion:"Desarrollo de Software", (double) 500.00F, horasTrabajadas:10);

        Factura factura = new Factura(numeroFactura:"F001", cliente:"Juan Perez");
        factura.agregarItem(laptop);
        factura.agregarItem(teclado);
        factura.agregarItem(monitor);
        factura.agregarItem(soporte);
        factura.agregarItem(desarrollo);

        factura.imprimirFactura();
        factura.serializarItems();

        Pagable[] elementos = new Pagable[]{laptop, teclado, monitor, soporte, desarrollo};

        for (Pagable elemento : elementos) {
            System.out.println("\nDescripcion: " + elemento.descripcion());
            System.out.println("Pago a realizar: $" + elemento.calcularPago());
        }
    }
}

