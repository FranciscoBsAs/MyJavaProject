package MathApps;
import java.util.Scanner ;

public class InvertOrderOfNumbers {
    public static void main(String[] args) {
        Scanner theScann = new Scanner(System.in) ;
        int num ;

        System.out.println("Ingrese un numero entero") ;
        num = theScann.nextInt() ;

        int invertNum = 0 ;
        
        while ( num != 0 ) {
            int digit = num%10 ;  //Para considerar decimales
            invertNum = invertNum*10 + digit ;
            num = num/10 ;
        }
        System.out.println("El numero invertido es: " + invertNum) ;
        
        theScann.close();
    }
}
