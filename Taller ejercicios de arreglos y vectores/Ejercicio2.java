import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrse el numero de empleados: ");
        int n = sc.nextInt();

        double [] sueldo = new double[n];
        double [] asignaciones = new double[n];
        double [] deducciones = new double[n];
        double [] netoAPagar = new double[n];

        for(int i=0; i<n; i++){
            System.out.println("Ingrese el sueldo del empleado: "+i);
            sueldo[i] = sc.nextDouble();
            System.out.println("Ingrese la asignacion del empleado: "+i);
            asignaciones[i] = sc.nextDouble();
            System.out.println("Ingrese la deduccion del empleado: "+i);
            deducciones[i] = sc.nextDouble();
        }
        System.out.println("El neto a pagar del empleado es: ");
        for(int i=0; i<n; i++){
            netoAPagar[i]=sueldo[i]+asignaciones[i]-deducciones[i];
            System.out.println("empleado "+i+ ":"+netoAPagar);
        }
    sc.close();
    }
}
