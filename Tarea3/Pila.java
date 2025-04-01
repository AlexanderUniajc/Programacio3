import java.util.Stack;

// Clase genérica que implementa una pila utilizando la clase Stack de Java
class Pila<T> {
    private Stack<T> stack; // Estructura de datos interna para manejar la pila

    // Constructor: inicializa la pila
    public Pila() {
        stack = new Stack<>();
    }

    // Método para insertar un elemento en la pila
    public void insertar(T elemento) {
        stack.push(elemento);
    }

    // Método para quitar y devolver el elemento en la cima de la pila
    public T quitar() {
        if (!stack.isEmpty()) {
            return stack.pop(); // Elimina y retorna el elemento superior
        }
        return null; // Retorna null si la pila está vacía
    }

    // Método para obtener el elemento en la cima sin eliminarlo
    public T cimaPila() {
        if (!stack.isEmpty()) {
            return stack.peek(); // Retorna el elemento en la cima
        }
        return null; // Retorna null si la pila está vacía
    }

    // Método para verificar si la pila está vacía
    public boolean pilaVacia() {
        return stack.isEmpty();
    }
}