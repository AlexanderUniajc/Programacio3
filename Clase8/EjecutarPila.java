package Clase8;

import java.util.Stack;

public class EjecutarPila {
    public static void main(String[] args) {
        //creacion de la estructura stack (pila)

        Stack<String> nombres = new Stack<>();

        System.out.println(nombres.empty()); //true

        //Insertar elementos en la pila

        nombres.push("Pedro");
        nombres.push("Juan");
        nombres.push("Maria");
        nombres.push("Camila");
        nombres.push("Daniel");

        //imprimir la pila;
        System.out.println(nombres); //[Pedro, Juan, Maria, Camila, Daniel]

        //Mostrar quien esta en el tope de la pila (sin removerlo) ---> Consultar
        
        System.out.println(nombres.peek());//Daniel

        //Buscar un elemento dentro de la pila
        System.out.println(nombres.search("Camila"));// 2

        //Retirar un elemento de la pila
        System.out.println(nombres.pop()); //Daniel
        System.out.println(nombres); //[Pedro, Juan, Maria, Camila]

    }
    
}
