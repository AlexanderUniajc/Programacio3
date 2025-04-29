import java.util.*;

public class Ejercicio {
    public static void main(String[] args) {

        Stack<String> nombre = new Stack<String>();

        nombre.push("Adam");
        nombre.push("Sarah");
        nombre.push("Malcon");

        System.out.println(nombre);

        String[] iniciales = new String[nombre.size()];

        //op1 nombre.toArray(iniciales);

        String n = "";
        int tamPila = nombre.size();
        for (int index = 0; index < tamPila; index++) {
            n = nombre.pop();
            iniciales[index]= String.valueOf(n.substring(0, 1));
        }
        
        /*for (int i = 0; i < iniciales.length; i++) {
            iniciales[i]= String.valueOf(iniciales[i].substring(0, 1));
        }*/
        
        System.out.println(Arrays.toString(iniciales));
        Arrays.sort(iniciales);
        System.out.println(Arrays.toString(iniciales));

    }
}