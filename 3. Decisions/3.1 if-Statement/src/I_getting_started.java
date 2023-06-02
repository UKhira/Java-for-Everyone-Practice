import java.util.Scanner;

public class I_getting_started {
    public static void main(String[] args) {
        // ? This program will simulate an elevator panel that skip 13th floor

        Scanner input = new Scanner(System.in);

        System.out.println("Floor: ");
        int floor = input.nextInt();

        // Adjust floor if necessary

        int actualFloor;
        if (floor >= 13) {
            actualFloor = floor + 1;
        }
        else {
            actualFloor = floor;
        }

        System.out.println("The elevator will travel to the actual floor " + actualFloor);
    }
}
