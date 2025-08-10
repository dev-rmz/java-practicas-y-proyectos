import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nivel 3: Arreglos y Colecciones (ArrayList).");

        // ========================
        // Ejercicio 1: Cargar un arreglo de 10 enteros y mostrar el promedio
        // ========================
        int[] enteros = new int[10];
        float suma_total = 0;
        float promedio;

        // Pedir 10 números al usuario y almacenarlos en el arreglo
        for (int j = 0; j < 10; j++) {
            System.out.print("Ingresa un numero: ");
            enteros[j] = scanner.nextInt();
        }

        // Sumar todos los números ingresados para calcular el promedio
        for (int j = 0; j < 10; j++) {
            suma_total += enteros[j];
        }

        // Calcular el promedio
        promedio = suma_total / 10;

        System.out.println("El promedio del arreglo es: " + promedio);

        // ========================
        // Ejercicio 2: Buscar un número dentro de un arreglo
        // ========================
        int[] arreglo_numeros = {3, 5, 6, 1, 10};
        boolean encontrado = false;

        System.out.print("Ingrese el numero a buscar en el arreglo: ");
        int numero_buscado = scanner.nextInt();

        // Recorrer el arreglo para buscar el número indicado
        for (int j = 0; j < arreglo_numeros.length; j++) {
            if (arreglo_numeros[j] == numero_buscado) {
                System.out.println("El numero buscado se encuentra en la posicion: " + j);
                encontrado = true;
                break;  // Salir del ciclo si se encuentra el número
            }
        }

        if (!encontrado) {
            System.out.println("Numero no se encontro en el arreglo.");
        }

        // ========================
        // Ejercicio 3: Usar un ArrayList para almacenar nombres y mostrarlos ordenados
        // ========================
        ArrayList<String> nombres = new ArrayList<>();

        System.out.print("¿Cuántos nombres desea ingresar?: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Limpia el salto de línea pendiente

        // Pedir los nombres y agregarlos a la lista
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre #" + (i + 1) + ": ");
            String nombre = scanner.nextLine();
            nombres.add(nombre);
        }

        // Ordenar la lista alfabéticamente
        Collections.sort(nombres);

        System.out.println("Nombres ordenados alfabéticamente:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // ========================
        // Ejercicio 4: Eliminar un nombre específico de una lista
        // ========================
        System.out.print("Ingrese el nombre que desea eliminar de la lista: ");
        String nombre_a_eliminar = scanner.nextLine();

        // Intentar eliminar el nombre indicado
        if (nombres.remove(nombre_a_eliminar)) {
            System.out.println("El nombre fue eliminado correctamente.");
        } else {
            System.out.println("El nombre no se encontró en la lista.");
        }

        // Mostrar la lista actualizada
        System.out.println("Lista actualizada:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
