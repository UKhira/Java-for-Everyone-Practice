import java.util.Scanner;
    /**
      This program simulates an elevator panel that skips the 13th floor, checking for
      input errors.
    */

public class II_Elevator_program_mofified_with_user_error_handling {
    public static void main(String[] args) {
        Scanner floorNo = new Scanner(System.in);
        System.out.print("floor : ");
        
        if (floorNo.hasNextInt()) {
            // Now we know that user entered a number (integer)
            int floor = floorNo.nextInt();

            if (floor == 13) {
                System.out.println("Error ! There is no 13 floor");
            }
            else if (floor <= 0 || floor > 20){
                System.out.println("There is no " + floor + " floor \nFloors : 1 - 20");
            }
            else {
                floor --;
                System.out.println("Your destination is floor : " + floor);
            }
        }

        else {
            // If user entered a non-integer value
            System.out.println("Invalid input Floor number must be an integer");
        }
    }
}
