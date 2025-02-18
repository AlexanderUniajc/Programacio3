import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el tamaño del arreglo A: ");
        int N = sc.nextInt();

        int[] A = new int[N];
        int[] posiciones = new int[N]; 
        int contador = 0; 

        System.out.println("Ingresa los " + N + " elementos para el arreglo A:");
        for (int i = 0; i < N; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            A[i] = sc.nextInt();
        }

        System.out.print("Ingresa el valor X a buscar: ");
        int X = sc.nextInt();

        
        for (int i = 0; i < N; i++) {
            if (A[i] == X) {
                posiciones[contador] = i;
                contador++;
            }
        }

        
        if (contador == 0) {
            System.out.println("El valor " + X + " no se encuentra en el arreglo.");
        } else {
            System.out.print("El valor " + X + " se encuentra en las posiciones: ");
            for (int i = 0; i < contador; i++) {
                System.out.print(posiciones[i]);
                if (i < contador - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
