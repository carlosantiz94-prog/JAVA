package com.example;

public class Estudiante {
    // 1. Atributos privados
    private String nombre;
    private int edad;
    private double promedio;

    // 2. Constructor Vacío
    public Estudiante() {
        this.nombre = "Sin nombre";
        this.edad = 18;
        this.promedio = 0.0;
    }

    // 3. Constructor Completo
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        setEdad(edad); // Usamos el setter para aprovechar la validación
        this.promedio = promedio;
    }

    // 4. Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad debe ser mayor a 0.");
        }
    }

    public double getPromedio() { return promedio; }
    public void setPromedio(double promedio) { this.promedio = promedio; }

    // 5. Método Lógico: haAprobado
    public boolean haAprobado() {
        return this.promedio >= 3.0;
    }

    // 6. Método: mostrarInfo
    public void mostrarInfo() {
        String estado = haAprobado() ? "Aprobado" : "Reprobado";
        System.out.println("--- Reporte de Estudiante ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
        System.out.println("Estado: " + estado);
    }
}
