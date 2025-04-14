package Modulo2;

public class SelectBetweenTwoInFunction {
    public String Lenguage ;  // Defino variable PUBLIC = GLOBAL para todo el archivo

    public static void SelectLenguageCalculator( String Lenguage ) {        // function = method con parametro
        if( Lenguage.equals("English") ) {
            System.out.println("Menú");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
        }
        else if ( Lenguage.equals("Español") ) {
            System.out.println("Menú");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
        }
        else{
            System.out.println("En el setteo, CON CÓDIGO, del metodo tiene que parametrizar Seleccionando unicamente entre English y Español");
        }

    }
    public static void main(String[] args) {
        
        SelectLenguageCalculator( "English");
    }
}
