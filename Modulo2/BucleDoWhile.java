package Modulo2;
import java.util.Scanner;

public class BucleDoWhile {
    public static void main(String[] args) {
        
        final int SECRET_NUM = 23 ;  // in JS => const secretNum = 2324
        int num_user ;
        Scanner theScann = new Scanner(System.in) ;

        do{
            System.out.println("Adivina el número secreto") ;
            num_user = theScann.nextInt() ;
        }
        while ( SECRET_NUM != num_user ); {    //    OJO CON EL ; Y CORCHETE {}
            System.out.println("Adivinaste!!");
        }

        theScann.close();    
    }
        
}
