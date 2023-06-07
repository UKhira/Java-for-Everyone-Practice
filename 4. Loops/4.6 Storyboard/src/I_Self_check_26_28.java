/*
 * Provide a storyboard panel for a program that reads a number of test scores and prints the average score. 
 * The program only needs to process one set of scores. Don't worry about error handling.
*/

import java.util.Scanner;

public class I_Self_check_26_28{
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        boolean progress = true;
        int count = 0;
        double sum = 0;
        double min = 100;

        do {
            System.out.print("Enter a mark: ");
            if (in.hasNextDouble()) {
                double mark = in.nextDouble();
                if (mark >= 0 && mark < 100) {
                    sum += mark;
                    count ++;
                    if (mark < min) {
                        min = mark;
                    }
                    System.out.println("Enter a mark to comtinue, letter to quit");
                }
                else {
                    System.out.println("out of range");
                }
            }
            else {
                System.out.println("Program quitted");
                break;
            }
        }
        while (progress);

        double average; 

        if (count != 1) {
            average = (sum - min) / count;
        }
        else {
            average = sum;
        }

        System.out.printf("Average : %.2f", average);
    }
}

/*
 * Suppose we want to drop the lowest score before computing the average. 
 * Provide a storyboard for the situation in which a user only provides one score.
 */