import java.util.List;

// Clase abstracta que representa un empleado genérico
abstract class Empleado {

    protected String nombre;

    // Constructor para inicializar el nombre del empleado
    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto que obliga a las subclases a definir cómo trabajan
    public abstract void trabajar();
}

// Interfaz que define un método para imprimir información
interface Imprimible {
    void imprimir();
}

// Clase Programador que extiende Empleado e implementa Imprimible
class Programador extends Empleado implements Imprimible {

    public Programador(String nombre) {
        super(nombre);
    }

    // Implementación concreta del método trabajar para programador
    @Override
    public void trabajar() {
        System.out.println(nombre + " está programando");
    }

    // Implementación del método imprimir de la interfaz
    @Override
    public void imprimir() {
        System.out.println(nombre + " es un programador");
    }
}

// Clase Diseñador que extiende Empleado e implementa Imprimible
class Diseniador extends Empleado implements Imprimible {

    public Diseniador(String nombre) {
        super(nombre);
    }

    // Implementación concreta del método trabajar para diseñador
    @Override
    public void trabajar() {
        System.out.println(nombre + " está diseñando");
    }

    // Implementación del método imprimir de la interfaz
    @Override
    public void imprimir() {
        System.out.println(nombre + " es un diseñador");
    }
}

// Clase Mecanico que no extiende Empleado pero implementa Imprimible
class Mecanico implements Imprimible {

    // Implementación del método imprimir para mecánico
    @Override
    public void imprimir() {
        System.out.println("Soy un mecánico independiente");
    }
}

public class Main {

    public static void main(String[] args) {

        // Crear instancias de Programador y Diseñador con nombres
        Programador trabajador1 = new Programador("Juan");
        Diseniador trabajador2 = new Diseniador("Nico");

        // Crear instancia de Mecanico (no hereda de Empleado)
        Mecanico trabajador3 = new Mecanico();

        // Llamar al método trabajar de cada empleado
        trabajador1.trabajar();
        trabajador2.trabajar();

        // Crear una lista de objetos que implementan Imprimible
        List<Imprimible> listaObjetosImprimibles = List.of(trabajador1, trabajador2, trabajador3);

        // Recorrer la lista y llamar al método imprimir de cada objeto
        for (Imprimible i : listaObjetosImprimibles) {
            i.imprimir();
        }
    }
}
