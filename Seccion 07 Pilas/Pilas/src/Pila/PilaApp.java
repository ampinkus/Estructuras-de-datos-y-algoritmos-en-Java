package Pila;

public class PilaApp {
    public static void main(String[] args) {

        Pila pila = new Pila(5); // creo una pila de 5 elementos
        pila.insertar(1);
        pila.insertar("casa");
        pila.mostrarElementosPila();
        pila.insertar('e');
        pila.mostrarElementosPila();
        System.out.println("\nEl tamano actual de la pila es: " + pila.tamano());
        pila.quitar();
        pila.mostrarElementosPila();
        System.out.println("\nEl tamano actual de la pila es: " + pila.tamano());
        System.out.println("\nEsta llena la pila?: " + pila.pilaLlena());

        Pila pila2 = new Pila(5); // creo una pila de 5 elementos
        System.out.println("\nEl tamano actual de la pila2 es: " + pila2.tamano());
        System.out.println("\nEsta vacia la pila2?: " + pila2.pilaVacia());
        for (int i = 0; i < 5; i++)
            pila2.insertar(i*10);
        pila2.mostrarElementosPila();
        // pila2.insertar(1); // da error
        for (int i = 0; i < 5; i++)
            pila2.quitar(); // vaciamos la pila 2
        System.out.println("\nEsta vacia la pila2?: " + pila2.pilaVacia());
        // volvemos a llenar la pila 2 pero comprobando de no agregar un elemento si esta llena
        for (int i = 0; i < 10; i++) {
            if (pila2.pilaLlena())
                break; // si esta llena salgo del loop
            else
                pila2.insertar(i * 10); // si hay lugar inserto un elemento
        }
        pila2.mostrarElementosPila();

    }
}