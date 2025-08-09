
/* Puedo proponerte uno donde crees una clase abstracta Empleado y dos
subclases(Programador, Diseñador) que implementen su propio método trabajar().
También podríamos sumar una interfaz como Imprimible. */
import java.util.ArrayList;
import java.util.List;

abstract class Empleado {

    protected String nombre;

    public Empleado(String nombre){
        this.nombre = nombre;
    }

    public abstract void trabajar();

}
interface Imprimible{
    void imprimir();
}

class Programador extends Empleado implements Imprimible{

    public Programador(String nombre){
        super(nombre);
    }
    public void trabajar(){
        System.out.println(nombre + " esta programando");
    }
    public void imprimir(){
        System.out.println(nombre + "es un programador");
    }

}
class Diseniador extends Empleado implements Imprimible{

    public Diseniador(String nombre){
        super(nombre);
    }
    public void trabajar(){
        System.out.println(nombre + " esta diseñando");
    }
    public void imprimir(){
        System.out.println(nombre + " es un diseñador");
    }
}
class Mecanico implements Imprimible{

    public void imprimir(){
        System.out.println("Soy un mecanico independiente");
    }
}

public class Main {
    public static void main(String[] args) {

        Programador trabajador1 = new Programador("Juan");
        Diseniador trabajador2 = new Diseniador("Nico");
        Mecanico trabajador3 = new Mecanico(); //probando interface sin herencia

        trabajador1.trabajar(); //empleado programador trabajando
        trabajador2.trabajar(); //empleado diseñador trabajando

        List<Imprimible> lista_objetos_imprimibles = List.of(trabajador1, trabajador2, trabajador3);
        for (Imprimible i : lista_objetos_imprimibles){
            i.imprimir();
        }
    }
}