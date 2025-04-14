package Modulo2;
import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        
        // Definitions of variables & scanner
        int num1, num2 ;
        Scanner theScann = new Scanner(System.in) ;

        // Prompt the user for the values ​​for variables
        System.out.println("Introduzca el primer entero") ;
        num1 = theScann.nextInt() ;

        System.out.println("Introduzca el segundo entero") ;
        num2 = theScann.nextInt() ;

        
        if ( num1 == num2 ) {
            System.out.println("Numeros Iguales");
        }
        else if ( num1 > num2 ) {
            System.out.println("El primer número es mayor");
        }
        else{
            System.out.println("El segundo número es mayor") ;
        }
        theScann.close();
    }
}
