public class CarDrive {
    public static void main(String[] args) {
        Car carOne = new Car();

        carOne.addGass(20);
        carOne.addGass(5);
        carOne.drive(100);

        System.out.println("Total Gas amount in car: " + carOne.gasInCar());
        System.out.println("Can drive " + carOne.canDrive() + " distance with current amount");
    }
}
