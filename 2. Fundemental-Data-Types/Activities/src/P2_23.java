import java.util.Scanner;

public class P2_23 {
    /*
     *  turn a string containing a ten-digit phone number 
     * (such as "4155551212") into a more readable string with parentheses and dashes, like this: 
     * " (415) 5 55 - 1212".
     */

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Telephone number (must contain 10 digits)");
        String tp = input.next();

        System.out.println("(" + tp.substring(0, 3) + ") " + tp.substring(3, 4)
        + " " + tp.substring(4, 6) + " " + "- " + tp.substring(tp.length() - 4, tp.length()));
     }
}
