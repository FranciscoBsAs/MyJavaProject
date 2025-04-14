package MathApps;

import java.util.Scanner;

public class FactorialClassNotMethod {
    public static void main(String[] args) {
        
        Scanner theScann = new Scanner(System.in) ;
        //int num ;
        //int factorial = 1 ;
        int i ;
        String userAnswer ;

        do {
            int num ;
            int factorial = 1 ; //declarando ambas varibles aca se autoreinician desde 0 en cada ciclo Do

            System.out.println("Ingrese un entero") ;
            num = theScann.nextInt() ;
            theScann.nextLine() ;

            if ( num == 0 ) {
                System.out.println( "El factorial " + num + "! " + "= 1" );
            }
            else{
                for( i = 1 ; i <= num ; i++ ) {
                    factorial = i*factorial ;   // the same=> factorial *= i
                }
                System.out.println("El factorial " + num + "! = " + factorial );
            }

            System.out.println("Desea calcular otro factorial? (yes/no)");
            userAnswer = theScann.nextLine() ;
        }
        while ( userAnswer.equalsIgnoreCase(  "yes" ) )  ;
        
        theScann.close();
    }
}