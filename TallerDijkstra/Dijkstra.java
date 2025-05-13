package TallerDijkstra;
import java.util.*;
import java.io.*;

public class Dijkstra {
    // Constante para representar el valor de infinito (distancia inicial máxima)
    private static final int INFINITY = Integer.MAX_VALUE;

    // Mapa para asociar índices con nombres de nodos
    private static final Map<Integer, String> nodeNames = Map.of(
        0, "Sucursal A",
        1, "Sucursal B",
        2, "Sucursal C"
    );

    // Método principal del algoritmo de Dijkstra
    public static void dijkstra(int[][] graph, int startNode) {
        int numVertices = graph.length; // Número de vértices en el grafo
        boolean[] visited = new boolean[numVertices]; // Array para marcar los vértices visitados
        int[] distances = new int[numVertices]; // Array para almacenar las distancias más cortas desde el vértice inicial
        int[] predecessors = new int[numVertices]; // Array para almacenar los predecesores

        // Inicializar todas las distancias como infinito
        Arrays.fill(distances, INFINITY);
        Arrays.fill(predecessors, -1); // Inicializar con -1
        distances[startNode] = 0; // La distancia al vértice inicial es 0

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{startNode, 0});

        // Iterar para encontrar las distancias más cortas a todos los vértices
        for (int i = 0; i < numVertices - 1; i++) {
            // Encontrar el vértice con la distancia mínima que aún no ha sido visitado
            int u = findMinDistanceVertex(distances, visited);
            visited[u] = true; // Marcar el vértice como visitado

            char currentNode = (char) ('A' + u); // Convertir el índice en una letra
            System.out.println("Procesando nodo: " + currentNode);

            // Actualizar las distancias de los vértices adyacentes al vértice actual
            for (int v = 0; v < numVertices; v++) {
                // Verificar si el vértice v no ha sido visitado, si hay una conexión (peso > 0),
                // y si se puede mejorar la distancia al vértice v
                if (!visited[v] && graph[u][v] != 0 && distances[u] != INFINITY &&
                        distances[u] + graph[u][v] < distances[v]) {
                    distances[v] = distances[u] + graph[u][v]; // Actualizar la distancia
                    predecessors[v] = u; // Registrar el predecesor
                }
            }
        }

        // Imprimir las distancias más cortas desde el vértice inicial
        printShortestPaths(distances);

        // Imprimir la ruta más corta desde el primer nodo hasta el último
        printShortestPath(predecessors, startNode, numVertices - 1);
    }

    // Método para encontrar el vértice con la distancia mínima que aún no ha sido visitado
    private static int findMinDistanceVertex(int[] distances, boolean[] visited) {
        int min = INFINITY; // Inicializar la distancia mínima como infinito
        int minIndex = -1; // Índice del vértice con la distancia mínima

        // Recorrer todos los vértices
        for (int v = 0; v < distances.length; v++) {
            // Si el vértice no ha sido visitado y su distancia es menor que la mínima actual
            if (!visited[v] && distances[v] <= min) {
                min = distances[v]; // Actualizar la distancia mínima
                minIndex = v; // Actualizar el índice del vértice
            }
        }
        return minIndex; // Devolver el índice del vértice con la distancia mínima
    }

    // Método para imprimir las distancias más cortas desde el vértice inicial
    private static void printShortestPaths(int[] distances) {
        System.out.println("Distancia del vértice desde la fuente");
        for (int i = 0; i < distances.length; i++) {
            char node = (char) ('A' + i); // Convertir el índice en una letra (A, B, C, ...)
            System.out.println(node + " \t\t " + distances[i]); // Imprimir el vértice y su distancia
        }
    }

    // Método para imprimir la ruta más corta desde el primer nodo hasta el último
    private static void printShortestPath(int[] predecessors, int startNode, int endNode) {
        List<Integer> path = new ArrayList<>();
        for (int at = endNode; at != -1; at = predecessors[at]) {
            path.add(at);
        }
        Collections.reverse(path); // Invertir la lista para obtener la ruta en el orden correcto

        System.out.print("Ruta más corta desde " + (char) ('A' + startNode) + " hasta " + (char) ('A' + endNode) + ": ");
        for (int i = 0; i < path.size(); i++) {
            System.out.print((char) ('A' + path.get(i)));
            if (i < path.size() - 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }

    // Método para calcular rutas para entregas desde múltiples nodos iniciales
    public static void calculateRoutesForDeliveries(int[][] graph, List<Integer> startNodes) {
        for (int startNode : startNodes) {
            System.out.println("Calculando rutas desde el nodo: " + (char) ('A' + startNode));
            dijkstra(graph, startNode);
        }
    }

    // Método para actualizar el peso de una arista en el grafo
    public static void updateEdgeWeight(int[][] graph, int from, int to, int newWeight) {
        graph[from][to] = newWeight;
        graph[to][from] = newWeight; // Si el grafo es no dirigido
    }

    // Método para exportar los resultados a un archivo
    public static void exportResults(int[] distances, String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Nodo,Distancia\n");
            for (int i = 0; i < distances.length; i++) {
                char node = (char) ('A' + i);
                writer.write(node + "," + distances[i] + "\n");
            }
        }
    }
}

