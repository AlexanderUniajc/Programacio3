public class Matriz {
    
        private int[][] matriz;
        private int n;
        private int m; 
    
        
        public Matriz(int n, int m) {
            this.n = 10;
            this.m = 10;
            matriz = new int[n][m];
            llenarMatriz();
        }
    
        
        private void llenarMatriz() {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j>=i) {
                        matriz[i][j] = 0;
                    } else {
                        matriz[i][j] = 1;
                    }
                }
            }
        }
    
        
        public void imprimir1() {
            System.out.println("Matriz resultante:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    
    

