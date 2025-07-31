import java.util.ArrayList;
import java.util.Scanner;

// INTERFAZ que define un comportamiento genérico que deben implementar las clases que deseen ser "Imprimibles".
interface Imprimible{
    void imprimir();
}

// CLASE ABSTRACTA que representa un empleado genérico.
// Aplica el concepto de ABSTRACCIÓN y también de ENCAPSULAMIENTO.
abstract class Empleado implements Imprimible{

    // Atributos PRIVADOS: solo accesibles mediante getters (Encapsulamiento).
    private String nombre;
    private String apellido;
    private int dni;
    private String tipo;

    // Constructor de la clase Empleado
    public Empleado(String nombre, String apellido, int dni, String tipo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.tipo = tipo;
    }

    // Metodo abstracto (Polimorfismo): obliga a que las subclases definan su propia tarea.
    public abstract void tarea();

    // MÉTODOS GETTERS: permiten acceder a los atributos privados.
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getDni() {
        return dni;
    }
    public String getTipo() {
        return tipo;
    }

    // Metodo de la interfaz Imprimible: imprime datos generales del empleado.
    public void imprimir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("DNI: " + dni);
        System.out.println("Tipo: " + tipo);
    }

}

// CLASES HIJAS: Cada una hereda de Empleado y redefine el metodo tarea().
// Aplican los conceptos de HERENCIA y POLIMORFISMO.
class Programador extends Empleado{

    public Programador(String nombre, String apellido, int dni, String tipo){
        super(nombre, apellido, dni, tipo);
    }

    // Reimplementa el metodo tarea con una acción específica.
    public void tarea(){
        System.out.println("Tarea: Programar");
    }
}
class Diseniador extends Empleado{

    public Diseniador(String nombre, String apellido, int dni, String tipo){
        super(nombre, apellido, dni, tipo);
    }

    public void tarea(){
        System.out.println("Tarea Diseñar");
    }
}
class Mecanico extends Empleado{

    public Mecanico(String nombre, String apellido, int dni, String tipo){
        super(nombre, apellido, dni, tipo);
    }

    public void tarea(){
        System.out.println("Tarea: Reparar");
    }
}
class Administrativo extends Empleado{

    public Administrativo(String nombre, String apellido, int dni, String tipo){
        super(nombre, apellido, dni, tipo);
    }

    public void tarea(){
        System.out.println("Tarea: Administrar");
    }
}

public class Main {

    // FUNCIÓN AUXILIAR para cargar un nuevo empleado desde la consola.
    public static Empleado cargarEmpleado(Scanner scanner) {
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese DNI: ");
        int dni = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese tipo (p, d, m, a): ");
        String tipo = scanner.nextLine();

        // POLIMORFISMO: se devuelve un objeto del tipo correspondiente, según la entrada.
        switch (tipo) {
            case "p":
                return new Programador(nombre, apellido, dni, tipo);
            case "d":
                return new Diseniador(nombre, apellido, dni, tipo);
            case "m":
                return new Mecanico(nombre, apellido, dni, tipo);
            case "a":
                return new Administrativo(nombre, apellido, dni, tipo);
            default:
                System.out.println("Tipo inválido. No se creó empleado.");
                return null;
        }
    }
    public static void main(String[] args) {
        // Scanner para entrada de datos.
        Scanner scanner = new Scanner(System.in);

        // LISTA de empleados: estructura dinámica para almacenar objetos Empleado.
        ArrayList<Empleado> list_Empleados = new ArrayList<>();

        int seleccion;

        // BUCLE DE CONTROL para mostrar menú
        do {
            System.out.println("1. Agregar empleado");
            System.out.println("2. Listar empleados");
            System.out.println("3. Salir");
            seleccion = scanner.nextInt();
            scanner.nextLine(); // Limpia el buffer

            if (seleccion == 1) {
                Empleado nuevo = cargarEmpleado(scanner);
                if (nuevo != null) {
                    list_Empleados.add(nuevo);
                }
                System.out.println("Empleado agregado. Total: " + list_Empleados.size());
                System.out.println();
            }

            if (seleccion == 2) {
                System.out.println("Listado de empleados:");
                for (Empleado trabajador : list_Empleados) {
                    trabajador.imprimir(); // Metodo de interfaz.
                    trabajador.tarea(); // Metodo redefinido según clase (polimorfismo).
                    System.out.println();
                }
            }

        } while (seleccion != 3);
    }
}
