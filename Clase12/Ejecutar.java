package Clase12;

public class Ejecutar {

    public static void main(String[] args) {
        // Crear instancias de vehículos para cada tipo
        Vehiculo camionesLivianos = new Vehiculo(400000, 10, 0.30, 0.40, 0.30);
        Vehiculo camionesMedianos = new Vehiculo(280000, 15, 0.25, 0.50, 0.25);
        Vehiculo camionesPesados = new Vehiculo(380000, 25, 0.10, 0.80, 0.10);
        Vehiculo tractocamiones = new Vehiculo(1150000, 40, 0.05, 0.50, 0.05);
        Vehiculo volquetas = new Vehiculo(936000, 20, 0.40, 0.40, 0.20);

        // Calcular y mostrar emisiones para cada tipo de vehículo
        mostrarEmisiones("Camiones Livianos", camionesLivianos);
        mostrarEmisiones("Camiones Medianos", camionesMedianos);
        mostrarEmisiones("Camiones Pesados", camionesPesados);
        mostrarEmisiones("Tractocamiones", tractocamiones);
        mostrarEmisiones("Volquetas", volquetas);
    }

    // Método para mostrar las emisiones de CO2 por categoría
    public static void mostrarEmisiones(String categoria, Vehiculo vehiculo) {
        double emisiones = EmisionesCO2.calcularEmisiones(vehiculo);
        System.out.println(categoria + ": " + emisiones + " kg CO2");
    }
}
