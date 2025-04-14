package Modulo3.CarsProject;

public class Car {
    
    private String brand ; //osea marca
    private int model ;
    private String color ;

    private MotorCar motorType ;


    // constructor method:

    public Car ( String a ,  int b ,  String c ,  MotorCar d  ) {
        super() ;
        this.brand = a ;
        this.model = b ; 
        this.color = c ;
        this.motorType = d ;
    }

    public String FetchingDataMotor () {        //yo setie ese nombre FetchingDataMotor
        return (

            "Los datos del auto son: " + (
                "Brand :" + brand + ", " +
                "Model: " + model + ", " +
                "Color: " + color + ", " +
                "Type Motor: " + motorType.MotorDataRequest() 
            )
        
        );
    }
}
