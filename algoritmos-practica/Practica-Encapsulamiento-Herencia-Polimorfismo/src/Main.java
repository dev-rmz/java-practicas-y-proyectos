
/* Ejercicio 1 - Crea una clase CuentaBancaria con los siguientes atributos privados: titular (String), saldo (double)
Agregá métodos públicos para: Obtener el titular y saldo, Depositar un monto (solo si es positivo), Retirar un monto
(solo si hay saldo suficiente) Probalo desde un main() creando una cuenta, depositando y retirando dinero.

Ejercicio 2 - Validaciones: Modificá la clase anterior para que: No permita saldo negativo al crear la cuenta
Si se intenta retirar más de lo disponible, que muestre un mensaje y no reste.

Ejercicio 3 - Clase Empleado y Gerente. Creá una clase Empleado con: nombre y sueldoBase Método mostrarInformacion()
Creá una clase Gerente que herede de Empleado y tenga: bono como atributo adicional Redefiní mostrarInformacion() para
que muestre también el bono y el sueldo total. Probalo desde main() con un Empleado y un Gerente.

Ejercicio 5 - Zoológico (Overriding) Clase Animal con método hacerSonido() Clases hijas: Perro, Gato, Vaca, cada una
sobrescribiendo hacerSonido() En el main(), creá un array/lista de Animal y guardá instancias de cada uno.
Usá un for para recorrerlos y llamar a hacerSonido()

Ejercicio 6 - Calculadora (Overloading) Crea una clase Calculadora con varios métodos sumar(): sumar(int, int)
sumar(double, double) sumar(int, int, int) Mostrá cómo funciona la sobrecarga de métodos.*/

import java.util.Scanner;
import java.util.ArrayList;

class Calculadora{
    public int suma(int a, int b){
        return a + b;
    }
    public double suma(double a, double b){
        return a + b;
    }
    public int suma(int a, int b, int c){
        return a + b + c;
    }
}
class Animal{
    public void hacerSonido(){
        System.out.println("Animal hacer sonido.");
    }
}
class Perro extends Animal{
    @Override
    public void hacerSonido() {
        System.out.println("Guau!");
    }
}
class Gato extends Animal{
    @Override
    public void hacerSonido() {
        System.out.println("Miau!");
    }
}
class Vaca extends Animal{
    @Override
    public void hacerSonido() {
        System.out.println("Muu!");
    }
}
class Empleado{
    private String nombre;
    private double sueldoBase;

    public Empleado(String nombre){
        this.nombre = nombre;
        this.sueldoBase = 1000;
    }
    public void mostrarInformacion(){
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Sueldo base: " + sueldoBase);
    }
    public String getNombre(){
        return nombre;
    }
    public double getSueldoBase(){
        return sueldoBase;
    }
}
class Gerente extends Empleado{

    private double bono;
    private double sueldoTotal;

    public Gerente(String nombre){
        super(nombre);
        this.bono = 500;
    }
    public double calcularSueldoTotal() {
        return getSueldoBase() + bono;
    }
    public void mostrarInformacion(){
        System.out.println("Nombre del Gerente: " + getNombre());
        System.out.println("Sueldo base: " + getSueldoBase());
        System.out.println("Bono: " + bono);
        System.out.println("Sueldo total: " + calcularSueldoTotal());
    }
}
class CuentaBancaria {

    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo_inicial) {
        this.titular = titular;
        if (saldo_inicial < 0){
            System.out.println("Imposible crear la cuenta, saldo debe ser positivo.");
        }else {
            this.saldo += saldo_inicial;
            System.out.println("Cuenta creada correctamente. Saldo incial: " + saldo);
        }
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double deposito) {
        if (deposito > 0) {
            this.saldo += deposito;
            System.out.println("Depósito realizado: " + deposito);
        } else {
            System.out.println("El depósito debe ser mayor a cero.");
        }
    }

    public double retirar(double retiro) {
        if (this.saldo < retiro) {
            System.out.println("Saldo insuficiente.");
            return 0;
        } else {
            this.saldo -= retiro;
            System.out.println("Retiro: " + retiro);
            System.out.println("Saldo restante: " + saldo);
            return retiro;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        CuentaBancaria bancoGalicia = new CuentaBancaria("Nicolás", 5);
        bancoGalicia.depositar(10.5);
        System.out.println("Titular: " + bancoGalicia.getTitular());
        System.out.println("Saldo: " + bancoGalicia.getSaldo());
        bancoGalicia.retirar(5);
        bancoGalicia.retirar(6);
        Empleado empleado_ventas1 = new Empleado("nicolas");
        empleado_ventas1.mostrarInformacion();
        System.out.println();

        Gerente gerente_ventas = new Gerente("martin");
        gerente_ventas.mostrarInformacion();

        Perro animal1 = new Perro();
        Gato animal2 = new Gato();
        Vaca animal3 = new Vaca();
        ArrayList<Animal> lista_animales = new ArrayList<>();
        lista_animales.add(animal1);
        lista_animales.add(animal2);
        lista_animales.add(animal3);

        for (Animal animal : lista_animales){
            animal.hacerSonido();
        }

        Calculadora casio = new Calculadora();
        System.out.println("Suma de dos enteros 5 + 5: " + casio.suma(5, 5));
        System.out.println("Suma de dos double 5.5 + 5.5: " + casio.suma(5.5, 5.5));
        System.out.println("Suma de tres enteros 5 + 5 + 5: " + casio.suma(5, 5,5));

    }
}