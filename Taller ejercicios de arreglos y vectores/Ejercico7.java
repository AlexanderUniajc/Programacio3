public class Ejercico7 {
    public static void main(String[] args) {
        int n = 5;
        int [] pares = new int[n];
        int [] inpares = new int[n];

        int numPar = 2;
        int numInpar = 1;

        for(int i=0; i<n; i++){
            pares [i] = numPar;
            inpares [i] = numInpar;
            numPar += 2;
            numInpar += 2;
        }
        System.out.println("Numneros pares");
        for(int i=0; i<n; i++){
            System.out.println(pares [i]);
        }
        System.out.println("Numneros inpares");
        for(int i=0; i<n; i++){
            System.out.println(inpares [i]);
    }
}
}
