package Clase2;

public class Ejercicio1 {
    public static void main(String[] args) {
        /* 
        OperacionesConArreglos op = new OperacionesConArreglos();
        // Crear un arreglo de enteros
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(op.mostrarElementos(a));
        System.out.println("La suma de los elemenos es: "+op.sumaElemento(a));
        System.out.println("El promedio de los elementos es: "+op.promedioElementos(a));
        */

        int n =5;
        int[]a = op.llenarArregloAleatorios(n);
        System.out.println(op.mostrarElementos(a));
        
        int min = -10;
        int max = 20;
        int randomNum = min + (int)(Math.random() * ((max - min) + 1));
        System.out.println("Número aleatorio generado entre " + min + " y " + max + ": " + randomNum);

        
    }
}