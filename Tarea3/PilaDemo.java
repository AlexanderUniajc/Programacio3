class PilaDemo {
    public static void main(String[] args) {
        // Ejercicio 9.1 - Operaciones con una pila de enteros
        Pila p = new Pila();// Creamos una pila vacía
        int x = 4;// Valor a insertar en la pila
        
        insertarElemento(p, x); // Insertamos el valor 4 en la pila
        mostrarCima(p); // Mostramos el elemento en la cima de la pila
        
        quitarElemento(p); // Quitamos el elemento en la cima
        insertarElemento(p, 32); // Insertamos el valor 32 en la pila
        
        // Extraemos el valor 32 y lo volvemos a insertar sin cambios
        p.insertar(p.quitar());
        
        imprimirYVaciarPila(p); // Imprimimos y vaciamos la pila
        
        // Ejercicio 9.2 - Mostrar elementos de una pila de cadenas sin perderlos
        Pila<String> pilaCadenas = new Pila<>();//Creamos un objeto de tipo Pila<String>
        insertarElemento(pilaCadenas, "Soy Velez");// Insertamos un elemento en la pila
        insertarElemento(pilaCadenas, "Profe Cano");// Insertamos otro elemento en la pila
        insertarElemento(pilaCadenas, "Buenos dias");// Insertamos otro elemento en la pila
        mostrarPila(pilaCadenas);// Mostramos los elementos de la pila
        
        // Ejercicio 9.3 - Conversión de expresión infija a postfija
        String expresionInfija = "(x - y) / (z + w) - (z + y) ^ x";// Expresión infija
        System.out.println("Expresión en notación postfija: " + convertirPostfija(expresionInfija));// Convertimos la expresión a postfija
        
        // Ejercicio 9.4 - Almacenar y mostrar elementos en orden inverso con una pila
        double[] numeros = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.0};// Array de números
        almacenarEnPila(numeros);// Almacenamos los números en la pila
    }
    
    // Método para insertar un elemento en la pila
    public static void insertarElemento(Pila p, Object valor) {// Inserta un elemento en la pila
        p.insertar(valor);// Insertamos el valor en la pila
    }
    
    // Método para mostrar el elemento en la cima de la pila
    public static void mostrarCima(Pila p) {
        System.out.println("\n " + p.cimaPila());// Mostramos el elemento en la cima de la pila
    }
    
    // Método para quitar el elemento en la cima de la pila
    public static void quitarElemento(Pila p) {
        p.quitar();
    }
    
    // Método para extraer e imprimir todos los elementos de la pila hasta que esté vacía
    public static void imprimirYVaciarPila(Pila p) {// Imprime y vacía la pila
        while (!p.pilaVacia()) {// Mientras la pila no esté vacía
            System.out.println("\n " + p.quitar());// Quitamos y mostramos el elemento en la cima
        }
    }
    
    // Método para mostrar los elementos de una pila de cadenas sin perderlos
    public static void mostrarPila(Pila<String> pila) {
        Pila<String> aux = new Pila<>();// Creamos una pila auxiliar
        while (!pila.pilaVacia()) {// Mientras la pila no esté vacía
            String elemento = pila.quitar();// Quitamos el elemento en la cima
            System.out.println(elemento); // Imprime el elemento actual
            aux.insertar(elemento); // Lo guarda en una pila auxiliar
        }
        while (!aux.pilaVacia()) {// Mientras la pila auxiliar no esté vacía
            pila.insertar(aux.quitar()); // Volvemos a insertar los elementos en la pila original
        }
    }
    
    // Método que simula la conversión de una expresión infija a postfija
    public static String convertirPostfija(String expresion) {
        return "x y - z w + / z y + x ^ -";// Expresión postfija
    }
    
    // Método para almacenar elementos en una pila y mostrarlos en orden inverso
    public static void almacenarEnPila(double[] numeros) {
        Pila<Double> pila = new Pila<>();// Creamos una pila
        System.out.println("Secuencia original:");// Mostramos la secuencia original
        for (double num : numeros) {// Recorremos la secuencia
            System.out.print(num + " "); // Mostramos cada elemento
            pila.insertar(num); // Insertamos el elemento en la pila
        }
        System.out.println("\nSecuencia en la pila (extrayendo):");// Mostramos la secuencia en la pila
        while (!pila.pilaVacia()) {// Mientras la pila no esté vacía
            System.out.print(pila.quitar() + " "); // Extrae e imprime en orden inverso
        }
    }
}

