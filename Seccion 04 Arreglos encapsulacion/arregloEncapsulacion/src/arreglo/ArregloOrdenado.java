package arreglo;
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
@SuppressWarnings("ALL")
public class ArregloOrdenado {
    private long[] arr;					// referencia a arreglo con elementos del tipo long
    private int numElems;				// número actual de elementos del arreglo
    //-------------------------------------------------------------------------------------------------------
    // constructor
    public ArregloOrdenado(int tam) {
        arr = new long[tam];			// crea arreglo de tamaño igual a tam
    }
    //-------------------------------------------------------------------------------------------------------
    // búsqueda binaria. Retorna posición del elemento dato en el arreglo caso contrario retorna -1
    public int busquedaBinaria(long dato) {
        int minimo = 0;				// indice mínimo del arreglo
        int maximo = numElems - 1;	// indice máximo del arreglo
        int central;				// indice del punto central del arreglo
        while(minimo <= maximo) {   // Nos detenemos cuando mínimo es mayor a máximo
            central = (minimo + maximo)/2;	// calcula el punto central del arreglo

            if(arr[central] == dato) {
                return central;				// elemento encontrado
            } else {
                if(dato > arr[central]) {	// elemento se encuentra en la mitad superior
                    minimo = central + 1;
                } else {
                    maximo = central - 1;
                }
            }
        }
        return -1;
    }
    //-------------------------------------------------------------------------------------------------------
    // inserta dato en el arreglo
    public void insertar(long dato) {
        int j;
        for(j = 0; j < numElems; j++) {		// recorre arreglo elemento por elemento
            if(arr[j] > dato) {				// elemento en la posición j es mayor a elemento a insertar
                break;						// se detiene bucle. Elemento a insertar estara en posición j
            }
        }

        // desplaza celdas de arreglo una posición hacia arriba a partir del indice j donde se insertara el elemento
        for(int k = numElems; k > j; k--)	{		// recorre arreglo en reversa desde el ultimo indice hacia el indice j
            arr[k] = arr[k-1];				// copia valor de celda una celda hacia arriba
        }

        arr[j] = dato;						// inserta dato en arreglo
        numElems++;							// incrementa numero actual de elementos arreglo
    }
    //-------------------------------------------------------------------------------------------------------
    // elimina dato de arreglo; retorna false si no se puede eliminar dato porque no exite en arreglo
    public boolean eliminar(long dato) {
        // realiza búsqueda de argumento dato en arreglo. Retorna indice con la ubicacion de dato en arreglo
        int j = busquedaBinaria(dato);

        if( j == -1) {							// no se encontro elemento dato en arreglo
            return false;
        } else {
            for(int k = j; k < numElems - 1; k++) {	// desplazar elementos arreglo hacia abajo a partir del indice j
                arr[k] = arr[k + 1];			// desplaza elemento hacia abajo
            }
            numElems--;						// decrementa en uno la cantidad de elementos en el arreglo
        }
        return true;						// todo bien, se borro elemento dato
    }
    //----------------------------------------------------------------------------------------------------------
    // muestra contenido del arreglo
    public void mostrarArreglo() {
        for(int j = 0; j < numElems; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("");
    }
    //-----------------------------------------------------------------------------------------------------------
    // muestra el valor del elemento en la posición i del arreglo
    public long valorElemento(int i) {
        return arr[i];
    }
    //-----------------------------------------------------------------------------------------------------------
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
