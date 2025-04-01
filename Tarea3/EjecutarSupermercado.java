public class EjecutarSupermercado {
    public static void main(String[] args) {
        Supermercado supermercado = new Supermercado(5);// creamos un objeto supermercado con capacidad para 5 clientes

        supermercado.clienteLlega(001); // Simulamos la llegada de un cliente con id 001
        supermercado.clienteLlega(002); // Simulamos la llegada de un cliente con id 002
        supermercado.clientePaga(1); //Simulamos que el cliente en posicion 1 paga y sale
        supermercado.clienteLlega(003); // Simulamos la llegada de un cliente con id 003
        supermercado.clientePaga(2); //Simulamos que el cliente en la posicion 2 paga y sale
    }
}
