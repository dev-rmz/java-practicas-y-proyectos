public class Main {
    public static void main(String[] args) {
        //Ejercicio 1 ¿Cuál es la complejidad temporal? Justificá.
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        /*
          Complejidad temporal: O(n)
          Justificación: El bucle for comienza en i = 0 y se ejecuta mientras i < n, incrementándose en 1 en cada
          iteración. Esto provoca que el número total de iteraciones sea proporcional a n.
          Dentro del bucle solo hay una operación de tiempo constante (System.out.println(i)), por lo que el tiempo
          total de ejecución crece linealmente con el valor de n.
         */

        //Ejercicio 2 ¿Cuál es la complejidad temporal? ¿Por qué?

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + j);
            }
        }
       /*
        Complejidad temporal: O(n²)
        Justificación: El primer bucle for recorre n elementos, realizando una iteración por cada incremento de i. El
        segundo bucle anidado también recorre n elementos para cada valor de i. Esto significa que por cada una de las
        n iteraciones externas, se ejecutan n iteraciones internas, resultando en n × n = n² operaciones. Dentro del
        bucle interno solo se realiza una operación de tiempo constante (System.out.println(i + j)), por lo que no
        afecta la complejidad asintótica.
        El tiempo total de ejecución crece de forma cuadrática con respecto a n.
        */

        //Ejercicio 3: Si n y m son independientes, ¿cómo se expresa la complejidad?

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println(i + j);
            }
        }
       /*
        Complejidad temporal: O(n × m)
        Justificación: El primer bucle recorre n elementos, y para cada uno de ellos el segundo bucle recorre m elementos.
        Esto provoca un total de n × m iteraciones. Como n y m son parámetros independientes, no se simplifica a O(n²).
        La operación dentro del bucle interno (System.out.println(i + j)) es de tiempo constante, por lo que no altera
        la complejidad asintótica.
        */


        //Ejercicio 4 ¿Cuál es la complejidad temporal? ¿Qué representa el crecimiento del índice?
        for (int i = 1; i < n; i = i * 2) {
            System.out.println(i);
        }

        /*
        Complejidad temporal: O(log n)
        Justificación: El bucle comienza en i = 1 y, en cada iteración, multiplica i por 2 (i = i * 2). Esto significa
        que i crece de forma exponencial y el número de iteraciones es igual a la cantidad de veces que podemos duplicar
        1 antes de alcanzar n.
        Matemáticamente, esto ocurre log₂(n) veces. La constante de la base del logaritmo no se considera en la notación
        Big O, por lo que la complejidad se expresa como O(log n).
        La operación dentro del bucle (System.out.println(i)) es de tiempo constante.
        */


        //Ejercicio 5 ¿Cuál es la complejidad temporal? ¿Qué representa el crecimiento del índice?

        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        /*
        Complejidad temporal: O(n²)
        Justificación: El bucle externo itera n veces. El bucle interno itera un número de veces proporcional al valor
        actual de i, que en promedio es n/2. La operación dentro del bucle (sum++) es constante, por lo que no altera
        la complejidad. El crecimiento del tiempo de ejecución es cuadrático respecto a n.
        */

        //Ejercicio 6 ¿Cuál es la complejidad temporal de esta función recursiva?
        public void recursiveFunc(int n) {
            if (n <= 1) return;
            recursiveFunc(n - 1);
        }
        /*
        Complejidad temporal: O(n)
        Justificación: La función realiza una llamada recursiva con n - 1 en cada paso, hasta llegar a 1. Esto genera exactamente
        n llamadas, cada una con trabajo constante. El tiempo de ejecución crece linealmente con respecto a n.
        */

        //Ejercicio 7 ¿Cuál es la complejidad temporal? ¿Cómo afecta la división por 2?
        public void recursiveFunc(int n) {
            if (n <= 1) return;
            recursiveFunc(n / 2);
        }
        /*
        Complejidad temporal: O(log n)
        Justificación: La función divide n por 2 en cada llamada, reduciendo el problema de tamaño n a tamaño n/2 hasta
        llegar a 1. Esto genera un número de llamadas proporcional a log (n), y cada una realiza trabajo constante.
        El crecimiento del tiempo de ejecución es logarítmico respecto a n.
        */
    }
}