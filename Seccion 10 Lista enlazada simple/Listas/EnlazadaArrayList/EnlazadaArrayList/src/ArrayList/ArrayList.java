package ArrayList;

public class ArrayList {
    //atributos
    private java.util.ArrayList<Object> objetos = new java.util.ArrayList<Object>(); // inicializo un arraylist de Objects llamado objetos

    //constructor
    public ArrayList() {
    }

    //Metodos:
    // Verifica si el ArrayLista esta vacio, retorno true si esta vacia, false si no lo está
    public boolean vacio() {
        if (objetos.size() == 0) // si el ArrayList está vacio objetos.size() es cero
            return true;  // retorno verdadero, esta vacio
        else
            return false;
    }

    // inserta un nuevo objeto en el indice cero del ArrayList
    public void insertarCabezaObjeto(Object dato) {
        objetos.add(0, dato); // agrego el objeto argumento en el indice cero
    }

    //Eliminamos el elemento del indice cero del ArrayLista
    public Object eliminarCabezaObjeto() {
        Object temp; // Variable temporal para guardar el objeto eliminado
        temp = objetos.get(0); // guardo el objeto que voy a eliminar
        objetos.remove(0); // elimino el objeto en el indice cero
        return temp; // retorno el objeto eliminado
    }

    // imprime el contenido del ArrayList
    public void mostrarObjetos() {
        for (Object e : objetos)
            System.out.println(e);
    }

    // busca el objeto con el dato del parametro pasado al metodo
    public Object buscarObjeto(Object dato) {
        for (Object objeto : objetos) { // recorro todo el ArrayList
            if (objeto.equals(dato)) // si el objeto del ArrayList es igual al dato
                return objeto; // retorno el objeto
        }
        return null; // retorno null, recorri todo el ArrayList y no lo encontré
    }

    // borra el objeto dato ingresado como parametro en el metodo
    public Object eliminar(Object dato) {
        for (Object e : objetos) // recorro todo el ArrayList
            if (dato.equals(e)) { // si el elemento del ArrayList es igual al dato
                objetos.remove(e); // lo remuevo del ArrayList
                return dato; // retorno el objeto eliminado
            }
        return null; // termine de recorrer todo el arreglo y no encontré el elemento
    }

	// inserta un objeto obletoNuevo despues del objeto valorExistente,
    public Object insertar(Object objetoExistente, Object objetoNuevo) {
        for (int i = 0; i < objetos.size(); i++ ) { // necesito recorrer el ArrayList con un indice
            // el objeto en la posicion i es igual al objeto que estoy queriendo insertar?
            if (objetos.get(i).equals(objetoExistente)) {
                    objetos.add((i + 1), objetoNuevo); // inserto el objeto en la siguiente posicion
                return objetoNuevo;  //retorno el valor insertado
            }
        }
        return null; // metodo retorna null (no se encontro nodo con valorExistente)
    }
}
