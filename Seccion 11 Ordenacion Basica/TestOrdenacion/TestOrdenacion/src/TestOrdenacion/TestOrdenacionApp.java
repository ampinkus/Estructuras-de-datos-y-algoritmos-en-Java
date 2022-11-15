package TestOrdenacion;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TestOrdenacionApp {

    public static void main(String[] args) {
        // Calculamos el tiempo que toma en ordenar un arreglo de distinto tamaño usando los metodos de ordenacion
        // por burbuja, por seleccion y por insercion

        // variable que guarda los valores ingresados por el teclado
        long dato;

        // declaramos instancia de la clase Scanner para ingresar datos por la consola
        Scanner entrada = new Scanner(System.in);

        // ingresamos cantidad de datos a procesar
        System.out.print("Ingrese el tamanio del arreglo para comprobar los tiempos de cada metodo: ");
        int tamanio = entrada.nextInt();

        // cerramos instancia de Scanner
        entrada.close();

        // creamos cinco instancias de la clase TestOrdenacion (pasamos la variable tamaño al constructor)
        TestOrdenacion arrBurbuja = new TestOrdenacion(tamanio); // para el metodo burbuja
        TestOrdenacion arrSeleccion = new TestOrdenacion(tamanio); // para el metodo seleccion
        TestOrdenacion arrInsercion = new TestOrdenacion(tamanio); // para el metodo insercion
        TestOrdenacion arrShell = new TestOrdenacion(tamanio); // para el metodo Shell
        long[] array = new long[tamanio]; // Creo un arreglo usando la clase Arreglo de Java
        long[] arrayQuick = new long[tamanio]; // Creo un arreglo usando la clase Arreglo de Java para ordenarlo por QuickSort
        QuickSort arrQuickSort = new QuickSort(); // para el método QuickSort creo un objeto del tipo QuickSort
        long[] arrayCocktail = new long[tamanio]; // Creo un arreglo usando la clase Arreglo de Java para ordenarlo por CocktailSort
        CocktailSort arrCocktailSort = new CocktailSort(); // para el método CocktailSort creo un objeto del tipo CocktailSort


        // llenamos los 4 arreglos con numeros aleatorios:
        Random r = new Random();
        int low = 0;
        int high = tamanio;
        for (int i = 0; i < tamanio; i++) {
            long result = r.nextInt(high - low) + low; // el valor mas alto de los números corresponde al tamaño del arreglo
            arrBurbuja.insertar(result); // cargo los valores al azar en los arreglos
            arrSeleccion.insertar(result);
            arrInsercion.insertar(result);
            arrShell.insertar(result);
            array[i] = result;
            arrayQuick[i] = result;
            arrayCocktail[i] = result;
        }

        // imprimimos datos ingresados
        // System.out.println("Datos en el arreglo antes de estar ordenados:");
        // arrBurbuja.mostrarElementos();

        // ordenamos los datos usando la ordenacion por Burbuja
        arrBurbuja.ordenacionBurbuja();

        // ordenamos los datos usando la ordenacion por Seleccion
        arrSeleccion.ordenacionSeleccion();

        // ordenamos los datos usando la ordenacion por Insercion
        arrInsercion.ordenacionInsercion();

        // ordenamos los datos usando la ordenacion por Shell
        arrShell.ordenacionShell();

        // ordenamos los datos usando la ordenacion de la clase Array
        long startTime = System.nanoTime(); // guardo el tiempo inicial
        Arrays.sort(array); // aplico el metodo sort de la clase Array
        long endTime = System.nanoTime(); // Vuelvo a medir el tiempo
        long timeElapsed = (endTime - startTime) / 1000 ; // calculo la diferencia
        System.out.print("Tiempo en micro segundos para Ordenacion de la clase Array: "); // imprimo el tiempo de ejecucion
        System.out.printf( "%,d\n", timeElapsed);

        // ordenamos los datos usando la ordenacion QuickSort
        startTime = System.nanoTime(); // guardo el tiempo inicial
        arrQuickSort.quick_sort(arrayQuick,0,tamanio - 1); // invoco el método QuickSort
        endTime = System.nanoTime(); // Vuelvo a medir el tiempo
        timeElapsed = (endTime - startTime) / 1000 ; // calculo la diferencia
        System.out.print("Tiempo en micro segundos para Ordenacion por QuickSort: "); // imprimo el tiempo de ejecucion
        System.out.printf( "%,d\n", timeElapsed);

        // ordenamos los datos usando la ordenacion CocktailSort
        startTime = System.nanoTime(); // guardo el tiempo inicial
        arrCocktailSort.cocktailSort(arrayCocktail); // invoco el método CocktailSort
        endTime = System.nanoTime(); // Vuelvo a medir el tiempo
        timeElapsed = (endTime - startTime) / 1000 ; // calculo la diferencia
        System.out.print("Tiempo en micro segundos para Ordenacion por CocktailSort: "); // imprimo el tiempo de ejecucion
        System.out.printf( "%,d\n", timeElapsed);

        // imprimimos datos ordenados
        // System.out.println();
        // System.out.println("Datos ordenados:");
        // arrBurbuja.mostrarElementos();

        // imprimimos elemento menor y mayor
        // System.out.println("El menor valor es: " + arrBurbuja.valorElemento(0));
        // System.out.println("El mayor valor es: " + arrBurbuja.valorElemento(tamanio-1));
    }
}


