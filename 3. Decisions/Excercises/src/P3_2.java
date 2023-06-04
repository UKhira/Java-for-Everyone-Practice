import java.util.Scanner;
import java.lang.Math;

/*
 * Write a program that reads a floating-point number and prints "zero" if the number is zero. 
 * Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less 
 * than 1, or "large" if it exceeds 1,000,000.
*/

public class P3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a floating-point number");
        double floating = in.nextDouble();

        if (floating == 0) {
            System.out.println("Zero");
        }
        else if (floating > 0) {
            System.out.println("Potive");
        }
        else {
            System.out.println("Negative");
        }

        if (Math.abs(floating) < 1) {
            System.out.println("Small");
        }
        else if (Math.abs(floating) > 1000000) {
            System.out.println("Larrger");
        }
    }
}
