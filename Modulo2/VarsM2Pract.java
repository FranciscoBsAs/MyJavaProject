package Modulo2;
import java.util.Scanner; 

public class VarsM2Pract {
    public static void main(String[] args) {
        
        int n1,n2 ;
        float halfNumber ;
        String nameRegistred = "Andrew" ;
        String nameIntroduced ;
        //boolean myCheckUser ;
        //Scanner theScann = new Scanner(System.in) ;
        Scanner theScann2 = new Scanner(System.in) ;


        System.out.println( "Introduzca su Nombre" ) ;
        nameIntroduced = theScann2.nextLine() ;


        if ( nameRegistred.equals( nameIntroduced ) ) {
            System.out.println( " Introduzca 2 números enteros y uno decimal continuamente" ) ; 

            n1 = theScann2.nextInt() ;
            n2 = theScann2.nextInt() ;
            halfNumber = theScann2.nextFloat() ;

            // Result:
            System.out.println( "Su resultado: " + ( ( n1*n2 ) + halfNumber ) ) ;


        }
        else{
            System.out.println( "Error" ) ;
        }
        theScann2.close();
    }
    
}
