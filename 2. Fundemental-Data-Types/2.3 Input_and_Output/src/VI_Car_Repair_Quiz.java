import java.util.Scanner;
public class VI_Car_Repair_Quiz {
    public static void main(String[] args) {
        final double CAR_REPAIR_COST_AT_YEAR_ONE = 100.00;
        final double CAR_REPAIR_COST_AT_YEAR_TEN = 1500.00;
        final int YEAR_AMOUNT_FOR_INITIAL_PART = 10;

        /*
         * from 1500 at the 10 year we already know that it's 150 for year 1
         * so we only have to find out about year 2 to year 10, which makes 9 years left (10 - 1)
         * we already know that 1st year cost is 100 so we only have to count (100 - 100) 1400 for 9 years
         * we can do the same calculations using t(n) = a + (n-1) * d
         *  a = 100 
       

       
          * at question 1,  n = 10 so t(n) = t(10) = 1500
          * n = 10 so (n - 1) = 9
          * d = ? (This is what we need to find out)  
          * so the formula is d = (t(n) - a) / (n - 1)           
        */

        double calculationForFirstPart = (CAR_REPAIR_COST_AT_YEAR_TEN - CAR_REPAIR_COST_AT_YEAR_ONE) / (YEAR_AMOUNT_FOR_INITIAL_PART - 1);
        System.out.printf("Cost incrementation per year = %.2f", calculationForFirstPart);

        /*
         * Now let's calculate cost for year 3, t(n) = t(3) = ?
        */

        final int CONSTATNT_FOR_COUNT_YEAR_THREE = 3;

        double calculationForYearThree = calculationForFirstPart * (CONSTATNT_FOR_COUNT_YEAR_THREE - 1) + CAR_REPAIR_COST_AT_YEAR_ONE;
        System.out.printf("\nThird Year cost is %.2f" , calculationForYearThree);

        Scanner scannerObject = new Scanner (System.in);

        System.out.print("\nEnter the duration of year you want to calculate cost = ");
        int year = scannerObject.nextInt();

        double calculationForYearN = calculationForFirstPart * (year - 1) + CAR_REPAIR_COST_AT_YEAR_ONE;
        System.out.printf("At the %d year The Cost is %.2f", year, calculationForYearN);
    }
}
