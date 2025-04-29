import java.util.*;
public class PilasYColas {

    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        
        System.out.println("¿La pila esta vacia? "+pila.isEmpty());
        
        pila.push(0);
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        pila.push(6);
        
        System.out.println(pila);
        
        pila.pop();
        
        System.out.println(pila);
        System.out.println(pila.size());
        System.out.println(pila.peek());
        
    }
    
}
