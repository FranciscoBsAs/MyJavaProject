package Modulo2;

import java.util.Scanner;

public class BucleForConsolingTheLimit {
    public static void main(String[] args) {
        
        Scanner theScann = new Scanner(System.in) ;
        int theLimit ;
        int i ; 

        System.out.println("ingrese limite de iteracion");
        theLimit = theScann.nextInt() ;

        for ( i = 1 ; i < theLimit ; i++ ) {
            System.out.println("Numero " + i);
        }
    }
}
