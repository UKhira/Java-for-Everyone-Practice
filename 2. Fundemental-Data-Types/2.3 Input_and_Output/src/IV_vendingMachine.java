/*
 * This Program simulates a vending machine which gives change
 */
import java.util.Scanner;
public class IV_vendingMachine {
    public static void main(String[] args) {

        final int PENNIES_PER_DOLLAR = 100;                 // Initialized a constant pennies per dollar for later calculations
        final int QUARTERS_PER_100_PENNIES = 25; 
        
        Scanner user_input = new Scanner (System.in);

        System.out.println("Enter bill value (1 = $1, 2 = $2 etc...)");
        int billValue = user_input.nextInt();               // Get bill value

        System.out.println("Enter Item price in dollars (125 penniess = $1.25, 150 pennies = $1.5, etc...)");
        double itemPrice = user_input.nextDouble();         // Get item price

        double changeDue = (billValue * PENNIES_PER_DOLLAR) - (itemPrice * PENNIES_PER_DOLLAR);

        int dollarCoins = (int)changeDue / PENNIES_PER_DOLLAR;

        int pennies = ((int)changeDue % PENNIES_PER_DOLLAR);
        int quarters = pennies / QUARTERS_PER_100_PENNIES;

        System.out.println("Dollar Coins : " + dollarCoins);
        System.out.println("Quarters : " + quarters);
        
    }    
}