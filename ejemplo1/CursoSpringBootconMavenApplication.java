package com.bancolombia.CursoSpringBootconMaven.ejemplo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CursoSpringBootconMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursoSpringBootconMavenApplication.class, args);
		System.out.println("Ejercicio 4: Factura con Polimorfismo y Serialización\n");

		Producto laptop = new Producto("Laptop", (double) 1200.00F, 2);
		Producto teclado = new Producto("teclado", (double) 1500.00F, 4);
		Producto monitor = new Producto("monitor", (double) 5200.00F, 2);

		Servicio soporte = new Servicio("Soporte Técnico", (double) 300.00F, 5);
		Servicio desarrollo = new Servicio("Desarrollo de Software", (double) 500.00F, 10);

		Factura factura = new Factura("F001", "Juan Perez");
		factura.agregarItems(laptop);
		factura.agregarItems(teclado);
		factura.agregarItems(monitor);
		factura.agregarItems(soporte);
		factura.agregarItems(desarrollo);
		factura.imprimirFactura();
		factura.serializarItems();

		Pagable [] elementos = new Pagable[]{laptop, teclado, monitor, soporte, desarrollo};

		for (Pagable elemento : elementos) {
			System.out.println("\nDescripción: " + elemento.descripcion());
			System.out.println("Pago a realizar: $" + elemento.calcularpago());
		}

	}

}
