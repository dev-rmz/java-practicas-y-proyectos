public class Main {

    // Variables de ejemplo para probar los ejercicios
    static int n = 10;
    static int m = 5;

    public static void main(String[] args) {

        // Ejercicio 1: Complejidad O(n)
        System.out.println("Ejercicio 1: Complejidad O(n)");
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        /*
         * Complejidad temporal: O(n)
         * Justificación: El bucle se ejecuta n veces y dentro de cada iteración se realiza una operación constante.
         */

        // Ejercicio 2: Complejidad O(n²)
        System.out.println("\nEjercicio 2: Complejidad O(n²)");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + j);
            }
        }
        /*
         * Complejidad temporal: O(n²)
         * Justificación: Dos bucles anidados que recorren n elementos cada uno, resultando en n * n iteraciones.
         */

        // Ejercicio 3: Complejidad O(n × m)
        System.out.println("\nEjercicio 3: Complejidad O(n × m)");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println(i + j);
            }
        }
        /*
         * Complejidad temporal: O(n × m)
         * Justificación: Bucle externo itera n veces y bucle interno m veces, n y m independientes.
         */

        // Ejercicio 4: Complejidad O(log n)
        System.out.println("\nEjercicio 4: Complejidad O(log n)");
        for (int i = 1; i < n; i = i * 2) {
            System.out.println(i);
        }
        /*
         * Complejidad temporal: O(log n)
         * Justificación: El índice i se multiplica por 2 cada iteración, reduciendo las iteraciones a log2(n).
         */

        // Ejercicio 5: Complejidad O(n²)
        System.out.println("\nEjercicio 5: Complejidad O(n²)");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        System.out.println("Suma final: " + sum);
        /*
         * Complejidad temporal: O(n²)
         * Justificación: El bucle interno itera i veces, sumando en promedio n/2 iteraciones por ciclo externo.
         */

        // Ejercicio 6: Complejidad O(n) - Recursión lineal
        System.out.println("\nEjercicio 6: Complejidad O(n)");
        recursiveFuncLineal(n);

        // Ejercicio 7: Complejidad O(log n) - Recursión logarítmica
        System.out.println("\nEjercicio 7: Complejidad O(log n)");
        recursiveFuncLog(n);
    }

    /**
     * Función recursiva lineal: se llama con n-1 hasta llegar a 1.
     * Complejidad O(n)
     */
    public static void recursiveFuncLineal(int n) {
        if (n <= 1) return;
        System.out.println("Llamada recursiva con n = " + n);
        recursiveFuncLineal(n - 1);
    }

    /**
     * Función recursiva logarítmica: se llama con n/2 hasta llegar a 1.
     * Complejidad O(log n)
     */
    public static void recursiveFuncLog(int n) {
        if (n <= 1) return;
        System.out.println("Llamada recursiva con n = " + n);
        recursiveFuncLog(n / 2);
    }
}
