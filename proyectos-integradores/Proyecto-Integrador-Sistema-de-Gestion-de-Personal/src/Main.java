import java.util.ArrayList;
import java.util.Scanner;

// Interfaz que define un contrato: todo objeto Imprimible debe implementar el método imprimir()
interface Imprimible {
    void imprimir();
}

// Clase abstracta que representa la estructura base común de cualquier tipo de empleado.
// Aplica los principios de abstracción y encapsulamiento.
abstract class Empleado implements Imprimible {
    private String nombre;
    private String apellido;
    private int dni;
    private String tipo; // Ej: Programador, Diseñador
    private int legajo;  // Código identificador único de 6 dígitos

    // Constructor que recibe el tipo de empleado y utiliza Scanner para pedir el resto de los datos
    public Empleado(String tipo, Scanner scanner) {
        System.out.print("Ingrese legajo (6 dígitos): ");
        this.legajo = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese nombre: ");
        this.nombre = scanner.nextLine();

        System.out.print("Ingrese apellido: ");
        this.apellido = scanner.nextLine();

        System.out.print("Ingrese DNI: ");
        this.dni = Integer.parseInt(scanner.nextLine());

        this.tipo = tipo;
    }

    // Métodos de acceso (getters) para encapsulamiento
    public int getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public String getTipo() {
        return tipo;
    }

    // Implementación de la interfaz Imprimible: muestra los datos del empleado
    @Override
    public void imprimir() {
        System.out.println("Legajo: " + legajo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("DNI: " + dni);
        System.out.println("Tipo: " + tipo);
    }

    // Método abstracto que será implementado por cada subclase (polimorfismo)
    public abstract void tarea();
}

// Cada clase hija representa un tipo de empleado específico
// Se aplica herencia y polimorfismo (sobrescriben el método tarea)

// Programador hereda de Empleado
class Programador extends Empleado {
    public Programador(String tipo, Scanner scanner) {
        super(tipo, scanner);
    }

    // Implementación concreta de la tarea
    @Override
    public void tarea() {
        System.out.println("Tarea: Programar");
    }
}

// Diseñador hereda de Empleado
class Diseniador extends Empleado {
    public Diseniador(String tipo, Scanner scanner) {
        super(tipo, scanner);
    }

    @Override
    public void tarea() {
        System.out.println("Tarea: Diseñar");
    }
}

// Técnico hereda de Empleado
class Tecnico extends Empleado {
    public Tecnico(String tipo, Scanner scanner) {
        super(tipo, scanner);
    }

    @Override
    public void tarea() {
        System.out.println("Tarea: Reparar");
    }
}

// Administrativo hereda de Empleado
class Administrativo extends Empleado {
    public Administrativo(String tipo, Scanner scanner) {
        super(tipo, scanner);
    }

    @Override
    public void tarea() {
        System.out.println("Tarea: Administrar");
    }
}

public class Main {

    /**
     * Método auxiliar para crear un nuevo empleado.
     * Muestra un menú donde el usuario elige el tipo (1-4).
     * Se utiliza polimorfismo para devolver la instancia correspondiente.
     *
     * @param scanner Objeto Scanner reutilizado
     * @return Objeto Empleado (de tipo específico), o null si la opción es inválida
     */
    public static Empleado cargarEmpleado(Scanner scanner) {
        System.out.println("Seleccione el tipo de empleado:");
        System.out.println("1. Programador");
        System.out.println("2. Diseñador");
        System.out.println("3. Técnico");
        System.out.println("4. Administrativo");
        System.out.print("Ingrese una opción (1-4): ");

        int opcionTipo = Integer.parseInt(scanner.nextLine());
        String tipoTexto;

        switch (opcionTipo) {
            case 1:
                tipoTexto = "Programador";
                return new Programador(tipoTexto, scanner);
            case 2:
                tipoTexto = "Diseñador";
                return new Diseniador(tipoTexto, scanner);
            case 3:
                tipoTexto = "Técnico";
                return new Tecnico(tipoTexto, scanner);
            case 4:
                tipoTexto = "Administrativo";
                return new Administrativo(tipoTexto, scanner);
            default:
                System.out.println("Opción inválida.");
                return null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Empleado> listaEmpleados = new ArrayList<>(); // Colección de empleados
        int opcion;

        // Bucle principal del menú
        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Listar empleados");
            System.out.println("3. Eliminar empleado por legajo");
            System.out.println("4. Modificar empleado por legajo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    // Agrega un nuevo empleado usando el menú
                    Empleado nuevo = cargarEmpleado(scanner);
                    if (nuevo != null) {
                        listaEmpleados.add(nuevo);
                        System.out.println("Empleado agregado.");
                    }
                    break;

                case 2:
                    // Lista todos los empleados con sus datos y tarea correspondiente
                    System.out.println("\n--- LISTADO DE EMPLEADOS ---");
                    for (Empleado e : listaEmpleados) {
                        e.imprimir();  // Polimorfismo: todos implementan imprimir()
                        e.tarea();     // Cada tipo tiene una tarea distinta
                        System.out.println("-----------------------");
                    }
                    break;

                case 3:
                    // Elimina un empleado usando el legajo
                    System.out.print("Ingrese legajo del empleado a eliminar: ");
                    int legajoEliminar = Integer.parseInt(scanner.nextLine());
                    boolean eliminado = listaEmpleados.removeIf(emp -> emp.getLegajo() == legajoEliminar);
                    if (eliminado) {
                        System.out.println("Empleado eliminado.");
                    } else {
                        System.out.println("No se encontró un empleado con ese legajo.");
                    }
                    break;

                case 4:
                    // Modifica un empleado eliminándolo y agregando uno nuevo en su lugar
                    System.out.print("Ingrese legajo del empleado a modificar: ");
                    int legajoModificar = Integer.parseInt(scanner.nextLine());
                    Empleado nuevoEmpleado = cargarEmpleado(scanner);

                    for (int i = 0; i < listaEmpleados.size(); i++) {
                        if (listaEmpleados.get(i).getLegajo() == legajoModificar) {
                            listaEmpleados.set(i, nuevoEmpleado);
                            System.out.println("Empleado modificado.");
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del sistema.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);
    }
}