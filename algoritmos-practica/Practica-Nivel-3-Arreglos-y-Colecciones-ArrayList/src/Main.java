import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nivel 3: Arreglos y Colecciones (ArrayList).");

        // Ejercicio 1: Cargar un arreglo de 10 enteros y mostrar el promedio
        System.out.println("Ejercicio 1: Cargar un arreglo de 10 enteros y mostrar el promedio.");

        int[] enteros = new int[10];
        float suma_total = 0;

        // Pedir al usuario que ingrese 10 números enteros
        for (int j = 0; j < 10; j++) {
            System.out.print("Ingresa un número: ");
            enteros[j] = scanner.nextInt();
        }

        // Calcular la suma de los números ingresados
        for (int j = 0; j < 10; j++) {
            suma_total += enteros[j];
        }

        // Calcular el promedio dividiendo la suma entre 10
        float promedio = suma_total / 10;
        System.out.println("El promedio del arreglo es: " + promedio);

        // Ejercicio 2: Buscar un número dentro de un arreglo
        System.out.println("Ejercicio 2: Buscar un número dentro de un arreglo.");

        int[] arreglo_numeros = {3, 5, 6, 1, 10};
        boolean encontrado = false;

        System.out.print("Ingrese el número a buscar en el arreglo: ");
        int numero_buscado = scanner.nextInt();

        // Recorrer el arreglo para buscar el número ingresado
        for (int j = 0; j < arreglo_numeros.length; j++) {
            if (arreglo_numeros[j] == numero_buscado) {
                System.out.println("El número buscado se encuentra en la posición: " + j);
                encontrado = true;
                break; // Salir del ciclo al encontrar el número
            }
        }

        if (!encontrado) {
            System.out.println("Número no se encontró en el arreglo.");
        }

        // Ejercicio 3: Usar un ArrayList para almacenar nombres y mostrarlos ordenados
        System.out.println("Ejercicio 3: Usar un ArrayList para almacenar nombres y mostrarlos ordenados.");

        ArrayList<String> nombres = new ArrayList<>();

        System.out.print("¿Cuántos nombres desea ingresar?: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada

        // Pedir al usuario que ingrese la cantidad indicada de nombres
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

        // Ejercicio 4: Eliminar un nombre específico de la lista
        System.out.println("Ejercicio 4: Eliminar un nombre específico de una lista.");

        System.out.print("Ingrese el nombre que desea eliminar de la lista: ");
        String nombre_a_eliminar = scanner.nextLine();

        // Intentar eliminar el nombre de la lista
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
