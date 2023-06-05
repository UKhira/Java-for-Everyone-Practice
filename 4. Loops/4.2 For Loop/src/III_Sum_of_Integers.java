/*
 * Write a for loop that computes the sum of the integers from 1 to n.
 */

import java.util.Scanner;

public class III_Sum_of_Integers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number ");
        int n = in.nextInt();

        int sum = 0;
        for(int initial = 1; initial <= n; initial++) {
            sum = sum + initial;
            System.out.println(sum);
        }   
    }
}
