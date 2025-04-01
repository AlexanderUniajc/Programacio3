import java.util.LinkedList;
import java.util.Queue;

class Supermercado {
    // Tres colas que representan las cajas del supermercado
    private Queue<Integer> colaCaja1 = new LinkedList<>();
    private Queue<Integer> colaCaja2 = new LinkedList<>();
    private Queue<Integer> colaCaja3 = new LinkedList<>();

    // Cola para los carritos de compra disponibles
    private Queue<Integer> carritosDisponibles = new LinkedList<>();

    // Constructor que inicializa los carritos disponibles
    public Supermercado(int totalCarritos) {
        for (int i = 1; i <= totalCarritos; i++) {
            carritosDisponibles.add(i); // Agregamos carritos a la cola
        }
    }

    // Método para gestionar la llegada de un cliente
    public void clienteLlega(int clienteId) {
        // Si no hay carritos disponibles, el cliente espera
        if (carritosDisponibles.isEmpty()) {// isEmpty:  Devuelve true si la colección no tiene elementos y false si contiene al menos un elemento.
            System.out.println("Cliente " + clienteId + " espera por un carrito disponible.");
            return;
        }
        // Cliente toma un carrito
        int carrito = carritosDisponibles.poll(); // poll: obtener y eliminar el primer elemento de la cola.
        System.out.println("Cliente " + clienteId + " toma el carrito " + carrito);

        // Asignamos al cliente a la cola de caja con menos personas
        asignarCola(clienteId);
    }

    // Método para asignar a un cliente a la caja con la menor cantidad de personas
    private void asignarCola(int clienteId) {
        Queue<Integer> menorCola = obtenerMenorCola(); // Obtiene la cola más corta
        menorCola.add(clienteId);
        System.out.println("Cliente " + clienteId + " se coloca en la caja de menor cola.");
    }

    // Método para obtener la cola con menos clientes
    private Queue<Integer> obtenerMenorCola() {
        if (colaCaja1.size() <= colaCaja2.size() && colaCaja1.size() <= colaCaja3.size()) {
            return colaCaja1;
        } else if (colaCaja2.size() <= colaCaja3.size()) {
            return colaCaja2;
        } else {
            return colaCaja3;
        }
    }

    // Método para simular el pago de un cliente en una caja
    public void clientePaga(int caja) {
        Queue<Integer> cola;

        // Seleccionamos la cola de la caja correspondiente
        if (caja == 1) cola = colaCaja1;
        else if (caja == 2) cola = colaCaja2;
        else cola = colaCaja3;

        // Si la cola no está vacía, el cliente paga y libera el carrito
        if (!cola.isEmpty()) {
            int clienteId = cola.poll(); // Cliente finaliza su compra
            System.out.println("Cliente " + clienteId + " finaliza su compra y libera un carrito.");
            carritosDisponibles.add(clienteId); // Se devuelve el carrito a la disponibilidad
        } else {
            System.out.println("No hay clientes en la caja " + caja);
        }
    }
}
