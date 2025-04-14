// programa para saber si un alumno aprobo o no una materia:

package Modulo2;

import java.util.Scanner;

public class TernaryOperator {

    public static void main(String[] args) {
        
        double averageCalifications ;
        String finalCondition ;
        
        Scanner theScann = new Scanner(System.in) ;

        System.out.println("Ingrese el promedio del alumno") ;
        averageCalifications = theScann.nextDouble() ;

        finalCondition =   (averageCalifications >= 6 )    ?   ("Aprobado")   :   ("Desaprobado") ;

        System.out.println(finalCondition);

    }
}
