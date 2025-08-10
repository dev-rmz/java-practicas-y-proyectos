/*Ejercicio 2 – Búsqueda en arrays
Objetivo: Implementar búsqueda lineal y búsqueda binaria en un array.
Declara un array ordenado de enteros.
Pide al usuario un número para buscar.
Implementa:
Búsqueda lineal (recorre elemento por elemento).
Búsqueda binaria (requiere array ordenado).
Indica si el elemento fue encontrado y en qué posición.
Ventajas de búsqueda binaria: Mucho más rápida para grandes volúmenes de datos.
Limitaciones: Solo funciona en arrays ordenados.
*/
import java.util.Scanner;

public class Main {

    // Búsqueda binaria recursiva
    public static int busquedaBinaria(int[] array, int buscado, int inicio, int fin) {
        if (inicio > fin) {
            return -1; // No encontrado
        }

        int medio = (inicio + fin) / 2;

        if (buscado == array[medio]) {
            return medio;
        } else if (buscado < array[medio]) {
            return busquedaBinaria(array, buscado, inicio, medio - 1);
        } else {
            return busquedaBinaria(array, buscado, medio + 1, fin);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {1, 2, 3, 4, 5};

        System.out.print("Ingrese número a buscar: ");
        int numeroBuscado = scanner.nextInt();

        // Búsqueda lineal
        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeroBuscado == numeros[i]) {
                System.out.println("[Búsqueda lineal] Número encontrado en la posición: " + i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("[Búsqueda lineal] Número no encontrado.");
        }

        // Búsqueda binaria iterativa
        int inicio = 0, fin = numeros.length - 1;
        encontrado = false;
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (numeroBuscado == numeros[medio]) {
                System.out.println("[Búsqueda binaria iterativa] Número encontrado en la posición: " + medio);
                encontrado = true;
                break;
            } else if (numeroBuscado < numeros[medio]) {
                fin = medio - 1;
            } else {
                inicio = medio + 1;
            }
        }
        if (!encontrado) {
            System.out.println("[Búsqueda binaria iterativa] Número no encontrado.");
        }

        // Búsqueda binaria recursiva
        int posicion = busquedaBinaria(numeros, numeroBuscado, 0, numeros.length - 1);
        if (posicion != -1) {
            System.out.println("[Búsqueda binaria recursiva] Número encontrado en la posición: " + posicion);
        } else {
            System.out.println("[Búsqueda binaria recursiva] Número no encontrado.");
        }

        /*
         * Ventajas de búsqueda binaria:
         *  - Mucho más rápida en grandes volúmenes de datos (O(log n)) frente a O(n) de la búsqueda lineal.
         *
         * Limitaciones:
         *  - Requiere que el array esté previamente ordenado.
         */
    }
}