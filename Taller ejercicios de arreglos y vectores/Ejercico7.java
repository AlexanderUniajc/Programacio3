public class Ejercico7 {
    public static void main(String[] args) {
        int [] numeros = new int[10] ;
        int [] pares = new int[10];
        int [] inpares = new int[10];

        for(int i=0; i<10; i++){
            if(pares [i] % 2 == 0){
                System.out.println(+ pares [i]);
            }else{
                System.out.println(+ inpares [i]);
            }

        }
    }
}
