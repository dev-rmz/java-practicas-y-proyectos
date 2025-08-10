# Nivel 4: Programación Orientada a Objetos

## 📌 Descripción
Este proyecto contiene ejercicios básicos de programación orientada a objetos en Java. Se trabaja con tres clases principales: `Persona`, `Producto` y `CuentaBancaria`, cada una con sus atributos y métodos específicos.

### Ejercicios incluidos:

1. **Clase Persona**
   - Atributos: `nombre` y `edad`.
   - Método: `saludar()` que muestra un mensaje con el nombre y la edad.

2. **Clase Producto**
   - Atributos: `nombre`, `precio`, `IVA` y `precio_final`.
   - Método: `calcular_IVA()` que calcula y muestra el precio final sumando el IVA.

3. **Clase CuentaBancaria**
   - Atributo privado: `saldo`.
   - Métodos:
     - `consultar_saldo()` para mostrar el saldo actual.
     - `depositar(float)` para añadir dinero al saldo.
     - `extraer(float)` para retirar dinero y actualizar el saldo.

---

## 🛠️ Tecnologías utilizadas
- Lenguaje: Java
- Programación orientada a objetos (POO)
- Clases, atributos, métodos y encapsulamiento

---

## 📂 Estructura del código
- **Persona.java:** Clase que representa una persona.
- **Producto.java:** Clase que representa un producto y calcula su precio final con IVA.
- **CuentaBancaria.java:** Clase que simula operaciones bancarias básicas.
- **Main.java:** Clase principal donde se crean objetos y se prueban los métodos.

---

## 💻 Ejemplo de ejecución


Nivel 4: Programación Orientada a Objetos

Ejercicio 1: Crear una clase Persona con atributos y método saludar().
Hola mi nombre es Nicolas y tengo 31 años.

Ejercicio 2: Crear una clase Producto con precio e IVA. Calcular el precio final
El precio final del jorgito: 3630.0

Ejercicio 3: Clase CuentaBancaria con métodos depositar() y extraer().
Usted depositó: 20.0
Su saldo es: 20.0
Usted depositó: 5.0
Su saldo es: 25.0
Usted retiró: 10.0
Su saldo es: 15.0

📖 Conceptos aplicados
Creación de clases y objetos

Atributos y métodos

Encapsulamiento (atributos privados y métodos públicos)

Uso de constructores para inicializar objetos

Operaciones básicas con objetos en main