import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Definimos las matrices (3 filas x 3 columnas)
        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int[][] suma = new int[3][3];
        int[][] transpuesta = new int[3][3];


        // Cargar la matriz1
        for (int i = 0; i < matriz1.length; i++) { // Recorre filas
            for (int j = 0; j < matriz1[i].length; j++) { // Recorre columnas
                System.out.print("Ingrese el valor para [" + i + "][" + j + "]: ");
                matriz1[i][j] = sc.nextInt();
            }
        }

        // Cargar la matriz1
        for (int i = 0; i < matriz2.length; i++) { // Recorre filas
            for (int j = 0; j < matriz2[i].length; j++) { // Recorre columnas
                System.out.print("Ingrese el valor para [" + i + "][" + j + "]: ");
                matriz2[i][j] = sc.nextInt();
            }
        }

        // Sumar las matrices
        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma[i].length; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        // Calcular la transpuesta de la matriz 1
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                transpuesta[j][i] = matriz1[i][j];
            }
        }

        // Mostrar la matriz 1 cargada
        System.out.println("\nMatriz1 ingresada:");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }
        // Mostrar la matriz 2 cargada
        System.out.println("\nMatriz2 ingresada:");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }

        // Mostrar la matriz resultante
        System.out.println("\nMatriz resultante de la suma:");
        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma[i].length; j++) {
                System.out.print(suma[i][j] + " ");
            }
            System.out.println();
        }

        // Mostrar matriz transpuesta
        System.out.println("\nMatriz transpuesta:");
        for (int i = 0; i < transpuesta.length; i++) {
            for (int j = 0; j < transpuesta[i].length; j++) {
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println();
        }
    }
}