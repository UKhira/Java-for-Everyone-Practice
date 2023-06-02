import java.util.Scanner;
import java.lang.Math;
public class p2_4 {
    public static void main(String[] args) {
        Scanner numbers = new Scanner (System.in);

        System.out.println("Enter a number");
        double number1 = numbers.nextDouble();
        
        System.out.println("Enter another number");
        double number2 = numbers.nextDouble();

        System.out.printf("Sum = %15.0f \n", number1 + number2);
        System.out.printf("Difference = %9.0f \n", number1 - number2);
        System.out.printf("Product = %12.0f \n", number1 * number2);
        System.out.printf("Average = %14.2f \n", (number1 + number2) / 2);
        System.out.printf("Distance = %10.0f \n", Math.abs(number1 - number2));
        System.out.printf("Maximum = %11.0f \n", Math.max(number1, number2));
        System.out.printf("Min = %14.0f", Math.min(number1,number2));
    }

}
