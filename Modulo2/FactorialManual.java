package Modulo2;
import java.util.Scanner;

public class FactorialManual {
    public static void main(String[] args) {
        Scanner theScann = new Scanner(System.in) ;
        int i ;
        int userNum ;
        int factorial = 1 ;

        System.out.println("Ingrese algun número => 0 " );
        userNum = theScann.nextInt() ;

        theScann.close();
        
        for( i = 1 ; i <= userNum ; i++ ) {
            
            factorial *= i ;
        }
  
        System.out.println("El factorial " + userNum + "! es igual a : " + factorial );
    }
}
