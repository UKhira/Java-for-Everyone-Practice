import java.util.Scanner;
import java.lang.Math;
public class P2_3 {
    /*
     * Write a program that reads a number and displays the square, cube, and fourth power. 
     * Use the Math.pow method only for the fourth power.
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner (System.in);

        System.out.println("Enter a number");
        double number = userInput.nextInt();

        System.out.println(Math.pow(number, 2));
        System.out.println(Math.pow(number, 3));
        System.out.println(Math.pow(number, 4));
    }
}
