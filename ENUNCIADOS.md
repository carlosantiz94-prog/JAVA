# Enunciados de los Ejercicios

Implementa las siguientes clases en el paquete `com.example`.

---

## Ejercicio 1: Constructores y Sobrecarga
### Clase: `Libro.java`

**Objetivo**: Practicar la sobrecarga de constructores.

**Atributos (privados):**
*   `titulo` (String)
*   `autor` (String)
*   `paginas` (int)

**Requerimientos:**
1.  **Constructor Vacío**: Inicializa título="Desconocido", autor="Anónimo", paginas=0.
2.  **Constructor con Título y Autor**: Recibe título y autor. Inicializa paginas=0.
3.  **Constructor Completo**: Recibe título, autor y paginas.
4.  **Método**: `mostrarDetalles()` que imprima: `"Libro: [titulo] | Autor: [autor] | Páginas: [paginas]"`.

**Ejemplo de prueba en `Main.java`:**
```java
Libro l1 = new Libro(); 
l1.mostrarDetalles(); // Salida esperada con valores por defecto

Libro l2 = new Libro("Harry Potter", "J.K. Rowling");
l2.mostrarDetalles();

Libro l3 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1200);
l3.mostrarDetalles();
```

---

## Ejercicio 2: Encapsulamiento
### Clase: `CuentaBancaria.java`

**Objetivo**: Practicar getters, setters y control de acceso.

**Atributos (privados):**
*   `titular` (String)
*   `saldo` (double)

**Requerimientos:**
1.  **Constructor**: Recibe `titular` y `saldoInicial`.
    *   *Validación*: Si `saldoInicial` < 0, asignar 0.
2.  **Getters y Setters**:
    *   `getTitular()`, `setTitular(String)`.
    *   `getSaldo()`: **SOLO GETTER**. No crear setter. El saldo solo cambia al depositar o retirar.
3.  **Método `depositar(double cantidad)`**:
    *   Suma `cantidad` al saldo. *Validar que cantidad > 0*.
4.  **Método `retirar(double cantidad)`**:
    *   Resta `cantidad` al saldo. *Validar que cantidad > 0 y que hay saldo suficiente*.

**Ejemplo de prueba en `Main.java`:**
```java
CuentaBancaria cuenta = new CuentaBancaria("Maria", 500);
cuenta.depositar(200);
System.out.println(cuenta.getSaldo()); // Debería ser 700
cuenta.retirar(1000); // Debería mostrar error de fondos insuficientes
```

---

## Ejercicio 3: Lógica y Métodos
### Clase: `Estudiante.java`

**Objetivo**: Practicar lógica dentro de métodos.

**Atributos (privados):**
*   `nombre` (String)
*   `edad` (int)
*   `promedio` (double)

**Requerimientos:**
1.  **Constructores**: Uno vacío (valores por defecto) y otro completo (recibe los 3 datos).
2.  **Getters y Setters**: Para todos los atributos.
    *   *Validación*: En `setEdad`, asegurar que el valor sea > 0.
3.  **Método `haAprobado()`**: Retorna `boolean`.
    *   Devuelve `true` si `promedio` >= 3.0, de lo contrario `false`.
4.  **Método `mostrarInfo()`**: Imprime nombre, edad, promedio y si aprobó o no (usando `haAprobado()`).

**Ejemplo de prueba en `Main.java`:**
```java
Estudiante e = new Estudiante("Pedro", 21, 2.5);
e.mostrarInfo(); // Debería indicar REPROBADO
```
