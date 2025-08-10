# Práctica: Clases, Herencia, Polimorfismo y Sobrecarga en Java

## Descripción General

Esta práctica abarca varios conceptos clave de programación orientada a objetos en Java, desarrollados en ejercicios independientes:

1. **CuentaBancaria**  
   - Clase que maneja un titular y saldo privado.  
   - Métodos para depositar y retirar con validaciones para evitar saldo negativo.  
   - Se valida el saldo inicial para que no sea negativo.

2. **Empleado y Gerente**  
   - Clase `Empleado` con atributos `nombre` y `sueldoBase`.  
   - Clase `Gerente` que hereda de `Empleado` y agrega un atributo `bono`.  
   - Método sobrescrito `mostrarInformacion()` en `Gerente` que muestra sueldo total.

3. **Zoológico (Polimorfismo y Overriding)**  
   - Clase base `Animal` con método `hacerSonido()`.  
   - Clases derivadas `Perro`, `Gato` y `Vaca` que sobrescriben `hacerSonido()`.  
   - En el `main` se usa una lista de `Animal` y se llama a `hacerSonido()` para cada instancia, demostrando polimorfismo.

4. **Calculadora (Sobrecarga de métodos)**  
   - Clase `Calculadora` con métodos `suma()` sobrecargados para distintos parámetros (int, double, y cantidad de argumentos).

## Resolución

- Se utilizan clases con encapsulamiento y validaciones para asegurar integridad de datos (`CuentaBancaria`).  
- Se implementa herencia para compartir atributos y comportamientos entre `Empleado` y `Gerente`.  
- Se usa el polimorfismo y overriding para que distintas clases de animales respondan diferente al mismo método.  
- Se demuestra sobrecarga de métodos con distintas firmas en la clase `Calculadora`.