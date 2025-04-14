package MathApps;

import java.util.Scanner;

public class MaxMinOfArray {
    public static void main(String[] args) {
        Scanner theScann = new Scanner(System.in) ;
        System.out.println("Ingrese la cantidad de elementos del Array") ;
        int n = theScann.nextInt() ;    //orden del array
        int i ;

        int [] myArray = new int[ n ] ;

        System.out.println("Ingrese los elementos numerico/enteros del array");

        for( i = 0 ; i < n ; i++ ) {
            myArray[ i ] = theScann.nextInt() ;
        };



        int maX = myArray[0] ;
        int miN = myArray[0] ;
        int t ;

        for( t = 1 ; t < n ; t++ ) {
            maX =   ( myArray[t] > maX )   ?   ( myArray[t] )   :   ( maX ) ;
            miN =   ( myArray[t] < miN )   ?   ( myArray[t] )   :   ( miN ) ;
        }

        System.out.println("Máximo valor del array es: " + maX) ;
        System.out.println("Mínimo valor del array es: " + miN) ;

        //theScann.close();

    }
    
}
