# Práctica: Búsqueda en Arrays - Lineal y Binaria

## Descripción

Esta práctica implementa dos métodos clásicos de búsqueda en arrays de enteros:

- **Búsqueda lineal:** recorre el array elemento por elemento hasta encontrar el valor buscado o terminar el recorrido.
- **Búsqueda binaria:** algoritmo eficiente que requiere que el array esté ordenado. Divide repetidamente el rango de búsqueda a la mitad, descartando la mitad que no puede contener el valor buscado.

El programa permite ingresar un número para buscar dentro de un array ordenado predefinido.

## Resolución

- Se define un array ordenado de enteros en el código.
- Se pide al usuario ingresar el número a buscar.
- Se realiza la búsqueda lineal mediante un ciclo `for`.
- Se realiza la búsqueda binaria iterativa utilizando un ciclo `while`.
- Se realiza la búsqueda binaria recursiva mediante una función auxiliar.
- Se informa al usuario si el número fue encontrado y en qué posición para cada método.
- Se comentan las ventajas y limitaciones de la búsqueda binaria.

## Ventajas y Limitaciones

- La búsqueda binaria es mucho más rápida (complejidad O(log n)) comparada con la búsqueda lineal (O(n)), especialmente en grandes volúmenes de datos.
- La búsqueda binaria solo funciona con arrays ordenados.

