package com.bancolombia.CursoSpringBootconMaven.ejemplo4;


class LibroElectronico extends RecursoDigital {
    private int numeroPaginas;
    private boolean tieneDRM;

    public LibroElectronico(String titulo, String autor, int anioPublicacion,
                            String formato, double tamanioMB,
                            int numeroPaginas, boolean tieneDRM) {
        super(titulo, autor, anioPublicacion, formato, tamanioMB);
        this.numeroPaginas = numeroPaginas;
        this.tieneDRM = tieneDRM;
    }

    @Override
    public String obtenerResumen() {
        return "Libro Electrónico -> Título: " + titulo +
                ", Autor: " + autor +
                ", Año: " + anioPublicacion +
                ", Formato: " + formato +
                ", Tamaño: " + tamanioMB + "MB" +
                ", Páginas: " + numeroPaginas +
                ", DRM: " + (tieneDRM ? "Sí" : "No");
    }
}
