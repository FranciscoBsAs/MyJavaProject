package Modulo3;

public class MatricesMultipleArraysInOne {
    public static void main(String[] args) {
        
        //definicion de la matriz:
        
        String [] [] teamsMatrix = new String[2][5] ;  // 2 filas de 5 columnas

        // First fila => first team
        teamsMatrix[0][0] = "Jose C Paz" ;
        teamsMatrix[0][1] = "Jeniifer Lawra" ;
        teamsMatrix[0][2] = "John Lopez" ;
        teamsMatrix[0][3] = "Charly Garcia" ;
        teamsMatrix[0][4] = "Willy Brown" ;
    
        // Second fila => second team
        teamsMatrix[1][0] = "Carlos Paz" ;
        teamsMatrix[1][1] = "Andrew Garfield" ;
        teamsMatrix[1][2] = "Emma Stone" ;
        teamsMatrix[1][3] = "Anderson Andersen" ;
        teamsMatrix[1][4] = "Tobey Maguire" ;

        int i , j ;
        
        //Recorre la matriz con dos for (una por fila i, otra por columna j).
        //Imprime cada elemento seguido de , excepto el último (por eso if).

        System.out.print("Los integrantes de los equipos son [");

        for ( i = 0 ; i < teamsMatrix.length; i++) {
            for ( j = 0; j < teamsMatrix[i].length; j++) {
            
                System.out.print(teamsMatrix[i][j]);
                
                if (  i != teamsMatrix.length - 1  ||  j != teamsMatrix[i].length - 1  ) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println("]");

        //itaración filtrando por equipo
        int h, p ;

        for ( p = 0; p < teamsMatrix.length; p++) {     //Filas
            System.out.print("Equipo " + (p + 1) + ": [");

            for ( h = 0 ; h < teamsMatrix[p].length ; h++ ) {   //Columnas

                System.out.print( teamsMatrix[p][h] ) ;

                if ( h != teamsMatrix[p].length - 1 ) {
                    System.out.print(", ");
                }
            }

            System.out.println("]");
        }
    }
}
