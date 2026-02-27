package com.example;

public class Libro {

    // 1. Atributos privados
    private String titulo;
    private String autor;
    private int paginas;

    // 2. Constructor Vacío
    public Libro() {
        this.titulo = "Desconocido";
        this.autor = "Anónimo";
        this.paginas = 0;
    }

    // 3. Constructor con Título y Autor (Sobrecarga)
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = 0;
    }

    // 4. Constructor Completo (Sobrecarga)
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // 5. Método para mostrar detalles
    public void mostrarDetalles() {
        System.out.println("Libro: " + titulo + " | Autor: " + autor + " | Páginas: " + paginas);
    }
}



