class Nodo {
    int valor;
    Nodo izquierda, derecha;

    public Nodo(int valor) {
        this.valor = valor;
        izquierda = derecha = null;
    }
}

// Clase Árbol Binario
class ArbolBinario {
    Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    // Insertar un nuevo nodo
    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private Nodo insertarRec(Nodo raiz, int valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }
        if (valor < raiz.valor) {
            raiz.izquierda = insertarRec(raiz.izquierda, valor);
        } else if (valor > raiz.valor) {
            raiz.derecha = insertarRec(raiz.derecha, valor);
        }
        return raiz;
    }

    // Recorrido inorden (Izquierda, Raíz, Derecha)
    public void inorden() {
        inordenRec(raiz);
        System.out.println();
    }

    private void inordenRec(Nodo raiz) {
        if (raiz != null) {
            inordenRec(raiz.izquierda);
            System.out.print(raiz.valor + " ");
            inordenRec(raiz.derecha);
        }
    }

    // Recorrido preorden (Raíz, Izquierda, Derecha)
    public void preorden() {
        preordenRec(raiz);
        System.out.println();
    }

    private void preordenRec(Nodo raiz) {
        if (raiz != null) {
            System.out.print(raiz.valor + " ");
            preordenRec(raiz.izquierda);
            preordenRec(raiz.derecha);
        }
    }

    // Recorrido postorden (Izquierda, Derecha, Raíz)
    public void postorden() {
        postordenRec(raiz);
        System.out.println();
    }

    private void postordenRec(Nodo raiz) {
        if (raiz != null) {
            postordenRec(raiz.izquierda);
            postordenRec(raiz.derecha);
            System.out.print(raiz.valor + " ");
        }
    }
}
