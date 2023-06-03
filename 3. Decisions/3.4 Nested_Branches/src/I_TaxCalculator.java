import java.util.Scanner;

public class I_TaxCalculator {
    /*
      *  This program computes income taxes, using a simplified tax schedule.
    */
    public static void main(String[] args) {
        
        final double RATE1 = 0.10;
        final double RATE2 = 0.25;
        final double RATE1_SINGLE_LIMIT = 32000;
        final double RATE1_MARRIED_LIMIT = 64000;

        double tax1 = 0;
        double tax2 = 0;

        // Read income and martial status

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your income : ");
        double income = in.nextDouble();

        System.out.print("Please enter s for single m for married : ");
        String martialStatus = in.next();

        // Compute taxes due

        if (martialStatus.toLowerCase().equals("s")) {
            if (income <= RATE1_SINGLE_LIMIT) {
                tax1 = RATE1 * income;
            }
            else {
                tax1 = RATE1 * RATE1_SINGLE_LIMIT;
                tax2 = RATE2 * (income - RATE1_SINGLE_LIMIT);
            }
        }

        else if (martialStatus.toLowerCase().equals("m")){
            if (income <= RATE1_MARRIED_LIMIT) {
                tax1 = RATE1 * income;
            }
            else {
                tax1 = RATE1 * RATE1_MARRIED_LIMIT;
                tax2 = RATE2 * (income - RATE1_MARRIED_LIMIT);
            }
        }
        else {
            System.out.println("Invalid Martial status input");
        }
        double totalTax = tax1 + tax2;
        System.out.printf("The tax is : $%.2f" , totalTax);
        
    }
}