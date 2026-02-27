package com.example;

public class Main {
    public static void main(String[] args) {
        // Prueba 1: Usando el constructor vacío
        Libro l1 = new Libro(); 
        l1.mostrarDetalles(); 

        // Prueba 2: Usando título y autor
        Libro l2 = new Libro("Cancion de Hielo y Fuego", "George R.R. Martin");
        l2.mostrarDetalles();

        // Prueba 3: Usando el constructor completo
        Libro l3 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1200);
        l3.mostrarDetalles();

        //ejercicio2

        Cuentabancaria cuenta = new Cuentabancaria("Maria", 500);
        cuenta.depositar(200);
        System.out.println(cuenta.getSaldo()); // Debería ser 700
        cuenta.retirar(1000); // Debería mostrar error de fondos insuficiente

        //ejercicio3

        // En Main.java
        Estudiante e = new Estudiante("Pedro", 21, 2.5);
        e.mostrarInfo(); // Debería indicar REPROBADO
    }
    
}
