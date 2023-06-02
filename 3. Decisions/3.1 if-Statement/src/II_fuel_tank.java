import java.util.Scanner;

public class II_fuel_tank {
    /*
     * The variables fuelAmount and fuelCapacity hold the actual amount of fuel and the size of the fuel 
     * tank of a vehicle. If less than 10 percent is remaining in the tank, a status light should show 
     * a red color; otherwise it shows a green color. Simulate this process by printing out either "red" 
     * or "green".
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Fuel Amount you have");
        double fuelAmount = input.nextDouble();

        System.out.println("Enter your fuel tank capacity");
        double fuelCapacity = input.nextDouble();

        double percent = (fuelAmount / fuelCapacity) * 100;

        String statusLight;
        if (percent == 10) {
            statusLight = "red";
        }
        else {
            statusLight = "green";
        }
        System.out.println("Status Light is " + statusLight);

       

    }
}
