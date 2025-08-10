import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Se crea el objeto Scanner para leer datos del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nivel 2: Bucles y estructuras de control.");

        // ========================
        // Ejercicio 1: Imprimir los números del 1 al 100
        // ========================
        System.out.println("Ejercicio 1: Imprimir los números del 1 al 100.");
        for (int j = 1; j <= 100; j++) {
            System.out.print(j + " "); // Imprime los números en una sola línea
        }
        System.out.println(); // Salto de línea después del ciclo

        // ========================
        // Ejercicio 2: Tabla de multiplicar de un número ingresado
        // ========================
        System.out.println("Ejercicio 2: Tabla de multiplicar de un número ingresado.");
        System.out.print("Ingresa un número: ");
        int numero_tabla = scanner.nextInt(); // Guarda el número que el usuario ingresa

        // Genera la tabla de multiplicar del número ingresado
        for (int j = 1; j <= 10; j++) {
            System.out.println(numero_tabla + " x " + j + " = " + (numero_tabla * j));
        }

        // ========================
        // Ejercicio 3: Sumar los números pares del 1 al 100
        // ========================
        System.out.println("Ejercicio 3: Sumar los números pares del 1 al 100.");
        int suma = 0;

        // Recorre del 1 al 100 y suma solo los pares
        for (int j = 1; j <= 100; j++) {
            if (j % 2 == 0) { // Verifica si el número es par
                suma += j;    // Acumula el valor
            }
        }
        System.out.println("Suma de los números pares hasta el 100: " + suma);

        // ========================
        // Ejercicio 4: Contar positivos, negativos y ceros
        // ========================
        System.out.println("Ejercicio 4: Contar positivos, negativos y ceros.");

        // Variables contadoras
        int cant_positivos = 0;
        int cant_negativos = 0;
        int cant_ceros = 0;

        System.out.print("Ingrese la cantidad de números: ");
        int cant_numeros = scanner.nextInt(); // Cantidad total de números que se van a ingresar

        // Bucle para leer cada número y clasificarlo
        for (int j = 1; j <= cant_numeros; j++) {
            System.out.print("Ingrese número: ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                cant_ceros++; // Si es cero
            } else if (numero > 0) {
                cant_positivos++; // Si es positivo
            } else {
                cant_negativos++; // Si es negativo
            }
        }

        // Muestra los resultados finales
        System.out.println("Positivos: " + cant_positivos +
                ", Negativos: " + cant_negativos +
                ", Ceros: " + cant_ceros);
    }
}

