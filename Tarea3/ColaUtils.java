import java.util.LinkedList;
import java.util.Queue;

public class ColaUtils {
    // Método para comparar dos colas y determinar si son idénticas
    public static <T> boolean sonIdenticas(Queue<T> cola1, Queue<T> cola2) {
        // Si las colas tienen diferentes tamaños, no pueden ser idénticas
        if (cola1.size() != cola2.size()) {
            return false;
        }
        // Comparamos las colas directamente
        return cola1.equals(cola2);
    }

    public static void main(String[] args) {
        // Creamos dos colas de enteros
        Queue<Integer> cola1 = new LinkedList<>();
        Queue<Integer> cola2 = new LinkedList<>();

        // Añadimos elementos a ambas colas
        cola1.add(1);
        cola1.add(2);
        cola1.add(3);

        cola2.add(1);
        cola2.add(2);
        cola2.add(3);

        // Comprobamos si las colas son idénticas e imprimimos el resultado
        System.out.println("Las colas son idénticas: " + sonIdenticas(cola1, cola2));
    }
}

