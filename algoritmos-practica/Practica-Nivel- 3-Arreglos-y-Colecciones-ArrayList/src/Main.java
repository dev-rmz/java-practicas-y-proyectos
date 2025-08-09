//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nivel 3: Arreglos y Colecciones (ArrayList).");

        System.out.println("Ejercicio 1: Cargar un arreglo de 10 enteros y mostrar el promedio.");

        int[] enteros = new int[10];
        float promedio;
        float suma_total = 0;

        for (int j = 0; j < 10; j++) {
            System.out.print("Ingresa un numero: ");
            enteros[j] = scanner.nextInt();
        }
        for (int j = 0; j < 10; j++) {
            suma_total = suma_total + enteros[j];
        }
        promedio = suma_total / 10;

        System.out.println("El promedio del arreglo es: " + promedio);

        System.out.println("Ejercicio 2: Buscar un número dentro de un arreglo.");

        int[] arreglo_numeros = {3, 5, 6, 1, 10};
        boolean encontrado = false;

        System.out.print("Ingrese el numero a buscar en el arreglo: ");
        int numero_buscado = scanner.nextInt();

        for (int j = 0; j < arreglo_numeros.length; j++) {
            if (arreglo_numeros[j] == numero_buscado) {
                System.out.println("El numero buscado se encuentra en la posicion: " + j);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Numero no se encontro en el arreglo.");
        }

        System.out.println("Ejercicio 3: Usar un ArrayList para almacenar nombres y mostrarlos ordenados.");

        ArrayList<String> nombres = new ArrayList<>();

        System.out.print("¿Cuántos nombres desea ingresar?: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Limpia el salto de línea pendiente

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre #" + (i + 1) + ": ");
            String nombre = scanner.nextLine();
            nombres.add(nombre);
        }

        Collections.sort(nombres);

        System.out.println("Nombres ordenados alfabéticamente:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        System.out.println("Ejercicio 4: Eliminar un nombre específico de una lista.");

        System.out.print("Ingrese el nombre que desea eliminar de la lista: ");
        String nombre_a_eliminar = scanner.nextLine();

        if (nombres.remove(nombre_a_eliminar)) {
            System.out.println("El nombre fue eliminado correctamente.");
        } else {
            System.out.println("El nombre no se encontró en la lista.");
        }

        System.out.println("Lista actualizada:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}