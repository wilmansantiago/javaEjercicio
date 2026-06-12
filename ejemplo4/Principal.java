package com.bancolombia.CursoSpringBootconMaven.ejemplo4;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<RecursoBibliografico> lista = new ArrayList<>();

        // Agregar objetos
        lista.add(new RecursoDigital("Revista Digital", "Autor X", 2018, "PDF", 5.2));
        lista.add(new LibroElectronico("Libro A", "Autor A", 2010, "PDF", 2.5, 200, true));
        lista.add(new LibroElectronico("Libro B", "Autor B", 2005, "EPUB", 1.8, 150, false));
        lista.add(new LibroElectronico("Libro C", "Autor C", 2015, "PDF", 3.0, 300, true));

        // Polimorfismo (mostrar todos)
        for (RecursoBibliografico r : lista) {
            System.out.println(r.obtenerResumen());
        }

        // Buscar el libro electrónico más antiguo
        LibroElectronico masAntiguo = null;

        for (RecursoBibliografico r : lista) {
            if (r instanceof LibroElectronico) {
                LibroElectronico libro = (LibroElectronico) r;

                if (masAntiguo == null ||
                        libro.anioPublicacion < masAntiguo.anioPublicacion) {
                    masAntiguo = libro;
                }
            }
        }

        // Resultado
        System.out.println("\nLibro Electrónico más antiguo:");
        if (masAntiguo != null) {
            System.out.println(masAntiguo.obtenerResumen());
        }
    }
}