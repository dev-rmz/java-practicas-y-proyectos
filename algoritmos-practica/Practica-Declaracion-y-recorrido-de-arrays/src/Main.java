/*Ejercicio 1 – Declaración y recorrido de arrays
Objetivo: Practicar la creación de arrays, recorrerlos con bucles y mostrar sus elementos.
Crea un programa que:
- Declare un array de enteros de tamaño 5 y lo inicialice con valores dados por el usuario.
- Recorra el array mostrando todos sus elementos en una sola línea.
- Explique en comentarios ventajas y limitaciones de usar arrays.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];  // Declaración de un array de tamaño fijo 5

        // Ingreso de valores por parte del usuario
        for (int i = 0; i < numeros.length; i++){
            System.out.print("Ingrese un numero entero: ");
            numeros[i] = scanner.nextInt();
            scanner.nextLine();
        }

        // Recorrido y despliegue de los elementos del array en una sola línea
        System.out.print("Numeros: ");
        for (int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        // Ventajas y limitaciones de arrays:
        /*
         * Ventajas:
         *  - Acceso rápido a los elementos mediante índice (tiempo constante O(1)).
         *  - Fácil de usar y entender.
         *
         * Limitaciones:
         *  - Tamaño fijo: no se puede modificar una vez declarado.
         *  - Inserciones o eliminaciones pueden ser costosas o requieren crear un nuevo array.
         */
    }
}