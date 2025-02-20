import java.util.Scanner;

    public class MetodoMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor ingrese el número de filas: ");
        int filas = scanner.nextInt();

        System.out.print("Por favor ingrese el número de columnas: ");
        int columnas = scanner.nextInt();

        Matriz matriz = new Matriz(filas, columnas);
        matriz.llenarMatriz();
        matriz.sumarFilasColumnas();

        scanner.close();
    }
}

