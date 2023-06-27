/**
 * simulates fuel consumption in a car.
 */
public class Car {
    private double gas;

    /**
     * Construct a car object with cleared gas and distance
     */
    public Car() {
        gas = 0;
    }

    /**
     * Add gas to car
     * @param gas amount
    */
    public void addGass(double gasAmount){
        this.gas += gasAmount;
    }

    /**
     * Calculate remaining gas amount after drive
    */
    public void drive(double distance){
        this.gas = gas - (distance/100);
    }

    /**
     * Total gas amount in car
     * @return gas - gas amount in car
     */
    public double gasInCar (){
        return gas;
    }
}
