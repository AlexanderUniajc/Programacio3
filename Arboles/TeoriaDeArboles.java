// Clase Principal
public class TeoriaDeArboles {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        
        // Insertar valores
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(70);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(60);
        arbol.insertar(80);

        // Mostrar recorridos
        System.out.println("Recorrido Inorden:");
        arbol.inorden();

        System.out.println("Recorrido Preorden:");
        arbol.preorden();

        System.out.println("Recorrido Postorden:");
        arbol.postorden();
    }
}
