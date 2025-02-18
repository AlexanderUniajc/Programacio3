import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el numero de trabajadores");
        int n = sc.nextInt();
        String [] nombres = new String [n];
        double [] sueldos = new double [n];
        
    //public String nombresSueldos(String [] nombres, int [] sueldos ){
        int suma = 0;

        for(int i=0; i<n; i++){
            suma += sueldos[i];
        }
        double promedio = suma/n;
        String cad = " ";
        int contador = 0;

        for(int i=0; i<n; i++){
            if (sueldos[i]>=promedio){
                cad += nombres[i]+ "\n";
                contador ++;
            }
        
            System.out.println("fueron "+ contador+ " los empleados con sueldo promedio");
           
    }
}
}
