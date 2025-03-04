import java.util.Scanner;

class Matriz {
    private int[][] matriz;
    private int n;
    private int m; 

    
    public Matriz(int n, int m) {
        this.n = n;
        this.m = m;
        matriz = new int[n][m];
        llenarMatriz();
    }

    
    private void llenarMatriz() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
    }

    
    public void imprimir() {
        System.out.println("Matriz resultante:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

