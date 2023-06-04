/*
 * Write a program that reads a temperature value and the letter C for Celsius or F 
 * for Fahrenheit. Print whether water is liquid, solid, or gaseous at the given 
 * temperature at sea level.
 */

import java.util.Scanner;

public class P3_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter C for Celsius, F for Fahrenheit");
        String temp = in.next();
        System.out.println("Enter temperature");
        double degree = in.nextDouble();

        if (temp.toLowerCase().equals("c")) {
            if (degree < 0) {
                System.out.println("Water is Solid");
            }
            else if (degree >= 100) {
                System.out.println("Water is Gaseous");
            }
            else {
                System.out.println("Water is Liquid");
            }
        }
        else if (temp.toLowerCase().equals("f")){
            if (degree >= 32 && degree < 212) {
                System.out.println("Water is Liquid");
            }
            else if (degree >= 212) {
                System.out.println("Water is Gaseous");
            }
            else {
                System.out.println("Water is Solid");
            }
        }
        else {
            System.out.println("Unrecognized Input");
        }
    }
}
