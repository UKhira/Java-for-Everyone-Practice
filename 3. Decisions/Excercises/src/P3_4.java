/*
 * Write a program that reads three numbers and prints "all the same" if they are all the same, 
 * "all different" if they are all different, and "neither" otherwise.
 */

import java.util.Scanner;

public class P3_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number ");
        double num1 = in.nextDouble();
        System.out.print("Enter another number ");
        double num2 = in.nextDouble();
        System.out.print("Enter another number ");
        double num3 = in.nextDouble();

        if (num1 == num2 && num2 == num3) {
            System.out.println("All the same");
        }
        else if (num1 != num2 && num2!= num3 && num1 != num3) {
            System.out.println("All different");
        }
        else {
            System.out.println("Neither");
        }
    }
}
