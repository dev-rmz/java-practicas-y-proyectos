//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nivel 2: Bucles y estructuras de control.");

        System.out.println("Ejercicio 1: Imprimir los números del 1 al 100.");
        for (int j = 1; j <= 100; j++) {
            System.out.print(j + " ");
        }
        System.out.println();


        System.out.println("Ejercicio 2: Tabla de multiplicar de un número ingresado.");
        System.out.print("Ingresa un numero: ");
        int numero_tabla = scanner.nextInt();
        for (int j = 1; j <= 10; j++) {
            System.out.println(numero_tabla + " x " + j + " = " + numero_tabla * j);
        }


        System.out.println("Ejercicio 3: Sumar los números pares del 1 al 100.");

        int suma = 0;
        for (int j = 1; j <= 100; j++){
            if (j % 2 == 0){
                suma = suma + j;
            }
        }
        System.out.println("Suma de los numeros pares hasta el 100: " + suma);


        System.out.println("Ejercicio 4: Contar cuántos positivos, negativos y ceros hay en un conjunto de N números ingresados por el usuario");

        int cant_positivos = 0;
        int cant_negativos = 0;
        int cant_ceros = 0;

        System.out.print("Ingrese la cantidad de números: ");
        int cant_numeros = scanner.nextInt();

        for (int j = 1; j <= cant_numeros; j++) {
            System.out.print("Ingrese número: ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                cant_ceros++;
            } else if (numero > 0) {
                cant_positivos++;
            } else {
                cant_negativos++;
            }
        }

        System.out.println("Positivos: " + cant_positivos +
                ", Negativos: " + cant_negativos +
                ", Ceros: " + cant_ceros);
    }
}