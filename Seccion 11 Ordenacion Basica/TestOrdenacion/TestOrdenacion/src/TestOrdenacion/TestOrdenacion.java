package TestOrdenacion;

public class TestOrdenacion{
        private long[] arr;		// referencia a arreglo con elementos tipo long
        private int numElems;	// numero actual de elementos en arreglo
        //---------------------------------------------------------------------------------------------------
        // constructor
        public TestOrdenacion(int tam) {
            arr = new long[tam];				// crea arreglo
            numElems = 0;						// arreglo inicia con 0 elementos
        }

        //---------------------------------------------------------------------------------------------------
        // metodo que busca un valor especifico en arreglo
        // el argumento dato especifica el valor del elemento a borrar
        public boolean buscar(long dato) {
            int j;
            for(j=0; j<numElems; j++) {
                if( arr[j] == dato) {				// se encontro item
                    break;
                }
            }
            if(j == numElems) {					// llego al final del arreglo
                return false;					// no se encontro elemento, retona false
            } else {
                return true;					// se encontro elemento retorna true
            }
        }

        //---------------------------------------------------------------------------------------------------
        // inserta un nuevo elemento en el arreglo
        public void insertar(long dato) {
            arr[numElems] = dato;				// inserta dato en arreglo
            numElems++;							// incrementa en uno numero de elementos de arreglo
        }

        //---------------------------------------------------------------------------------------------------
        // borra elemento del arreglo que sea igual al valor del argumento dato desplazando los valores del
        // arreglo una celda hacia abajo
        public boolean eliminar(long dato) {
            int j;

            for(j=0; j < numElems; j++) {			// busca elemento en arreglo
                if(arr[j] == dato) {				// se encontro el valor buscado
                    break;
                }
            }

            if(j == numElems) {					// no se encontro el valor buscado
                return false;
            } else {							// valor encontrado en arreglo
                for(int k = j; k < numElems ; k++) {	// desplaza elementos superiores al indice j
                    arr[k] = arr[k+1];
                }
                numElems--;
                return true;
            }
        }

        //---------------------------------------------------------------------------------------------------
        public void mostrarElementos() {
            for(int j = 0; j < numElems; j++) {		// recorre todos los elementos del arreglo
                System.out.print(arr[j] + " ");	// imprime cada elemento del arreglo en consola
            }
            System.out.println("");				// imprime linea en blanco
        }

        //----------------------------------------------------------------------------------------------------
        // muestra el valor del elemento en la posicion i del arreglo
        public long valorElemento(int i) {
            return arr[i];						// retorna el valor del elemento en la posicion i del arreglo
        }


        //----------------------------------------------------------------------------------------------------
        // metodo que ordena un arreglo ascendentemente usando la ordenacion por burbuja
        public void ordenacionBurbuja() {
            long startTime = System.nanoTime(); // guardo el tiempo inicial
            int  i , j;							// variables locales que ayudan en el recorrido del arreglo

            // j inicia en el ultimo indice del arreglo, se mueve una posicion hacia la izquierda cada vez que
            // culmina una iteracion.
            // En cada iteracion, i se mueve desde la posicion 0 hasta la posicion j-1 del arreglo
            //
            for(j = numElems-1 ;j > 0; j--) {
                for(i = 0; i < j; i++) {
                    if(arr[i] > arr[i+1]) {		// si elemento en la posicion i es mayor al elemento en la posicion
                        // i+1 se intercambian posiciones
                        long temp = arr[i];		// guarda en la variable temporal temp el elemento en la posicion i
                        arr[i] = arr[i+1];		// asigna en la posicion i el valor en la posicion i+1
                        arr[i+1] = temp;		// asigna en la posicion i+1 el valor de la variable temporal temp
                    }
                }
            }
            long endTime = System.nanoTime(); // Vuelvo a medir el tiempo
            long timeElapsed = (endTime - startTime) / 1000; // calculo la diferencia
            System.out.println();
            System.out.print("Tiempo en micro segundos para Ordenacion Burbuja: "); // imprimo el tiempo de ejecucion
            System.out.printf( "%,d\n", timeElapsed);
        }
        //-----------------------------------------------------------------------------------------------------

