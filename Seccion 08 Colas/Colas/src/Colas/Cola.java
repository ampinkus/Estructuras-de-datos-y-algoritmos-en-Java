package Colas;

public class Cola {
    //Atributos:
    private Object[] colaArr;   // arreglo que contiene la cola
    private int tamanoMax;    // tamaño de la cola
    private int frente;  // apunta al primer elemento de la cola
    private int fin;    //  apunta al ultimo elemento de la cola
    private int numElems;  // cantidad de elementos que tiene actualmente la cola

    // constructor - inicializa valores de la cola
    public Cola(int tamano) {
        this.tamanoMax = tamano;
        colaArr = new Object[tamanoMax];	// instancia arreglo que guarda los elementos de la cola
        fin = -1;							// la variable fin la inicializamos a -1
        frente = 0;							// la variable frente la inicializamos a 0
        numElems = 0;						// numElems se inicializa a 0 (la cola esta vacia, sin elementos)
    }

    // inserta elemento al final de la cola
    public void insertar(Object elemento) {
        if(fin == (tamanoMax - 1) ) {    // estoy al final de la cola?
            fin = -1;					// hace que la cola sea circular
        }
        fin++;						// mueve apuntador fin al siguiente indice en colaArr, si llegue al final de la cola fin va a ser = 0
        colaArr[fin] = elemento;    // inserta el elemento en la posicion fin del arreglo
        numElems++;					// aumenta en uno el numero de elementos
    }

    // retira el elemento que se encuentra al frente de la cola.  OJO!  NO estamos chequeando si la cola está vacia.
    public Object quitar() {
        Object temp = colaArr[frente];	// obtiene el elemento del frente de la cola y lo asigna a una variable temporal
        frente += 1;					// se mueve frente una posicion para que apunte al siguiente indice de la cola
        if(frente == tamanoMax) {       // si el próximo elemento que voy a insertar supera el tamaño máximo tengo que dar la vuelta
            frente = 0;				    // hace que la cola sea circular
        }
        numElems--;						// se reduce en uno el numero de elementos de la cola
        return temp;				    // retornamos el elemento borrado de la cabeza de la cola
    }

    // devuelve el elemento que se encuentra al frente o primero en la cola
    public Object frenteCola() {
        return colaArr[frente];			// retorna elemento que esta en la cabeza de la cola
    }

    // devuelve true si la cola esta vacia (no tiene elementos)
    public boolean colaVacia() {    // retorna valor booleano dependiendo si la cola esta o no vacia
        return (numElems == 0);		// si numElems = 0 -> 0 = 0 es verdad y retorna True
    }

    // devuelve true si la cola esta llena
    public boolean colaLLena() {    // compara los valores del numero de elementos del arreglo con el tamaño del arreglo
        return (numElems == tamanoMax);
    }

    // devuelve el numero de elementos que tiene la cola
    public int tamanoCola() {   // retorna valor de la variable numElems
        return numElems;
    }

}
