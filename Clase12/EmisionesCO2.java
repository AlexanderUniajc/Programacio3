package Clase12;

import java.util.List;

public class EmisionesCO2 {
    // Emisiones de CO2 por litro de combustible
    private static final double EMISION_GASOLINA = 2.31;  // kg CO2 por litro
    private static final double EMISION_DIESEL = 2.68;    // kg CO2 por litro
    private static final double EMISION_GAS = 2.14;      // kg CO2 por litro

    // Método para calcular las emisiones de CO2 de un vehículo
    public static double calcularEmisiones(Vehiculo vehiculo) {
        // Obtiene la cantidad de vehículos que usan cada tipo de combustible
        int vehiculosGasolina = vehiculo.getVehiculosGasolina();
        int vehiculosDiesel = vehiculo.getVehiculosDiesel();
        int vehiculosGas = vehiculo.getVehiculosGas();

        // Calcula las emisiones de CO2 para cada tipo de combustible
        double emisionesGasolina = vehiculosGasolina * (vehiculo.getConsumo() / 100) * EMISION_GASOLINA;
        double emisionesDiesel = vehiculosDiesel * (vehiculo.getConsumo() / 100) * EMISION_DIESEL;
        double emisionesGas = vehiculosGas * (vehiculo.getConsumo() / 100) * EMISION_GAS;

        // Suma las emisiones de todos los combustibles y devuelve el total
        return emisionesGasolina + emisionesDiesel + emisionesGas;
    }

    // Método para calcular las emisiones totales de una lista de vehículos
    public static double calcularEmisionesTotal(List<Vehiculo> vehiculos) {
        double totalEmisiones = 0;

        // Recorre la lista de vehículos y suma las emisiones de cada uno
        for (Vehiculo vehiculo : vehiculos) {
            totalEmisiones += calcularEmisiones(vehiculo);
        }

        // Devuelve el total de emisiones
        return totalEmisiones;
    }
}

