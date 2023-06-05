/*
 * Write a do loop that reads integers and computes their sum. Stop when reading a zero 
 * or the same value twice in a row. For example, if the input is 1 2 3 4 4, then the 
 * sum is 14 and the loop stops.
 */
import java.util.Scanner;

public class II_selfCCheck4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;

        int num, num2;
        do {
            System.out.print("Enter a number : ");
            num = in.nextInt();
            sum += num;
            System.out.println("Total = " + sum);

            System.out.print("(test)Enter a number : ");
            num2 = in.nextInt();
            sum += num2;
            System.out.println("(test)Total = " + sum);
        }
        while(num != 0 && num != num2);
    }
}
