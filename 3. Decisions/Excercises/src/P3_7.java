import java.util.Scanner;
/*
 * Write a program that reads in three integers and prints "in order" if they are sorted
 * in ascending or descending order, or "not in order" otherwise.
 */
public class P3_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number ");
        double num1 = in.nextDouble();
        System.out.print("Enter another number ");
        double num2 = in.nextDouble();
        System.out.print("Enter another number ");
        double num3 = in.nextDouble();

        if ((num1 < num2 && num2 > num3) ||  (num1 > num2 && num2 < num3)) {
            System.out.println("Not in Order");
        }
        else {
            System.out.println("In order");
        }
        
    }
}
