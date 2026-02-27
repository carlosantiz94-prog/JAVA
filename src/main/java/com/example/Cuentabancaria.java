package com.example;

public class Cuentabancaria {
    // Atributos privados: nadie puede verlos o cambiarlos fuera de esta clase
    private String titular;
    private double saldo;

    // 1. Constructor
    public Cuentabancaria(String titular, double saldoInicial) {
        this.titular = titular;
        // Validación: si el saldo inicial es negativo, se pone en 0
        if (saldoInicial < 0) {
            this.saldo = 0;
        } else {
            this.saldo = saldoInicial;
        }
    }

    // 2. Getters y Setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Solo Getter para saldo (No hay setter por seguridad)
    public double getSaldo() {
        return saldo;
    }

    // 3. Método depositar
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
        } else {
            System.out.println("Error: La cantidad a depositar debe ser positiva.");
        }
    }

    // 4. Método retirar
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= this.saldo) {
            this.saldo -= cantidad;
        } else if (cantidad > this.saldo) {
            System.out.println("Error: Fondos insuficientes para retirar " + cantidad);
        } else {
            System.out.println("Error: La cantidad a retirar debe ser positiva.");
        }
    }
}
