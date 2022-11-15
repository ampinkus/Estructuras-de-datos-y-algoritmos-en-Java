package EnlazadaArrayList;
/*
En vez de usar una linkedList voy a usar un ArrayList que permite que un arreglo crezca o disminuya dinamicamente.
Vamos a implementar los mimos metodos que en ejercicio de Linked List.
Para el ArrayList vamos a usar la clase Objeto que es una primiiva que permite guardar numeros, caracteres y Strings
 */

import java.util.ArrayList; // tengo que importar esta clase
public class EnlazadaArrayObjetos {
    //atributos
    private ArrayList<Object> objetos = new ArrayList<Object>(); // inicializo un arraylist de Objects llamado objetos

    //constructor
    public EnlazadaArrayObjetos() {
    }

    //getter
    public ArrayList<Object> getObjetos() {
        return objetos;
    }

    //Metodos:
    // verifica si la lista enlazada simple esta vacia,
    // retorno un valor true si esta vacia, false si no lo está
    public boolean vacia() {
        if (objetos.size() == 0) // si la lista está vacia objetos.size() es cero
            return true;  // retorno verdadero, esta vacia
        else
            return false;
    }

    // inserta un nuevo elemento en la cabeza de la lista enlazada simple
    public void insertarCabezaObjetos(Object nuevo) {
        objetos.add(0, nuevo);
    }

    //Eliminamos el elemento de la cabeza de la lista (asumimos que la cabeza no está vacía)
    public Object eliminarCabezaObjetos() {
        Object temp;
        temp = objetos.get(0);
        objetos.remove(0);
        return temp;
    }

    // imprime el contenido de los nodos de la lista enlazada simple
    public void mostrarObjetos() {
        for (Object e : objetos)
            System.out.println(e);
    }

    // busca nodo con el dato del parametro pasado al metodo (asume una lista enlazada no vacia)
    public Object buscarObjetos(Object dato) {
        for (Object e : objetos) // recorro toda la lista
            if (dato.equals(e)) {
                // si el elemento de la lista es igual al dato
                return e; // retorno el elemento de la lista
            }
        return null; // termine de recorrer todo el arreglo y no encontré el elemento
    }

    // borra nodo que contiene el objeto dato ingresado como parametro en el metodo (asume una lista enlazada no vacia)
    public Object eliminar(Object dato) {
        for (Object e : objetos) // recorro toda la lista
            if (dato.equals(e)) {
                // si el elemento de la lista es igual al dato
                objetos.remove(e); // lo remuevo de la lista
            }
        return null; // termine de recorrer todo el arreglo y no encontré el elemento
    }

	// inserta nodo con parametro valorNuevo despues del nodo que contiene el valor del parametro valorExistente,
    public Object insertar(Object valorExistente, Object valorNuevo) {
        for (int i = 0; i < objetos.size(); i++ ) { // necesito recorrer el ArrayList con un indice
            if (objetos.get(i).equals(valorExistente)) { // el objeto en la posicion i es igual al objeto que estoy queriendo insertar?
                objetos.add((i + 1), valorNuevo); // inserto el objeto en la siguiente posicion
                return valorNuevo;  //retorno el valor insertado
            }
        }
        return null; // metodo retorna null (no se encontro nodo con valorExistente)
    }




}
