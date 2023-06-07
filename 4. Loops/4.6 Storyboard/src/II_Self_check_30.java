/*
 *  Produce a storyboard for a program that compares the growth of a $10,000 investment for a given number of years 
 * under two interest rates.
 */

import java.util.Scanner;

public class II_Self_check_30 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        final double INVESTMENT = 10000;                        // Investment
        
        System.out.print("Enter two interser rates \nInterest Rate 1: ");
        int interestRate1 = in.nextInt();
        System.out.print("Interest Rate 2: ");
        int interestRate2 = in.nextInt();
        System.out.println("Enter number of years: ");
        int years = in.nextInt();
        int count_year = 1;

        double rate1Interest = INVESTMENT;
        double rate2Interest = INVESTMENT;
        do {
            rate1Interest = ((rate1Interest * interestRate1 / 100) + INVESTMENT) * count_year;
            rate2Interest = ((rate2Interest * interestRate2 / 100) + INVESTMENT) * count_year;
            System.out.printf("Growth Under %d interest for year %d is %.2f %n",interestRate1, count_year, rate1Interest );
            System.out.printf("Growth Under %d interest for year %d is %.2f %n %n",interestRate2, count_year, rate2Interest );
            count_year ++;
        }
        while (count_year <= years);
    }
}
