public class Prueba1 {
   public static void main(String[] args) {
    int[] a = {2,5,8,3,1,10,11};
    System.out.println(sumaParesImparesArreglo(a));
   } 
   public static String sumaParesImparesArreglo(int[]a){
    int sumaPares =0,sumaImpares=0;
    String cad="";
    for(int i=0; i< a.length;i++){
        if (a[i]%2==0){
            sumaPares+=a[i];
        }else{
            sumaImpares+=a[i];
        }
    }
    cad = "la suma de los numeros pares =" +sumaPares+ "suma de los numeros impares =" +sumaImpares;
    return cad;
   }
}
