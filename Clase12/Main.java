package Clase12;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Crear una lista de vehículos (ArrayList) para almacenar las categorías
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        // Agregar los vehículos a la lista con sus respectivas propiedades
        // Cada categoría tiene un número total de vehículos y un porcentaje de cada tipo de combustible
        vehiculos.add(new Vehiculo(400000, 10, 0.30, 0.40, 0.30));  // Camiones Livianos
        vehiculos.add(new Vehiculo(280000, 15, 0.25, 0.50, 0.25));  // Camiones Medianos
        vehiculos.add(new Vehiculo(380000, 25, 0.10, 0.80, 0.10));  // Camiones Pesados
        vehiculos.add(new Vehiculo(1150000, 40, 0.05, 0.90, 0.05)); // Tractocamiones
        vehiculos.add(new Vehiculo(936000, 20, 0.40, 0.40, 0.20));  // Volquetas

        // Calcular y mostrar las emisiones totales para todos los vehículos
        double emisionesTotales = EmisionesCO2.calcularEmisionesTotal(vehiculos);

        // Imprimir las emisiones totales de CO2
        System.out.println("Emisiones totales de CO2: " + emisionesTotales + " kg CO2");

        // También podemos mostrar las emisiones por vehículo individualmente si lo deseamos
        mostrarEmisiones("Camiones Livianos", vehiculos.get(0));
        mostrarEmisiones("Camiones Medianos", vehiculos.get(1));
        mostrarEmisiones("Camiones Pesados", vehiculos.get(2));
        mostrarEmisiones("Tractocamiones", vehiculos.get(3));
        mostrarEmisiones("Volquetas", vehiculos.get(4));
    }

    // Método para mostrar las emisiones de CO2 por categoría de vehículo
    public static void mostrarEmisiones(String categoria, Vehiculo vehiculo) {
        // Calcula las emisiones para un solo vehículo y las muestra
        double emisiones = EmisionesCO2.calcularEmisiones(vehiculo);
        System.out.println(categoria + ": " + emisiones + " kg CO2");
    }
}
