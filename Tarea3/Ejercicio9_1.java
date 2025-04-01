// Simula la ejecución de una pila con enteros
public class Ejercicio9_1 {
    public static void main(String[] args) {
        Pila<Integer> p = new Pila<>();
        int x = 4, y;

        p.insertar(x); // Insertamos el número 4 en la pila
        System.out.println("\n " + p.cimaPila()); // Mostramos el tope de la pila (4)
        y = p.quitar(); // Quitamos el elemento superior (4)
        p.insertar(32); // Insertamos el número 32
        p.insertar(p.quitar()); // Quitamos y volvemos a insertar 32 (sin cambios en la pila)

        // Extraemos e imprimimos los elementos de la pila hasta que esté vacía
        do {
            System.out.println("\n " + p.quitar()); // Salida esperada: 32
        } while (!p.pilaVacia());
    }
}