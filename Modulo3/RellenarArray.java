package Modulo3;

import java.util.Scanner;

public class RellenarArray {
    public static void main(String[] args) {
        
        String name ;
        int i ;
        String course [] = new String[ 6 ] ;
        
        Scanner theScann = new Scanner(System.in) ;

        for ( i = 0 ; i < course.length ; i++ ) {
            System.out.println("Indique uno por uno los nombres de los estudiantes") ;

            name = theScann.nextLine() ;
            course[ i ] = name ;

        }

        System.out.print( "Los estudiantes son: ");
        for ( int t = 0 ; t < course.length ; t++ ) {
            
            System.out.print( course[ t ]) ;
            
            if (t < course.length - 1) {
                System.out.print(", ");
            }

        }
    }
}
