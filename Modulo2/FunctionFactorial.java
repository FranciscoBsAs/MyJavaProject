package Modulo2;
import java.util.Scanner ;

public class FunctionFactorial {
    
    //public int UserInter ;
    public void HalfCalculator( ) {
        Scanner theScann = new Scanner(System.in) ;
        int UserInter ;
        
        System.out.println("Agregue un numero entero");
        UserInter = theScann.nextInt() ;

        System.out.println("La mitad del número " + UserInter + " es: " + UserInter*1/2 );

        theScann.close();
    }
    public static void main(String[] args) {
        FunctionFactorial ff = new FunctionFactorial();  // se instancia un objeto entero a partir de la class primera

        ff.HalfCalculator();
    }
}