        //----------------------------------------------------------------------------------------------------
        // metodo que ordena un arreglo ascendentemente usando la ordenacion por seleccion
        public void ordenacionSeleccion() {
            long startTime = System.nanoTime(); // guardo el tiempo inicial

            int minimo;             			// guarda valor minimo
            long temp;              			// variable temporal que ayudara en el intercambio de elementos del arreglo

            for(int i=0;i<numElems-1;i++) {   	// el valor de i establece el comienzo de cada recorrido (bucle externo)
                minimo=i;           				// al inicio de cada recorrido el valor de minimo se inicializa apuntando al primer elemento
                for(int j=i+1;j<numElems;j++) { 	// recorremos cada uno de los elementos del arreglo a partir del indice i+1 (bucle interno)
                    if(arr[j]<arr[minimo]) {  		// comparamos elemento en el indice j con el actual valor minimo
                        minimo=j;       				// el elemento en la posicion j es menor que el actual valor minimo; elemento en la posicion j
                        // es el nuevo minimo
                    }
                }

                // intercambiamos elementos del arreglo en los indices apuntados por i y minimo
                temp=arr[i];
                arr[i]=arr[minimo];
                arr[minimo]=temp;
            }
            long endTime = System.nanoTime(); // Vuelvo a medir el tiempo
            long timeElapsed = (endTime - startTime) / 1000; // calculo la diferencia
            System.out.print("Tiempo en micro segundos para Ordenacion Seleccion: "); // imprimo el tiempo de ejecucion
            System.out.printf( "%,d\n", timeElapsed);
        }
        //-----------------------------------------------------------------------------------------------------

        //----------------------------------------------------------------------------------------------------
        // metodo que ordena arreglo usando el metodo de ordenacion por insercion
        public void ordenacionInsercion() {
            long startTime = System.nanoTime(); // guardo el tiempo inicial
            int i;								// indice i recorre cada elemento del arreglo
            int j;								// indice j recorre elementos a comparar con el valor en i

            for(i=0;i<numElems;i++) {			// bucle externo (itera por todo el arreglo)
                long temp=arr[i];				// temp guarda temporalmente elemento removido en la posicion i
                j=i;							// j comienza en la posicion i del arreglo

                while(j>0 && arr[j-1]>=temp) {	// itera hasta encontrar el primer elemento menor al valor de temp o cuando se llega a 0
                    arr[j]=arr[j-1];			// movemos el elemento en la posicion j-1 a la posicion j
                    --j;						// movemos j a la siguiente posicion a la izquierda
                }
                arr[j]=temp;					// insertamos el valor de temp en la posicion j
            }
            long endTime = System.nanoTime(); // Vuelvo a medir el tiempo
            long timeElapsed = (endTime - startTime) / 1000 ; // calculo la diferencia
            System.out.print("Tiempo en micro segundos para Ordenacion Insercion: "); // imprimo el tiempo de ejecucion
            System.out.printf( "%,d\n", timeElapsed);
        }
        //-----------------------------------------------------------------------------------------------------

        //----------------------------------------------------------------------------------------------------
        // ordenacion Shell (Shell Sort)
        public void ordenacionShell() {
            long startTime = System.nanoTime(); // guardo el tiempo inicial
            int h=1;							// incremento (determina espaciamiento entre elementos para el ordenamiento)
            long temp;							// guarda temporalmente elemento del arreglo
            int i;								// indice del arreglo
            int j;								// indice del arreglo
            // bucle encuentra el valor inicial de h
            while(h<numElems) {					// mientras h sea menor a la cantidad de elementos del arreglo
                h=h*3+1;						// formula del intervalo de Knuth (genera la serie 1,4,13,40,121,364)
            }
            while(h>0) {						// iteramos hasta que h sea igual a 1
                for(i=h;i<numElems;i++) {		// desplazamos el indice i de acuerdo a los valores que va tomando h
                    temp=arr[i];				// guardamos temporalmente el valor del elemento apuntaodo por el indice i
                    j=i;						// indice j comienza en la posicion del indice i
                    // ordenamos subarreglo
                    while(j-h>=0) {				// itera si existen mas elementos en subarreglo anteriores al elemento en temp
                        if(arr[j-h]<temp)		// elemento a una distancia h de temp es menor que temp
                            break;				// terminamos el bucle while (nos movemos al siguiente valor de j)
                        arr[j]=arr[j-h];		// movemos elemento en la posicion j-h a la posicion j
                        j=j-h;					// movemos el indice j hacia la izquierda del arreglo h posiciones
                    }
                    arr[j]=temp;				// colocamos el valor de temp en la posicion del indice j del arreglo
                }
                h=(h-1)/3;						// decrementamos el valor de h usando la inversa de la formula de Knuth
            }
            long endTime = System.nanoTime(); // Vuelvo a medir el tiempo
            long timeElapsed = (endTime - startTime) / 1000 ; // calculo la diferencia
            System.out.print("Tiempo en micro segundos para Ordenacion Shell: "); // imprimo el tiempo de ejecucion
            System.out.printf( "%,d\n", timeElapsed);
        }
        //-----------------------------------------------------------------------------------------------------





    }

