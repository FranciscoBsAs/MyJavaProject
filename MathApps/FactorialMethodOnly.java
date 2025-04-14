package MathApps;

public class FactorialMethodOnly {

    // method:
    public static int FactorialOperator ( int someNumbers ) {
        
        int factorial = 1 ;
        int i ;

        if ( someNumbers == 0 || someNumbers == 1 ) {
            return(
                1
            ) ;
        }
        else{
            for ( i = 1; i <= someNumbers ; i++) {
                factorial = i*factorial ;
            }

            return(
                factorial
            );
        }

    }
}
