import java.util.Scanner;

public class Ejercicio1{
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Usuario ingrese el tamaño del vector:");
        int n = sc.nextInt();

        int [] vector = new int[n];
        
        System.out.println("Usuario ingrese los " + n + " valores");
        for(int i=0; i<n; i++){
            vector [i] = sc.nextInt();
        }

        int suma = 0;
        for(int i=0; i<n; i++){
            suma +=vector[i];
        } 
        System.out.println("La suma de los elementos del vector es: "+suma);   
        sc.close();
    }
}