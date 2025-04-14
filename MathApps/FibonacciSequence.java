package MathApps;
import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner theScan = new Scanner(System.in) ;
        int num ;

        System.out.println("Ingrese el número de termino de la secuencia FIbonacci que desea calcular");
        num = theScan.nextInt() ;

        int result = fibonacciFunction(num) ;

        System.out.println("El termino " + num + " de la secuencia Fibonacci es: " + result);

    }

    public static int fibonacciFunction( int t ) {
        if ( t <= 1 ) {
            return ( t ) ;
        }
        else{
            return(
                fibonacciFunction( t - 1) + fibonacciFunction( t - 2 ) 
            ) ;                                                         //nunca puntoComa dentro del return
        }
    }
}
