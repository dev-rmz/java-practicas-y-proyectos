# 🧑‍💼 Proyecto Integrador - Sistema de Gestión de Personal

Aplicación de consola en Java orientada a la **gestión de empleados de distintos sectores**. El proyecto fue desarrollado aplicando **Programación Orientada a Objetos (POO)**, principios **SOLID**, control de versiones con **Git**, y buenas prácticas de diseño.

---

## 🎯 Objetivo

Desarrollar una aplicación en consola que permita:

- Gestionar empleados de diferentes tipos (Programadores, Diseñadores, Administrativos, Mecánicos, etc.)
- Aplicar conceptos avanzados de Java: herencia, clases abstractas, interfaces, composición
- Integrar principios SOLID y patrones de diseño básico
- Demostrar habilidades de estructuración, modularidad y control de versiones

---

## ⚙️ Funcionalidades actuales

- ✅ Alta, baja y modificación de empleados (con validaciones)
- ✅ Visualización de empleados por tipo
- ✅ Clases abstractas y herencia
- ✅ Interface `Imprimible` para informes personalizados
- ✅ Uso de composición (`Empleado` contiene `Contrato`, `Dirección`, etc.)
- ✅ Separación de responsabilidades (por clase y paquete)
- ✅ Control de errores con `try/catch`

---

## 🧩 Tecnologías y formato

- **Lenguaje:** Java 17+
- **Entrada/Salida:** Consola
- **Control de versiones:** Git y GitHub
- **Organización:** Uso de paquetes, clases separadas y comentarios
- **IDE sugerido:** IntelliJ IDEA / Eclipse

---

## 📈 Camino a seguir (Próximas etapas)

- [ ] Implementar persistencia en archivo `.txt` o `.json`
- [ ] Modularizar la entrada de datos y validaciones
- [ ] Aplicar pruebas unitarias con JUnit
- [ ] Mejorar los mensajes al usuario (feedback de acciones)
- [ ] Añadir interfaz gráfica (JavaFX o Swing)
- [ ] Persistencia con base de datos (SQLite o H2)
- [ ] Documentación técnica y diagrama de clases UML

---

## 📸 Ejemplo de uso esperado

```text
=== SISTEMA DE GESTIÓN DE PERSONAL ===
1. Agregar nuevo empleado
2. Listar empleados
3. Eliminar empleado
4. Modificar datos de empleado
5. Mostrar detalles por tipo
6. Guardar y salir
Seleccione una opción:

🗂️ Organización del código
/Proyecto-Integrador-Sistema-de-Gestion-de-Personal
│
├── /src
│   ├── Main.java
│   ├── /empleados
│   ├── /utilidades
│   └── /interfaces
│
├── .gitignore
├── README.md
└── Proyecto.iml

📇 Autor
Fernando Nicolás Ramírez
💼 En formación como Desarrollador Backend Java
🔗 [LinkedIn](https://www.linkedin.com/in/fernando-nicolas-ramirez/)  
📫 [Ver más proyectos en GitHub](https://github.com/dev-rmz)

📌 Notas
Este proyecto se encuentra en desarrollo activo.

Se seguirán subiendo versiones a medida que se agreguen funcionalidades.

Agradezco cualquier feedback o contribución.

