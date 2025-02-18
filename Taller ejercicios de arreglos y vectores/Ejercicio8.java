import java.util.Scanner;
public class Ejercicio8 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[30];

        System.out.println("Ingresa 30 números:");
        for (int i = 0; i < 30; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int mayor = numeros[0];
        int menor = numeros[0];
        int contaMayor = 0;
        int contaMenor = 0;

        
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
                contaMayor = 1;
            } else if (numeros[i] == mayor) {
                contaMayor++;
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
                contaMenor = 1;
            } else if (numeros[i] == menor) {
                contaMenor++;
            }
        }
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número mayor aparece " + contaMayor + " veces.");
        System.out.println("El número menor es: " + menor);
        System.out.println("El número menor aparece " + contaMenor + " veces.");
    sc.close();
    }
}

