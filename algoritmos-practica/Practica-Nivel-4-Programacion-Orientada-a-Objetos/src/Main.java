import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Persona {

    String nombre;
    int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public void saludar(){
        System.out.println("Hola mi nombre es " + nombre + " y tengo " + edad + " años.");
    }
}
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
    public void calcular_IVA(){
        precio_final = precio + (precio * (IVA/100));
        System.out.println("El precio final del " + nombre + ": " + precio_final);
    }
}
class CuentaBancaria{
    private float saldo;

    public CuentaBancaria(){
        this.saldo = 0;
    }
    public void consultar_saldo(){
        System.out.println("Su saldo es: " + saldo);
    }

    public void depositar(float deposito){
        saldo = saldo + deposito;
        System.out.println("Usted deposito: "+ deposito);
    }

    public float extraer(float extraccion){
        saldo = saldo - extraccion;
        System.out.println("Ustes retiro "+ extraccion);
        return saldo;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("Nivel 4: Programación Orientada a Objetos");
        System.out.println();
        System.out.println("Ejercicio 1: Crear una clase Persona con atributos y método saludar().");

        Persona persona1 = new Persona("Nicolas", 31);
        persona1.saludar();
        System.out.println();

        System.out.println("Ejercicio 2: Crear una clase Producto con precio e IVA. Calcular el precio final");

        Producto alfajor = new Producto("jorgito",3000,21);
        alfajor.calcular_IVA();
        System.out.println();


        System.out.println("Ejercicio 3: Clase CuentaBancaria con métodos depositar() y extraer().");
        CuentaBancaria nacion = new CuentaBancaria();
        nacion.depositar(20);
        nacion.consultar_saldo();
        nacion.depositar(5);
        nacion.consultar_saldo();
        float extraccion;
        extraccion = nacion.extraer(10);
        nacion.consultar_saldo();

    }
}