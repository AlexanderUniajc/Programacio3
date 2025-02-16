public class Ejercico7 {
    public static void main(String[] args) {
        int n = 10;
        int [] pares = new int[n];
        int [] inpares = new int[n];

        int numPar = 2;
        int numInpar = 2;

        for(int i=0; i<n; i++){
            pares [i] = numPar;
            inpares [i] = numInpar;
            numPar += 2;
            numInpar += 2;

        }
    }
}
