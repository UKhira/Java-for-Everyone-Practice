import java.util.Scanner;
/*
 * Write a program that reads three numbers and prints "increasing" if they are in increasing order, 
 * "decreasing" if they are in decreasing order, and "neither" otherwise. Here, "increasing" means 
 * "strictly increasing", with each value larger than its predecessor. The sequence 3 4 4 would not be 
 * considered increasing.
 */
public class P3_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number ");
        double num1 = in.nextDouble();
        System.out.print("Enter another number ");
        double num2 = in.nextDouble();
        System.out.print("Enter another number ");
        double num3 = in.nextDouble();

        if (num1 < num2 && num2 < num3) {
            System.out.println("Increasing");
        }
        else if (num1 > num2 && num2 > num3){
            System.out.println("Decreasing");
        }
        else {
            System.out.println("Neither");
        }
    }
}
