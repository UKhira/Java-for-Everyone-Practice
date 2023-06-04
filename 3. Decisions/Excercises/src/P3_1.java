import java.util.Scanner;

public class P3_1 {
    /*
     * Write a program that reads an integer and prints whether it is negative, zero, or positive.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a integer number");
        int number = in.nextInt();

        if (number > 0 ) {
            System.out.println("Positive");
        }
        else if (number < 0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }
    }
}
