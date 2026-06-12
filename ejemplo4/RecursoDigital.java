package com.bancolombia.CursoSpringBootconMaven.ejemplo4;

class RecursoDigital extends RecursoBibliografico {

    protected String formato;
    protected double tamanioMB;

    public RecursoDigital(String titulo, String autor, int anioPublicacion,
                          String formato, double tamanioMB) {
        super(titulo, autor, anioPublicacion);
        this.formato = formato;
        this.tamanioMB = tamanioMB;
    }

    @Override
    public String obtenerResumen() {
        return "Recurso Digital -> Título: " + titulo +
                ", Autor: " + autor +
                ", Año: " + anioPublicacion +
                ", Formato: " + formato +
                ", Tamaño: " + tamanioMB + "MB";
    }

}