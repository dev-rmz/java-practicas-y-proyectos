import java.util.Scanner;

public class Main {

    /**
     * Búsqueda binaria recursiva.
     * @param array Array ordenado donde buscar.
     * @param buscado Valor a buscar.
     * @param inicio Índice inicial del rango de búsqueda.
     * @param fin Índice final del rango de búsqueda.
     * @return Índice donde se encuentra el valor o -1 si no está.
     */
    public static int busquedaBinaria(int[] array, int buscado, int inicio, int fin) {
        if (inicio > fin) {
            return -1; // Caso base: no encontrado
        }

        int medio = (inicio + fin) / 2;

        if (buscado == array[medio]) {
            return medio; // Elemento encontrado
        } else if (buscado < array[medio]) {
            // Buscar en la mitad izquierda
            return busquedaBinaria(array, buscado, inicio, medio - 1);
        } else {
            // Buscar en la mitad derecha
            return busquedaBinaria(array, buscado, medio + 1, fin);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array ordenado donde se realizará la búsqueda
        int[] numeros = {1, 2, 3, 4, 5};

        // Solicitar número a buscar al usuario
        System.out.print("Ingrese número a buscar: ");
        int numeroBuscado = scanner.nextInt();

        // ----- Búsqueda lineal -----
        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeroBuscado == numeros[i]) {
                System.out.println("[Búsqueda lineal] Número encontrado en la posición: " + i);
                encontrado = true;
                break; // Terminar búsqueda al encontrar el elemento
            }
        }
        if (!encontrado) {
            System.out.println("[Búsqueda lineal] Número no encontrado.");
        }

        // ----- Búsqueda binaria iterativa -----
        int inicio = 0;
        int fin = numeros.length - 1;
        encontrado = false;

        // Mientras el rango de búsqueda sea válido
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (numeroBuscado == numeros[medio]) {
                System.out.println("[Búsqueda binaria iterativa] Número encontrado en la posición: " + medio);
                encontrado = true;
                break; // Elemento encontrado
            } else if (numeroBuscado < numeros[medio]) {
                fin = medio - 1; // Buscar en la mitad izquierda
            } else {
                inicio = medio + 1; // Buscar en la mitad derecha
            }
        }
        if (!encontrado) {
            System.out.println("[Búsqueda binaria iterativa] Número no encontrado.");
        }

        // ----- Búsqueda binaria recursiva -----
        int posicion = busquedaBinaria(numeros, numeroBuscado, 0, numeros.length - 1);
        if (posicion != -1) {
            System.out.println("[Búsqueda binaria recursiva] Número encontrado en la posición: " + posicion);
        } else {
            System.out.println("[Búsqueda binaria recursiva] Número no encontrado.");
        }

        /*
         * Ventajas de la búsqueda binaria:
         *  - Es mucho más eficiente en arrays grandes (O(log n)) frente a O(n) de la búsqueda lineal.
         *
         * Limitaciones:
         *  - Solo se puede aplicar si el array está ordenado.
         */
    }
}
