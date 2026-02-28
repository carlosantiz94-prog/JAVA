package com.example;

public class Main {

    public static void main(String[] args) {

        // Constructor vacío
        Libro l1 = new Libro();
        l1.mostrarDetalles();

        // Constructor con título y autor
        Libro l2 = new Libro("Harry Potter", "J.K. Rowling");
        l2.mostrarDetalles();

        // Constructor completo
        Libro l3 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1200);
        l3.mostrarDetalles();


        System.out.println("-------------");
        

        //* ejercicio2 */
        Cuentasbancarias cuenta = new Cuentasbancarias("camilo", 500);
        cuenta.depositar(200);
        System.out.println(cuenta.getSaldo()); // Debería ser 700
        cuenta.retirar(1000); // Debería mostrar error de fondos insuficiente


        System.out.println("-------------");


        //* ejercicio 3 */
        Estudiante e = new Estudiante("Pedro", 21, 2.5);
e.mostrarInfo(); // Debería indicar REPROBADO

    }
}