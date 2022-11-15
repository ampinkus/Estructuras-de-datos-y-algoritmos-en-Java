/*
OPERACIONES CON PILAS:
Las operaciones mas utilizadas con Pilas son las operaciones insertar y quitar (operaciones primarias con Pilas)
Insertar (Push): Adiciona o situa un elemento en la cima de la Pila
Quitar (Pop): Elimina o quita el elemento que se encuentra en la cima de la Pila Las Pilas
Tambien utilizan las siguientes operaciones:
Pila Vacia: Comprueba si la Pila no tienen elementos
Pila LLena: Comprueba si la Pila esta llena de elementos
Limpiar Pila: Quita todos los elementos de la Pila dejandola totalmente vacia
Cima Pila: Obtiene el elemento de la Pila que se encuentra en la cima
Tamaño: Devuelve el valor con el número de elementos que tiene actualmente la pila
Mostrar elemento pila: Imprime en consola todos los elementos que hay en la pila
 */
package Pila;
public class Pila {
    //atributos privados
    private Object[] arregloPila; // referencia a arreglo con elementos tipo Object. Object es la clase base de Java
                                  // Object pude ser un int, float o string
    private int tamanoPila;      // el tamaño que le damos a arregloPila
    private int cima;             // el indice del arreglo donde se encuentra el primer objeto de la pila

    // constructor
    public Pila(int tamanoPila) {   //tamanoPila es el tamaño de la pila
        this.tamanoPila = tamanoPila;
        cima = -1;                  // la pila se inicializa sin elementos y se indica poniendo cima = -1
        arregloPila = new Object[tamanoPila];	// crea arreglo de tamaño tamanoPila
    }



    // Metodos ---------------------------------------------------------------------
    // Insertar: Adiciona o situa un elemento en la cima de la Pila
    public void insertar(Object elemento){ // El parámetro es del tipo Object
            cima += 1; // tengo que incrementar la posicion de la cima de la pial en uno
            arregloPila[cima] = elemento; // pongo el elemento en la cima de la pila
    }
    // Quitar: Quitar (Pop): Elimina o quita el elemento que se encuentra en la cima de la Pila Las Pilas
    public Object quitar(){
        int i = cima;
        cima -= 1;
        return arregloPila[i];
    }
    //Cima Pila: Obtiene el elemento de la Pila que se encuentra en la cima
    public Object cimaPila(){
        return arregloPila[cima];  // devuelvo el objeto que esta en la cima
    }
    // Pila Vacia: Comprueba si la Pila no tienen elementos
    public boolean pilaVacia(){
            return cima == -1; // Si está vacia retorna TRUE si no retorna FALSE
    }
    // Pila LLena: Comprueba si la Pila esta llena de elementos
    public boolean pilaLlena(){
        return cima == (tamanoPila - 1); // Si está llena retorna TRUE si no retorna FALSE.  La pila comienza a cotar en cero!
    }
    // Tamaño: Devuelve el valor con el número de elementos que tiene actualmente la pila
    public int tamano(){
        return (cima + 1); // El índice cima comienza en 0
    }
    // Mostrar elemento pila: Imprime en consola todos los elementos que hay en la pila
    public void mostrarElementosPila(){
        System.out.println();
        for (int i = 0; i < tamano(); i++ ) // recorro todos los elementos de la pila hasta el tamaño actual menos 1
            System.out.print(arregloPila[i] + "  ");
    }

}
