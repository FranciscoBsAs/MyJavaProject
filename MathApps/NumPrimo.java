package MathApps;
import java.util.Scanner ;

public class NumPrimo {
    public static void main(String[] args) {
        Scanner theScann = new Scanner(System.in) ;
        
        System.out.println("Ingrese un entero");
        int userNum = theScann.nextInt() ;
        boolean primeNumber = true ;
        int i ;
        theScann.close() ;
        
        for ( i = 2 ; i <= Math.sqrt(userNum) ; i++ ) {   //sqrt: raiz cuadrada
            if ( userNum % i == 0 ) {
                primeNumber = false ;
                break ;
            }
        }

        System.out.println( ( primeNumber == false )  ?  ( "Es primo" )  :  ( "No es primo" )  );

    }
    
}
