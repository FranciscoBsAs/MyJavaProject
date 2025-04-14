package Modulo3.CarsProject;

import java.util.ArrayList;
import java.util.List;

public class DealershipConcecionaria {
    public static void main(String[] args) {
        
        List < Car >  listOfCars = new ArrayList<>() ; 

        listOfCars.add(

            new Car (
                "Audi",
                2023,
                "Black",
                new MotorCar("2000", "400")
            )
        ) ;

        listOfCars.add(
            new Car(
                "Volvo",
                2022,
                "Dark Blue",
                new MotorCar("3000", "375")
                )
        );

        for ( Car i : listOfCars ) {

            System.out.println( i.FetchingDataMotor() ) ;
            
        }


    }
}
