package MathApps;

import java.util.Scanner;

public class FactorialVariation {
    public static void main(String[] args) {  //interaccion por consola
        
        Scanner theScann = new Scanner(System.in) ;
        int n ;
        int k ; 

        System.out.println("Ingrese el número total de puntos muestrales") ;
        n = theScann.nextInt() ;

        System.out.println("Ingrese la cantidad de esos puntos muestrales a permutar a la vez") ;
        k = theScann.nextInt() ;
        
        int result ;

        if (  n > 0  &&  k > 0  &&  n > k  ) {
            result = FactorialMethodOnly.FactorialOperator( n ) / FactorialMethodOnly.FactorialOperator( n - k ) ;
            System.out.println("El resultado de la permutacion: " + n + "!" + "/( " + n + "-" + k + ")!  es: " + result ) ;
        }
        else{
            System.out.println("Los valores no son válidos. Asegúrese de que: 0 ≤ k ≤ n") ;
        }
        
    }
}
