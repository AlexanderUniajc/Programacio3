import java.util.Stack;

public class Ejercicio7 {
  public static void main(String[] args) {
        Stack<String> cadena = new Stack<>();
        cadena.addAll(java.util.Arrays.asList("Canguro", "Oso", "Zorro"));
       
        for (int i = 0; i < cadena.size(); i++) {
            if (cadena.elementAt(i).length() <= 4) {
                System.out.println(cadena.elementAt(i));
            }
        }
        Stack<String> cadena2 = new Stack<>();
        cadena2.addAll(java.util.Arrays.asList("papa", "tomate", "par"));
        for (int i = 0; i < cadena2.size(); i++) {
            if (cadena2.elementAt(i).length() <= 3) {
                System.out.println(cadena2.elementAt(i));
            }
        }
    }
}
