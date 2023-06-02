import java.util.Scanner;
import java.lang.Math;
/*
 * Write a program that asks the user for the lengths of the sides of a rectangle. Then print

    * The area and perimeter of the rectangle
    * The length of the diagonal (use the Pythagorean theorem)
*/
public class P2_8 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        System.out.println("Enter the width");
        double width = input.nextDouble();
        
        System.out.println("Enter the length");
        double length = input.nextDouble();

        System.out.println("Perimeter = " + (length * 2) + (width * 2));
        System.out.println("Diagonal = " + Math.sqrt((Math.pow(length, 2)) + (Math.pow(width, 2))));
    }
}
