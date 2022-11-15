package EnlazadaArrayList;

public class EnlazadaArrayObjetosApp {
    public static void main(String[] args) {
        // creamos instancia de la clase objetosEnlazadaSimple
        EnlazadaArrayObjetos objetos = new EnlazadaArrayObjetos();

        // insertamos 5 elementos del tipo double a la cabeza del ArrayList
        System.out.println("Insertamos los objetos 2.98, 3.11, 1.2, 12.212, 8.732");
        objetos.insertarCabezaObjetos(2.98);
        objetos.insertarCabezaObjetos(3.11);
        objetos.insertarCabezaObjetos(1.2);
        objetos.insertarCabezaObjetos(12.212);
        objetos.insertarCabezaObjetos(8.732);
        System.out.println();

        // mostramos los nodos de la lista enlazada simple
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

        // volvemos a mostrar nodos de la lista enlazada (verificamos si la insercion del nodo es correcta)
        System.out.println("Volvemos a mostrar nodos de la lista enlazada (verificamos si la insercion del nodo es correcta)");
        objetos.mostrarObjetos();
        System.out.println();

        // buscamos objeto en la lista enlazada simple
        System.out.println("Buscamos el objeto 3.11 en la lista enlazada simple ");
        objetos.buscarObjetos(3.11);
        if(objetos.buscarObjetos(3.11) == null) {
            System.out.println("Se encontro Objeto con dato buscado");
        } else {
            System.out.println("No se encontro Objeto con dato buscado");
        }
        System.out.println();

        // borramos nodos de la lista enlazada simple
        while(!objetos.vacia()) {
            System.out.print("Nodo eliminado: ");
            System.out.println(objetos.eliminarCabezaObjetos());
        }

        // comprobamos nuevamente si la lista enlazada simple esta vacia
        System.out.println("objetos enlazada simple esta vacia? " + objetos.vacia());
        objetos.mostrarObjetos();
        System.out.println();

        // insertamos nuevos nodos a la lista enlazada simple
        objetos.insertarCabezaObjetos("Perro");
        objetos.insertarCabezaObjetos("Gato");
        objetos.insertarCabezaObjetos("Caballo");
        objetos.insertarCabezaObjetos("Conejo");

        // mostramos nodos de la lista enlazada
        objetos.mostrarObjetos();

        // eliminamos un nodo
        objetos.eliminar("Gato");

        // mostramos nodos de la lista enlazada simple
        objetos.mostrarObjetos();

    }


}
