package ArrayList;
/*
En vez de usar una linkedList voy a usar un ArrayList que permite que un arreglo crezca o disminuya dinamicamente.
Vamos a implementar los mismos metodos que en ejercicio de Linked List.
Para el ArrayList vamos a usar la clase Objeto que es una primiiva que permite guardar numeros, caracteres y Strings
No es necesario chequear si el ArrayList esta vacio al buscar o insertar un objeto nuevo como en el caso de la lista enlazada
 */
public class ArrayListApp {
    public static void main(String[] args) {
        // creamos instancia de la clase EnlazadaArrayObjetos, no necesito especificar la dimension
        ArrayList objetos = new ArrayList();

        // insertamos 5 elementos del tipo double a la cabeza del ArrayList
        System.out.println("Insertamos los objetos 2.98, 3.11, 1.2, 12.212, 8.732");
        objetos.insertarCabezaObjeto(2.98);
        objetos.insertarCabezaObjeto(3.11);
        objetos.insertarCabezaObjeto(1.2);
        objetos.insertarCabezaObjeto(12.212);
        objetos.insertarCabezaObjeto(8.732);
        System.out.println();

        // mostramos los objetos del ArrayList
        System.out.println("Mostramos los objetos del ArrayList: ");
        objetos.mostrarObjetos();
        System.out.println();

        // insertamos nuevo objeto entre dos objetos del ArrayList
        System.out.println("Insertamos un nuevo objeto 45 luego del 1.2 del ArrayList");
        if(objetos.insertar(1.2,45) == null) {
            System.out.println("No se pudo insertar nuevo Objeto");
        } else {
            System.out.println("Objeto se inserto correctamente");
        }

        // volvemos a mostrar los objetos del ArrayList (verificamos si la insercion del objeto fue correcta)
        System.out.println("Volvemos a mostrar los objetos del ArrayList (verificamos si la insercion del nodo es correcta)");
        objetos.mostrarObjetos();
        System.out.println();

        // buscamos objeto en lel ArrayList
        System.out.println("Buscamos el objeto 3.11 en la lista enlazada simple ");
        if(objetos.buscarObjeto(3.11) == null) {  // no se encontrol el objeto buscxado
            System.out.println("No se encontro el objeto buscado");
        } else {
            System.out.println("Se encontro el objeto buscado");
        }
        System.out.println();

        // borramos todos los objetos del ArrayList
        System.out.println("Borramos todos los objetos del ArrayLista");
        while(!objetos.vacio()) { // preguntamos si el ArrayList está vacio
            System.out.print("Objeto eliminado: ");
            System.out.println(objetos.eliminarCabezaObjeto()); // eliminamos el objeto e imprimimos el mismo
        }

        // comprobamos nuevamente si el ArrayLista esta vacio
        System.out.println("Borramos todos los objetos: ? " + objetos.vacio());
        objetos.mostrarObjetos();
        System.out.println();

        // insertamos nuevos objetos al ArrayList
        System.out.println("Insertamos nuevos objetos al ArrayList: Perro, Gato, Caballo, Conejo y mostramos el ArrayList");
        objetos.insertarCabezaObjeto("Perro");
        objetos.insertarCabezaObjeto("Gato");
        objetos.insertarCabezaObjeto("Caballo");
        objetos.insertarCabezaObjeto("Conejo");

        // mostramos objetos del ArrayList
        objetos.mostrarObjetos();
        System.out.println();

        // eliminamos el objeto Gato del ArrayList
        System.out.println("Eliminamos el objeto Gato");
        if(objetos.eliminar("Gato") == null) { // verificamos que hayamos encontrado el objeto
            System.out.println("No se encontro objeto a eliminar");
        } else {
            System.out.println("Se elimino el objeto");
        }

        // mostramos los objetos del ArrayList
        System.out.println("Mostramos los objetos del ArrayList luego de eliminar a Gato:");
        objetos.mostrarObjetos();
        System.out.println();

        // borramos todos los objetos del ArrayList
        System.out.println("Borramos todos los objetos del ArrayList");
        while(!objetos.vacio()) {
            System.out.print("Objeto eliminado: ");
            System.out.println(objetos.eliminarCabezaObjeto());
        }
        System.out.println();

        // comprobamos nuevamente si el ArrayLista esta vacio
        System.out.println("Borramos todos los objetos: ? " + objetos.vacio());
        objetos.mostrarObjetos();
        System.out.println();

        // eliminamos el objeto Canario del ArrayList que esta vacio, no tengo que chequear esta condicion ya que no da error
        System.out.println("Eliminamos el objeto Canario");
        if(objetos.eliminar("Canario") == null) { // verificamos que hayamos encontrado el objeto
            System.out.println("No se encontro objeto a eliminar");
        } else {
            System.out.println("Se elimino el objeto");
        }
        System.out.println();

        // insertamos nuevos objetos al ArrayList
        System.out.println("Insertamos nuevos objetos al ArrayList: Canario y mostramos el ArrayList");
        objetos.insertarCabezaObjeto("Canario");

        // mostramos los objetos del ArrayList
        System.out.println("Mostramos los objetos del ArrayList: ");
        objetos.mostrarObjetos();
        System.out.println();

        // insertamos nuevo objeto entre dos objetos del ArrayList
        System.out.println("Insertamos un nuevo objeto Pato luego del Canario en el ArrayList");
        if(objetos.insertar("Canario", "Pato") == null) {
            System.out.println("No se pudo insertar nuevo Objeto");
        } else {
            System.out.println("Objeto se inserto correctamente");
        }

        // mostramos los objetos del ArrayList
        System.out.println("Mostramos los objetos del ArrayList: ");
        objetos.mostrarObjetos();

    }
}
