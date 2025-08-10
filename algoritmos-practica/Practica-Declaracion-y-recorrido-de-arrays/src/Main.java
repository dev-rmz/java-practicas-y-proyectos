import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaración de un array de enteros con tamaño fijo 5
        int[] numeros = new int[5];

        // Pedir al usuario que ingrese 5 números enteros para llenar el array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número entero: ");
            numeros[i] = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
        }

        // Recorrer el array y mostrar todos sus elementos en una sola línea
        System.out.print("Números ingresados: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println(); // Salto de línea

        /*
         * Ventajas de usar arrays:
         *  - Permiten acceso rápido a cualquier elemento por índice (tiempo constante O(1)).
         *  - Son sencillos y fáciles de entender y usar.
         *
         * Limitaciones de los arrays:
         *  - Tienen tamaño fijo, definido al momento de su creación y no puede cambiarse.
         *  - Operaciones de inserción o eliminación requieren crear un nuevo array y copiar elementos.
         */
    }
}
