public class TablaMultiplicar {
    private int[][] tabla;

    public TablaMultiplicar() {
        tabla = new int[10][10];
        llenarTabla();
    }

    private void llenarTabla() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tabla[i][j] = (i + 1) * (j + 1);
            }
        }
    }

    public void imprimirTabla() {
        System.out.println("Tablas de Multiplicar del 1 al 10:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%4d", tabla[i][j]);
            }
            System.out.println();
        }
    }
}
