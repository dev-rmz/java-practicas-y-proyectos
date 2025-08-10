import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

// Clase Persona con atributos nombre y edad, y método para saludar
class Persona {

    String nombre;
    int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método que imprime un saludo con el nombre y la edad
    public void saludar(){
        System.out.println("Hola mi nombre es " + nombre + " y tengo " + edad + " años.");
    }
}

// Clase Producto que representa un producto con nombre, precio, IVA y precio final
class Producto{
    String nombre;
    float precio;
    float IVA;
    float precio_final;

    public Producto(String nombre, float precio, float IVA){
        this.nombre = nombre;
        this.precio = precio;
        this.IVA = IVA;
    }

    // Método para calcular el precio final sumando el IVA
    public void calcular_IVA(){
        precio_final = precio + (precio * (IVA/100));
        System.out.println("El precio final del " + nombre + ": " + precio_final);
    }
}

// Clase CuentaBancaria con saldo privado y métodos para consultar saldo, depositar y extraer dinero
class CuentaBancaria{
    private float saldo;

    public CuentaBancaria(){
        this.saldo = 0; // Saldo inicial cero
    }

    // Método para mostrar el saldo actual
    public void consultar_saldo(){
        System.out.println("Su saldo es: " + saldo);
    }

    // Método para depositar dinero y mostrar mensaje
    public void depositar(float deposito){
        saldo = saldo + deposito;
        System.out.println("Usted depositó: "+ deposito);
    }

    // Método para extraer dinero, actualizar saldo y mostrar mensaje
    public float extraer(float extraccion){
        saldo = saldo - extraccion;
        System.out.println("Usted retiró: "+ extraccion);
        return saldo;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Nivel 4: Programación Orientada a Objetos");
        System.out.println();

        // Ejercicio 1: Crear y usar la clase Persona
        System.out.println("Ejercicio 1: Crear una clase Persona con atributos y método saludar().");
        Persona persona1 = new Persona("Nicolas", 31);
        persona1.saludar();
        System.out.println();

        // Ejercicio 2: Crear y usar la clase Producto para calcular precio con IVA
        System.out.println("Ejercicio 2: Crear una clase Producto con precio e IVA. Calcular el precio final");
        Producto alfajor = new Producto("jorgito", 3000, 21);
        alfajor.calcular_IVA();
        System.out.println();

        // Ejercicio 3: Usar clase CuentaBancaria para depositar, extraer y consultar saldo
        System.out.println("Ejercicio 3: Clase CuentaBancaria con métodos depositar() y extraer().");
        CuentaBancaria nacion = new CuentaBancaria();
        nacion.depositar(20);
        nacion.consultar_saldo();
        nacion.depositar(5);
        nacion.consultar_saldo();
        float extraccion = nacion.extraer(10);
        nacion.consultar_saldo();
    }
}
