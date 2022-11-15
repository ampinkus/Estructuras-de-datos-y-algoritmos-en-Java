package arreglo;

public class Arreglo {
    // atributos:

    // definimos un atributo privado "arr" como arreglo del tipo long sin especificar el tamaño
    private long[] arr;
    private int numElems;   //numero de elementos de la clase

    // constructor
    public Arreglo(int tam) {
        this.arr = new long[tam];
        numElems = 0;
    }

    // métodos:

    // método que busca un valor especifico en arreglo
    // el argumento dato especifica el valor del elemento a borrar (método retorna true si se encontró el dato buscado)
    public boolean buscar(long dato){
        int j = 0;
        // System.out.println("En la clase Java numElems es: " + numElems);
        for ( long x : arr) {
                if (x == dato) {                // se encontró item
                    break;
                }
                j++;
            }
        // llego al final del arreglo
        // se encontró elemento retorna true
        return j != numElems;					// no se encontró elemento, retorna false
    }

    // método que inserta un nuevo elemento en el arreglo al final del mismo
    public void insertar(long dato) {
        arr[numElems] = dato;				// inserta dato en arreglo
        numElems++ ;  // incrementa en uno numero de elementos de arreglo
    }

    // método que borra un elemento del arreglo que sea igual al valor del argumento dato desplazando los valores del
    // arreglo una celda hacia abajo
    public boolean eliminar(long dato) {
        int j = 0;
        for ( long x : arr) {
            if (x == dato) {                // se encontró item
                break;
            }
            j++;
        }

        if(j == numElems) {					// no se encontró el valor buscado
            return false;
        } else {							// valor encontrado en arreglo
            // desplaza elementos superiores al indice un lugar hacia abajo
            /*
                public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
                Parameters
                src − This is the source array.srcPos − This is the starting position in the source array.
                dest − This is the destination array.
                destPos − This is the starting position in the destination data.
                length − This is the number of array elements to be copied.
             */
            if (numElems - 1 - j >= 0)
                System.arraycopy(arr, j + 1, arr, j, numElems - 1 - j);
            numElems--; // el arreglo tiene un elemento menos
            return true;
        }
    }

    // método que imprime en pantalla todos los elementos del arreglo
    public void mostrarElementos() {
        for ( long x : arr) {		// recorre todos los elementos del arreglo
            System.out.print(x + " ");	// imprime cada elemento del arreglo en consola
        }
        System.out.println("");				// imprime linea en blanco
    }

    // método que muestra el valor del elemento en la posición i del arreglo
    public long valorElemento(int i) {
        return arr[i];						// retorna el valor del elemento en la posición i del arreglo
    }

}


