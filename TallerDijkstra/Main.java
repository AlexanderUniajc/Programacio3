package TallerDijkstra;

import java.util.Scanner;

public class Main {
    // Método principal para ejecutar el programa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el tamaño de la matriz de adyacencia
        System.out.print("Ingrese el número de nodos: ");
        int numVertices = scanner.nextInt();

        // Crear la matriz de adyacencia
        int[][] graph = new int[numVertices][numVertices];
        System.out.println("Ingrese los valores de la matriz de adyacencia (fila por fila):");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }

        // Solicitar el nodo de inicio
        System.out.print("Ingrese el nodo de inicio: ");
        int startNode = scanner.nextInt();

        // Ejecutar el algoritmo de Dijkstra
        Dijkstra.dijkstra(graph, startNode);

        scanner.close();
    }
}


