import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nivel 2: Bucles y estructuras de control.");

        // Ejercicio 1: Imprimir los números del 1 al 100
        System.out.println("Ejercicio 1: Imprimir los números del 1 al 100.");
        for (int j = 1; j <= 100; j++) {
            System.out.print(j + " ");
        }
        System.out.println(); // Salto de línea después del ciclo

        // Ejercicio 2: Tabla de multiplicar de un número ingresado
        System.out.println("Ejercicio 2: Tabla de multiplicar de un número ingresado.");
        System.out.print("Ingresa un número: ");
        int numero_tabla = scanner.nextInt();
        for (int j = 1; j <= 10; j++) {
            System.out.println(numero_tabla + " x " + j + " = " + (numero_tabla * j));
        }

        // Ejercicio 3: Sumar los números pares del 1 al 100
        System.out.println("Ejercicio 3: Sumar los números pares del 1 al 100.");
        int suma = 0;
        for (int j = 1; j <= 100; j++) {
            if (j % 2 == 0) {
                suma += j; // Suma solo si es par
            }
        }
        System.out.println("Suma de los números pares hasta el 100: " + suma);

        // Ejercicio 4: Contar positivos, negativos y ceros en N números ingresados por el usuario
        System.out.println("Ejercicio 4: Contar positivos, negativos y ceros.");

        int cant_positivos = 0;
        int cant_negativos = 0;
        int cant_ceros = 0;

        System.out.print("Ingrese la cantidad de números: ");
        int cant_numeros = scanner.nextInt();

        // Ciclo para pedir N números y contar según su valor
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
