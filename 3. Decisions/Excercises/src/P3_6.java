import java.util.Scanner;
/*
 * Repeat Exercise P3.5, but before reading the numbers, ask the user whether increasing/decreasing 
 * should be "strict" or "lenient". In lenient mode, the sequence 3 4 4 is increasing and the sequence
 * 4 4 4 is both increasing and decreasing.
 */
public class P3_6 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Which method do you want (Strict/Lenient)");
        String method = in.next();
        System.out.print("Enter a number ");
        double num1 = in.nextDouble();
        System.out.print("Enter another number ");
        double num2 = in.nextDouble();
        System.out.print("Enter another number ");
        double num3 = in.nextDouble();

        if (method.toUpperCase().equals("STRICT")) {
            if (num1 < num2 && num2 < num3)  {
                System.out.println("Increasing");
            }
            else if (num1 > num2 && num2 > num3){
                System.out.println("Decreasing");
            }
            else {
                System.out.println("Neither");
            }
        }
        else if (method.toLowerCase().equals("lenient")) {
            if ((num1 == num2 && num2 < num3) || (num1 < num2 && num2 == num3) || (num1 == num2 && num2 == num3)) {
                System.out.println("Increasing");
            }
            
            if ((num1 == num2 && num2 > num3) || (num1 > num2 && num2 == num3) || (num1 == num2 && num2 == num3)) {
                System.out.println("Decreasing");
            }
        
            else {
                System.out.println("Unrecognized input");
            }
        }
    }
}
