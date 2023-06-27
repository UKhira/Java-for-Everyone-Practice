/**
 * simulates fuel consumption in a car.
 */
public class Car {
    private double gas;
    private double driveDistance;
    
    /**
     * Construct a car object with cleared gas and distance
     */
    public Car() {
        gas = 0;
        driveDistance = 0;
    }

    /**
     * Add gas to car
     * @param gas amount
    */
    public void addGass(double gasAmount){
        gas += gasAmount;
    }

    /**
     * Check the availability of drive
    */
    public void drive(double distance){
        driveDistance = gas * 10 / distance;
    }

    /**
     * Total gas amount in car
     * @return gas
     */
    public double gasInCar (){
        return gas;
    }

    /**
     * Distance can drive with gas amount
     * @return driveDistance - distance can drive
     */
    public double canDrive(){
        return driveDistance;
    }
}
