import java.util.Scanner;
public class MetodoMatrices{
    Scanner sc = new Scanner (System.in);
    private int[][] matriz;
    private int filas;
    private int columnas;

    public MetodoMatrices (int  filas, int  columnas) {
        this.filas = filas;
        this.columnas = columnas;
        matriz = new int[filas][columnas];
    }

    public void llenarMatriz() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
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

