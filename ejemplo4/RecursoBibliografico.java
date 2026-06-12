package com.bancolombia.CursoSpringBootconMaven.ejemplo4;

public abstract class RecursoBibliografico {

    protected String titulo;
    protected String autor;
    protected int anioPublicacion;

    public RecursoBibliografico(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    // Método abstracto
    public abstract String obtenerResumen();

}
