package Modulo2;
import java.util.Scanner;

public class VarsM2 {

    public static void main(String[] args) {    //teoria de esta expresion en cuaderno
        
        // Definition of variables
        int num1, num2 ;
        float halfNumber ;
        //String name ;
        //boolean binaryAnswer ;

        // Prompt the user for the values ​​for variables
        System.out.println( "Introduce ambos numeros" ) ;

        // Lecture of variables with values
        Scanner theScann = new Scanner(System.in) ;
        num1 = theScann.nextInt() ;
        num2 = theScann.nextInt() ;
        halfNumber = theScann.nextFloat() ;

        // Result expression
        System.out.println(  (num1 * num2) / halfNumber);

        theScann.close();

    }
    
}
