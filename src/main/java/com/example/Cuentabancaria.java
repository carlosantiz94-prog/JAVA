package com.example;

public class Cuentabancaria {

    // 1. Atributos privados
    private String titular;
    private double saldo;

    // 2. Constructor con validación inicial
    public Cuentabancaria(String titular, double saldoInicial) {
        this.titular = titular;
        
        // Validación: Si el saldo inicial es negativo, se pone en 0
        if (saldoInicial < 0) {
            this.saldo = 0;
        } else {
            this.saldo = saldoInicial;
        }
    }

    // 3. Getters y Setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Solo Getter para saldo (Seguridad)
    public double getSaldo() {
        return saldo;
    }

    // 4. Método para depositar
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
        } else {
            System.out.println("Error: La cantidad a depositar debe ser positiva.");
        }
    }

    // 5. Método para retirar
    public void retirar(double cantidad) {
        if (cantidad <= 0 && cantidad <= this.saldo) {
            this.saldo -= cantidad;
        } else if (cantidad > this.saldo) {
            System.out.println("Error: Fondos insuficientes para retirar " + cantidad);
        } else 
            System.out.println("Retiro exitoso. Nuevo saldo: " + this.saldo);
        }
    }
}
