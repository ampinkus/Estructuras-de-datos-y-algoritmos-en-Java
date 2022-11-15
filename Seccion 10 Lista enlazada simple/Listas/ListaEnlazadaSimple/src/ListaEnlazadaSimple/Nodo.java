package ListaEnlazadaSimple;

public class Nodo {
    //atributos
    Object dato;
    Nodo siguiente;

    //constructor
    public Nodo(Object dato) {
        this.dato = dato;
        siguiente = null;  // es el último nodo de la lista por lo que el siguiente debe ser null
    }

    //getters ( por si acaso)
    public Object getDato() {
        return dato;
    }
    public Nodo getSiguiente() {
        return siguiente;
    }

    //metodos
    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + '}';
    }

    public void mostrarNodo(){
        System.out.println("{" + dato + "}");
    }

}
