package Modulo3;

public class BucleForArray {
    public static void main(String[] args) {
        
        int hundredsNumbers [] = new int [5] ;

        hundredsNumbers[0] = 100 ;
        hundredsNumbers[1] = 200 ;
        hundredsNumbers[2] = 300 ;
        hundredsNumbers[3] = 400 ;
        hundredsNumbers[4] = 500 ;

        int i ;

        for( i = 0 ; i < hundredsNumbers.length ; i++ ) {
            System.out.println( hundredsNumbers[i] );
        }
        
    }
}
