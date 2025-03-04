import java.util.Scanner;

    public class Ejecutar {
    public static void main(String[] args) {
         
        //Scanner sc = new Scanner(System.in);
        /* 
        System.out.print("Por favor ingrese el número de filas: ");
        int filas = scanner.nextInt();

        System.out.print("Por favor ingrese el número de columnas: ");
        int columnas = scanner.nextInt();

        MetodoMatrices matriz = new MetodoMatrices(filas, columnas);
        matriz.llenarMatriz();
        matriz.sumarFilasColumnas();

        scanner.close();
        */
        
            /* 
            TablaMultiplicar tablasMultiplicar = new TablaMultiplicar();
            tablasMultiplicar.imprimirTabla();
            */
            
                
                    
/* 
        
        System.out.print("Ingrese el numero de fias: ");
        int n = sc.nextInt();
        System.out.print("Ingrese el numero de columnas: ");
        int m = sc.nextInt();

        Matriz miMatriz = new Matriz(n, m);
        miMatriz.imprimir();
        */
 
        Ejercicio20 obj = new Ejercicio20();
 
        int[][] m = obj.llenarMatriz(10, 10);
 
        System.out.println(obj.mostrarMatriz(m));
 
        obj.diagonalCerosMatriz(m);
 
        System.out.println(obj.mostrarMatriz(m));
 
 
 
    }
}

        
             
        
    


