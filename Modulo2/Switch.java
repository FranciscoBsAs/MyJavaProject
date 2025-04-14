package Modulo2;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        
        int optionPositionOfList ;
        Scanner theScanner = new Scanner(System.in) ;

        System.out.println("Select a lenguage, please") ;
        System.out.println("the First English");
        System.out.println("the Second Spanish");
        System.out.println("the third French");

        optionPositionOfList = theScanner.nextInt() ;
        
        if ( 1 <= optionPositionOfList && optionPositionOfList <= 3 ) {  // condicional complejizado

            switch (optionPositionOfList) {
                case 1:
                    System.out.println("Hello!");
                    break;

                case 2:
                    System.out.println("Hola!");
                    break;

                case 3:
                    System.out.println("Bounjour!");
                    break ;
            }
        }
        else{
            System.err.println("error de numero");
        }

        theScanner.close();

    }
}
