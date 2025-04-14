package Modulo2;
import java.util.Scanner;

public class BucleDoWhilePract {
    public static void main(String[] args) {
        
        final int SECRET_NUM = 23 ;
        int userNumber ;
        Scanner theScann = new Scanner(System.in) ;

        do {
            System.out.println("Adivine el número entero secreto:");
            userNumber = theScann.nextInt();

            if (userNumber == SECRET_NUM) {
                System.out.println("¡Bien! Adivinaste!");
                break; // salgo del bucle si adivinó
            }
            else if (userNumber >= 24) {
                System.out.println("Ingrese un número entero menor a 24, para que:");
            }
            else {
                System.out.println("Incorrecto, intenta otra vez.");
            }

        } while (true); // bucle infinito que rompe si acierta

        theScann.close();
    }
}
