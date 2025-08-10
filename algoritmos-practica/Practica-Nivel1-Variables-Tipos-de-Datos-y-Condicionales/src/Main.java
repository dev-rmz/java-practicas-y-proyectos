import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear objeto Scanner para lectura por consola

        // Ejercicio 1: Pedir nombre y edad, mostrar mensaje personalizado
        System.out.println("Ejercicio 1: Pedir al usuario su nombre y edad, y mostrar un mensaje personalizado.");
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.println("Hola " + nombre + ", tenés " + edad + " años.");

        // Ejercicio 2: Calcular área de un triángulo (base y altura)
        System.out.println("Ejercicio 2: Calcular el área de un triángulo (base y altura).");
        System.out.print("Ingrese la base del triángulo: ");
        float base = scanner.nextFloat();
        System.out.print("Ingrese la altura del triángulo: ");
        float altura = scanner.nextFloat();
        float area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);

        // Ejercicio 3: Determinar si un número es par o impar
        System.out.println("Ejercicio 3: Determinar si un número es par o impar.");
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }

        // Ejercicio 4: Ingresar tres números y mostrar el mayor
        System.out.println("Ejercicio 4: Ingresar tres números y mostrar el mayor.");
        System.out.print("Ingrese el primer número: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int c = scanner.nextInt();

        int mayor = a; // Suponemos inicialmente que el mayor es 'a'
        if (b > mayor) {
            mayor = b; // Si b es mayor, actualizamos
        }
        if (c > mayor) {
            mayor = c; // Si c es mayor, actualizamos
        }
        System.out.println("El mayor es: " + mayor);

        // Verificamos si hay números iguales
        if (a == b && b == c) {
            System.out.println("Los tres números son iguales.");
        } else if (a == b || a == c || b == c) {
            System.out.println("Hay al menos dos números iguales.");
        }
    }
}
