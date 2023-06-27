public class CarDrive {
    public static void main(String[] args) {
        Car carOne = new Car();

        carOne.addGass(20);
        carOne.drive(100);
        carOne.drive(200);
        carOne.addGass(5);
        
        System.out.println("Total Gas amount in car: " + carOne.gasInCar());
    }
}
