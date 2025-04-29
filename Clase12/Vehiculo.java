package Clase12;

public class Vehiculo {
    private int cantidad;  // Cantidad total de vehículos
    private double consumo;  // Consumo en litros por 100 km
    private double porcGasolina;
    private double porcDiesel;
    private double porcGas;

    // Constructor para inicializar los valores de cantidad, consumo y los porcentajes de combustibles
    public Vehiculo(int cantidad, double consumo, double porcGasolina, double porcDiesel, double porcGas) {
        this.cantidad = cantidad;
        this.consumo = consumo;
        this.porcGasolina = porcGasolina;
        this.porcDiesel = porcDiesel;
        this.porcGas = porcGas;
    }

    // Métodos getter para obtener los valores de cada propiedad
    public int getCantidad() {
        return cantidad;
    }

    public double getConsumo() {
        return consumo;
    }

    public double getPorcGasolina() {
        return porcGasolina;
    }

    public double getPorcDiesel() {
        return porcDiesel;
    }

    public double getPorcGas() {
        return porcGas;
    }

    // Método para calcular el número de vehículos que usan gasolina
    public int getVehiculosGasolina() {
        return (int) (cantidad * porcGasolina);
    }

    // Método para calcular el número de vehículos que usan diésel
    public int getVehiculosDiesel() {
        return (int) (cantidad * porcDiesel);
    }

    // Método para calcular el número de vehículos que usan gas
    public int getVehiculosGas() {
        return (int) (cantidad * porcGas);
    }
}
