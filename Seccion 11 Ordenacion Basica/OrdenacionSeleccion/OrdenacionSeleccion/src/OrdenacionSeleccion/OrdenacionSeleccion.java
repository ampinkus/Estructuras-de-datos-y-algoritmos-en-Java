package OrdenacionSeleccion;

public class OrdenacionSeleccion {
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    private long[] arr;                        // referencia a arreglo con elementos tipo long
    private int numElems;                    // numero actual de elementos en arreglo

    //---------------------------------------------------------------------------------------------------
    // constructor
    public OrdenacionSeleccion(int tam) {
        arr = new long[tam];                // crea arreglo
        numElems = 0;                        // arreglo inicia con 0 elementos
    }

    //---------------------------------------------------------------------------------------------------
    // metodo que busca un valor especifico en arreglo
    // el argumento dato especifica el valor del elemento a borrar
    public boolean buscar(long dato) {
        int j;
        for (j = 0; j < numElems; j++) {
            if (arr[j] == dato) {                // se encontro item
                break;
            }
        }

        if (j == numElems) {                    // llego al final del arreglo
            return false;                    // no se encontro elemento, retona false
        } else {
            return true;                    // se encontro elemento retorna true
        }
    }

    //---------------------------------------------------------------------------------------------------
    // inserta un nuevo elemento en el arreglo
    public void insertar(long dato) {
        arr[numElems] = dato;                // inserta dato en arreglo
        numElems++;                            // incrementa en uno numero de elementos de arreglo
    }

    //---------------------------------------------------------------------------------------------------
    // borra elemento del arreglo que sea igual al valor del argumento dato desplazando los valores del
    // arreglo una celda hacia abajo
    public boolean eliminar(long dato) {
        int j;

        for (j = 0; j < numElems; j++) {            // busca elemento en arreglo
            if (arr[j] == dato) {                // se encontro el valor buscado
                break;
            }
        }

        if (j == numElems) {                    // no se encontro el valor buscado
            return false;
        } else {                            // valor encontrado en arreglo
            for (int k = j; k < numElems; k++) {    // desplaza elementos superiores al indice j
                arr[k] = arr[k + 1];
            }
            numElems--;
            return true;
        }
    }

    //---------------------------------------------------------------------------------------------------
    public void mostrarElementos() {
        for (int j = 0; j < numElems; j++) {        // recorre todos los elementos del arreglo
            System.out.print(arr[j] + " ");    // imprime cada elemento del arreglo en consola
        }

        System.out.println("");                // imprime linea en blanco
    }

    //----------------------------------------------------------------------------------------------------
    // muestra el valor del elemento en la posicion i del arreglo
    public long valorElemento(int i) {
        return arr[i];                        // retorna el valor del elemento en la posicion i del arreglo
    }

    //----------------------------------------------------------------------------------------------------
    // metodo que ordena un arreglo ascendentemente usando la ordenacion por seleccion
    public void ordenacionSeleccion() {
        int i;  // indice con el cual recorro el arreglo
        int j = 1; // es el puntero que se va corriendo a la derecha en cada recorrida, comienza en 1
        long valorMenor = arr[0]; // el valor del elemento mas pequeño, propongo inicialmente el que esta en el indice cero
        long temp; // variable temporaria para el intercambio.
        int indiceValorMenor = 0;  //Indice del elemento con el valor menor.
        boolean intercambio = false; // indica si encontré en el arreglo un numero de menor valor y tengo que hacer el intercambio

        while( j < (numElems - 1) ){ // termino el ordenamiento cuando el puntero llega al ante último elemento
            for (i = j; i < numElems; i++) { // recorro el arreglo desde el puntero hasta el final del arreglo
                if(arr[i] < valorMenor ) {  // si el elemento del arreglo es menor que el menor valor guardado
                    indiceValorMenor = i;  // guardo el valor del indice del menor valor del arreglo
                    valorMenor = arr[i];  // actualizo el valor menor
                    intercambio = true;  // hay que hacer el intercambio
                }
            }
            // intercambio los contenidos del arreglo, inicialmente el elemento de menor valor queda en arr[0], despues en arr[1]....
            if(intercambio){
                temp = arr[indiceValorMenor];
                arr[indiceValorMenor] = arr[j - 1]; // el elemento que está en el indice j-1 era el que hasta ahora tenía el valor menor
                arr[j - 1] = temp; //el elemento del arreglo con el menor indice queda con el menor valor encontrado
                intercambio = false; // como hice el intercambio lo cambio a false
            }
            valorMenor = arr[j];// propongo que el siguiente elemento del arreglo es el de menor valor, antes era el de indice 0 ahora pasa a 1
            j++;  // incremento el puntero
        }

    }
    //-----------------------------------------------------------------------------------------------------
}







