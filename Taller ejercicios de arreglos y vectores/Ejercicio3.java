import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese el tamaño del arreglo");
        int n = sc.nextInt();

        double [] numeros = new double[n];
        double sumaPares = 0;
        double sumaInpares = 0;

        System.out.println("Por favor ingrese los valores del arreglo");
        for(int i=0; i<n; i++){
            numeros [i] = sc.nextDouble();
            if(numeros [i] % 2 == 0){
                sumaPares += numeros [i];
            }else{
                sumaInpares += numeros [i];
            }
            System.out.println("La suma de los numeros pares es: " + sumaPares);
            System.out.println("La suma de los numeros inpares es: " + sumaInpares); 
        }
        }

    }

