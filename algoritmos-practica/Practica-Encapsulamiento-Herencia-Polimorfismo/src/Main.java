import java.util.Scanner;
import java.util.ArrayList;

/**
 * Clase Calculadora que muestra sobrecarga de métodos sumar()
 */
class Calculadora {
    // Suma dos enteros
    public int suma(int a, int b){
        return a + b;
    }
    // Suma dos números double
    public double suma(double a, double b){
        return a + b;
    }
    // Suma tres enteros
    public int suma(int a, int b, int c){
        return a + b + c;
    }
}

/**
 * Clase base Animal con método hacerSonido()
 */
class Animal {
    public void hacerSonido(){
        System.out.println("Animal hacer sonido.");
    }
}

/**
 * Clase Perro que sobrescribe hacerSonido()
 */
class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Guau!");
    }
}

/**
 * Clase Gato que sobrescribe hacerSonido()
 */
class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Miau!");
    }
}

/**
 * Clase Vaca que sobrescribe hacerSonido()
 */
class Vaca extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Muu!");
    }
}

/**
 * Clase Empleado con atributos nombre y sueldoBase
 */
class Empleado {
    private String nombre;
    private double sueldoBase;

    // Constructor que inicializa nombre y sueldoBase
    public Empleado(String nombre){
        this.nombre = nombre;
        this.sueldoBase = 1000;
    }

    // Muestra la información del empleado
    public void mostrarInformacion(){
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Sueldo base: " + sueldoBase);
    }

    // Getter para nombre
    public String getNombre(){
        return nombre;
    }

    // Getter para sueldoBase
    public double getSueldoBase(){
        return sueldoBase;
    }
}

/**
 * Clase Gerente que hereda de Empleado y agrega atributo bono
 */
class Gerente extends Empleado {

    private double bono;
    private double sueldoTotal;

    // Constructor que inicializa nombre y bono
    public Gerente(String nombre){
        super(nombre);
        this.bono = 500;
    }

    // Calcula el sueldo total sumando sueldoBase y bono
    public double calcularSueldoTotal() {
        return getSueldoBase() + bono;
    }

    // Sobrescribe mostrarInformacion para incluir bono y sueldo total
    @Override
    public void mostrarInformacion(){
        System.out.println("Nombre del Gerente: " + getNombre());
        System.out.println("Sueldo base: " + getSueldoBase());
        System.out.println("Bono: " + bono);
        System.out.println("Sueldo total: " + calcularSueldoTotal());
    }
}

/**
 * Clase CuentaBancaria con validaciones
 */
class CuentaBancaria {

    private String titular;
    private double saldo;

    // Constructor que verifica que el saldo inicial no sea negativo
    public CuentaBancaria(String titular, double saldo_inicial) {
        this.titular = titular;
        if (saldo_inicial < 0){
            System.out.println("Imposible crear la cuenta, saldo debe ser positivo.");
            this.saldo = 0;
        } else {
            this.saldo = saldo_inicial;
            System.out.println("Cuenta creada correctamente. Saldo inicial: " + saldo);
        }
    }

    // Getter para titular
    public String getTitular() {
        return titular;
    }

    // Getter para saldo
    public double getSaldo() {
        return saldo;
    }

    // Método para depositar dinero, solo acepta valores positivos
    public void depositar(double deposito) {
        if (deposito > 0) {
            this.saldo += deposito;
            System.out.println("Depósito realizado: " + deposito);
        } else {
            System.out.println("El depósito debe ser mayor a cero.");
        }
    }

    // Método para retirar dinero, valida que haya saldo suficiente
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

/**
 * Clase principal para probar todas las funcionalidades
 */
public class Main {
    public static void main(String[] args) {

        // Prueba CuentaBancaria
        CuentaBancaria bancoGalicia = new CuentaBancaria("Nicolás", 5);
        bancoGalicia.depositar(10.5);
        System.out.println("Titular: " + bancoGalicia.getTitular());
        System.out.println("Saldo: " + bancoGalicia.getSaldo());
        bancoGalicia.retirar(5);
        bancoGalicia.retirar(6);

        System.out.println();

        // Prueba Empleado y Gerente
        Empleado empleado_ventas1 = new Empleado("Nicolás");
        empleado_ventas1.mostrarInformacion();

        System.out.println();

        Gerente gerente_ventas = new Gerente("Martín");
        gerente_ventas.mostrarInformacion();

        System.out.println();

        // Prueba Polimorfismo con animales
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

        System.out.println();

        // Prueba sobrecarga de métodos en Calculadora
        Calculadora casio = new Calculadora();
        System.out.println("Suma de dos enteros 5 + 5: " + casio.suma(5, 5));
        System.out.println("Suma de dos double 5.5 + 5.5: " + casio.suma(5.5, 5.5));
        System.out.println("Suma de tres enteros 5 + 5 + 5: " + casio.suma(5, 5,5));
    }
}
