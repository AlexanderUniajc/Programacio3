import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese el numero de viviendas");
        int n = sc.nextInt();

        double [] alquileres = new double [n];
        double [] porcentajeGanancias = new double [n];
        double [] ganancias = new double [n];

        System.out.println("Por favor ingrese el valor del alquiler: ");
        for(int i=0; i<n; i++){
            System.out.print("casa " +(i+1)+ ": ");
            alquileres [i] = sc.nextDouble();
        }
        System.out.println("Por favor ingrese el porcentaje de las ganacias: ");
        for(int i=0; i<n; i++){
            System.out.print("casa "+(i+1)+ ": ");
            porcentajeGanancias [i] = sc.nextDouble();
        }
        for(int i=0; i<n; i++){
            ganancias [i] = alquileres [i] * (porcentajeGanancias [i] /100);
            System.out.println("La ganacia de la casa " + n + " es: $" +ganancias[i]);
        }
        sc.close();
    }
}
