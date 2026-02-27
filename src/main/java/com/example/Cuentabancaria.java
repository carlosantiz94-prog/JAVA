package com.example;

public class CuentaBancaria {

    // Atributos privados (encapsulamiento)
    private String titular;
    private double saldo;

    // 1️ Constructor con validación
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;

        if (saldoInicial < 0) {
            this.saldo = 0;
        } else {
            this.saldo = saldoInicial;
        }
    }

    // 2️ Getter y Setter del titular
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // 2️ SOLO Getter del saldo (sin setter)
    public double getSaldo() {
        return saldo;
    }

    // 3️ Método depositar
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito realizado correctamente.");
        } else {
            System.out.println("Error: La cantidad debe ser mayor que 0.");
        }
    }

    // 4️ Método retirar
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad debe ser mayor que 0.");
        } else if (cantidad > saldo) {
            System.out.println("Error: Fondos insuficientes.");
        } else {
            saldo -= cantidad;
            System.out.println("Retiro realizado correctamente.");
        }
    }
}