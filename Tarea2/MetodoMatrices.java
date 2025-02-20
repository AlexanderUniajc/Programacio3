public class MetodoMatriz{
    public static void main (String [] args){

    Scanner sc = new Scanner (System.in);
    private int[][] matriz;
    private int filas;
    private int columnas;

    public Matriz(int filas, int columnas) {
        int filas = filas;
        int columnas = columnas;
        matriz = new int[filas][columnas];
    }

    public void llenarMatriz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public void sumarFilasColumnas() {
        int[] sumaFilas = new int[filas];
        int[] sumaColumnas = new int[columnas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sumaFilas[i] += matriz[i][j];
                sumaColumnas[j] += matriz[i][j];
            }
        }

        System.out.println("Suma de cada fila:");
        for (int i = 0; i < filas; i++) {
            System.out.println("Fila " + (i+1) + ": " + sumaFilas[i]);
        }

        System.out.println("Suma de cada columna:");
        for (int j = 0; j < columnas; j++) {
            System.out.println("Columna " + (j+1) + ": " + sumaColumnas[j]);
        }
    }
}
}
