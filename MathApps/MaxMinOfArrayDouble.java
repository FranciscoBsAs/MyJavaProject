package MathApps;

import java.util.Scanner;

public class MaxMinOfArrayDouble {
    public static void main(String[] args) {
        
        Scanner theScanner = new Scanner(System.in) ;
        System.out.println("Ingrese la cantidad de elementos del Array") ;
        int n = theScanner.nextInt() ;    //orden del array
        int i ;

        double [] myArrayDouble = new double[ n ] ;

        System.out.println("Ingrese los elementos numerico/reales para el array");

        for( i = 0 ; i < n ; i++ ) {
            myArrayDouble[ i ] = theScanner.nextDouble() ;
        };

        double maX = myArrayDouble[0] ;
        double miN = myArrayDouble[0] ;
        int t ;

        for( t = 1 ; t < n ; t++ ) {
            maX =   ( myArrayDouble[t] > maX )   ?   ( myArrayDouble[t] )   :   ( maX ) ;
            miN =   ( myArrayDouble[t] < miN )   ?   ( myArrayDouble[t] )   :   ( miN ) ;
        }

        System.out.println("Máximo valor del array es: " + maX) ;
        System.out.println("Mínimo valor del array es: " + miN) ;

        //theScanner.close();
    }
}
