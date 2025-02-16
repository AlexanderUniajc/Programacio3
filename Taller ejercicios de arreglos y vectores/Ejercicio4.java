import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese el numero de personas");
        int n = sc.nextInt();

        int [] edad = new int[n];
        int edadMax = 0;

       
        for(int i=0; i<n; i++){
            System.out.println(" por favor ingrese la edad de la persona: " +(i+1)); 
            edad [i] = sc.nextInt();  
        }
        for(int i=0; i<n; i++){
            if(edad [i] > edadMax)
            edadMax = edad [i]; 
        }
        System.out.println("La edad mayor es: " + edadMax);
        sc.close();
    }
}
