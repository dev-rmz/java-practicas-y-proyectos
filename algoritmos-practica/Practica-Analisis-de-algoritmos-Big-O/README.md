# Práctica: Análisis de Complejidad Temporal en Java

## Descripción

En esta práctica se analizan distintos fragmentos de código en Java para determinar su complejidad temporal usando la notación Big O.
 Los ejemplos incluyen tanto estructuras iterativas como recursivas, con diferentes patrones de crecimiento.

El objetivo es comprender cómo varía el tiempo de ejecución en función del tamaño de la entrada, para así identificar cuellos de botella 
y optimizar algoritmos.

## Resolución

- Se implementaron siete ejercicios que abarcan casos comunes:

  1. Bucle simple con complejidad O(n)  
  2. Bucles anidados con complejidad O(n²)  
  3. Bucles anidados con parámetros independientes O(n × m)  
  4. Bucle con índice que crece exponencialmente O(log n)  
  5. Bucles anidados con límite variable O(n²)  
  6. Función recursiva lineal O(n)  
  7. Función recursiva logarítmica O(log n)  

- Cada ejercicio está acompañado por comentarios explicativos en el código que justifican la complejidad.

- Las funciones recursivas imprimen en consola cada llamada para visualizar el proceso.

## Cómo ejecutar

1. Compilar el código:

javac Main.java