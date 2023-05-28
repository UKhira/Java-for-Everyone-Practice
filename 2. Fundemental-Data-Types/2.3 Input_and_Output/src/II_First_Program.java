import java.util.Scanner;

public class II_First_Program {
    /* 
        This Program wil print the price per ounce for a six pack cans  
    */

    public static void main (String [] args) {
       //Read price per pack
       Scanner scannerObject = new Scanner(System.in);

       System.out.println("Please enter the price for a six pack :");
       double packPrice = scannerObject.nextDouble();

       //Read can volume
       System.out.println("Please enter the volume for each can(in ounce) :");
       double canVolume = scannerObject.nextDouble();

       // Compute pack volume
       final double CANS_PER_PACK = 6;
       double packVolume = canVolume * CANS_PER_PACK;

       double pricePerOunce = packPrice / packVolume;

       System.out.printf("\nPrice per ounce : %8.2f" , pricePerOunce);

       
    }
}
