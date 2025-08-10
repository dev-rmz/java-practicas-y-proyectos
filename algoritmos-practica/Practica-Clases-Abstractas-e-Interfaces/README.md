# Práctica: Clases Abstractas e Interfaces en Java

## Descripción

Esta práctica explora los conceptos de herencia, clases abstractas e interfaces en Java mediante un ejemplo sencillo de empleados:

- Se define una clase abstracta `Empleado` con un método abstracto `trabajar()` que obliga a sus subclases a implementar su propia forma de trabajar.
- Se crean dos subclases concretas: `Programador` y `Diseniador`, que extienden `Empleado` y concretan el método `trabajar()`.
- Se define una interfaz `Imprimible` con un método `imprimir()`.
- Las clases `Programador`, `Diseniador` y `Mecanico` implementan la interfaz `Imprimible`, demostrando que la interfaz puede ser implementada incluso sin relación de herencia.
- Se demuestra polimorfismo usando una lista de objetos `Imprimible` para llamar al método `imprimir()` de forma genérica.

## Resolución

- Se usa herencia para compartir atributos y métodos comunes entre empleados.
- La clase abstracta define un contrato obligatorio para sus subclases.
- La interfaz permite definir comportamiento común en clases no relacionadas por herencia.
- El método `main` crea instancias de las clases y demuestra el uso de polimorfismo y métodos abstractos.
