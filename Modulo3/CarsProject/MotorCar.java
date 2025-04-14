package Modulo3.CarsProject;

public class MotorCar {
    
    private String torque ;
    private String power ;

    // constructor method: name exactly the same of class  MotorCar(class) === MotorCar(method)

    public MotorCar ( String t, String p ) {      
        //  (parametros p & t)

        this.torque = t + "Nm" ;
        this.power = p + "Hp" ;
    }

    public String MotorDataRequest() {  //yo setie ese nombre MotorDataRequest
        return (
            this.torque + " & " + this.power 
        ) ;
    }
}
