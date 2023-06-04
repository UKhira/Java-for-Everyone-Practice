import java.util.Scanner;
/*
 * Write a program that reads four integers and prints "two pairs" if the input 
 * consists of two matching pairs (in some order) and "not two pairs" otherwise. 
 */
public class P3_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number ");
        double num1 = in.nextDouble();
        System.out.print("Enter second number ");
        double num2 = in.nextDouble();
        System.out.print("Enter third number ");
        double num3 = in.nextDouble();
        System.out.print("Enter fourth number ");
        double num4 = in.nextDouble();

        if (num1 == num2 || num1 == num3 || num1 == num4 || num2 == num3 || num2 == num4 || num3 == num4) {
            System.out.println("Two Pairs");
        }
        else {
            System.out.println("Not Two Pairs");
        }
    }
}
