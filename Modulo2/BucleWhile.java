package Modulo2;
import java.util.Scanner ;

public class BucleWhile {
    public static void main(String[] args) {
        
        int initialNumber ;
        int stopNumber ;
        int i ;
        Scanner theScann = new Scanner(System.in) ;

        System.out.println( "Ingrese el número inicial" ) ;
        initialNumber = theScann.nextInt() ;
        

        System.out.println("Ingrese el número de tope");
        stopNumber = theScann.nextInt() ;

        while ( initialNumber <= stopNumber ) {
            i = initialNumber ;
            initialNumber++ ;
                System.out.println( "Iterador en: " + i ) ; // ojo con ese orden de comandos
        }
        
        theScann.close();
    }
}
