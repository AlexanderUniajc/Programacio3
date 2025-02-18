import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese el tamaño del vector");
        int n = sc.nextInt();  

        double[] A = new double[n];
        double[] numPositivo = new double[n];
        double[] numNegativo = new double[n];
        double[] cero = new double[n];

        int posConta = 0;
        int negConta = 0;
        int ceroConta = 0;

        System.out.println("Por favor ingrese los valores del vector:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextDouble();
            if (A[i] > 0) {
                numPositivo[posConta++] = A[i];
            } else if (A[i] < 0) {
                numNegativo[negConta++] = A[i];
            } else {
                cero[ceroConta++] = A[i];
            }
        }
        System.out.println("Números positivos:");
        for (int i = 0; i < posConta; i++) {
            System.out.print(numPositivo[i] + " ");
        }
        System.out.println();

        System.out.println("Números negativos:");
        for (int i = 0; i < negConta; i++) {
            System.out.print(numNegativo[i] + " ");
        }
        System.out.println();

        System.out.println("Ceros:");
        for (int i = 0; i < ceroConta; i++) {
            System.out.print(cero[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
