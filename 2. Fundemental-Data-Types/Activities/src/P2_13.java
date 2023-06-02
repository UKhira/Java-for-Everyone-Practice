import java.util.Scanner;

public class P2_13 {
    /*
     * Write a program that reads a number between 1,000 and 999,999 from the user, 
     * where the user enters a comma in the input. Then print the number without a comma.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 1,000 and 999,999 with comma seperated");
        String num = input.next();

        String fromLastToComma = num.substring(num.length() - 3, num.length());
        String fromfirstToComma = num.substring(0, num.length() -4);

        System.out.println(fromfirstToComma + fromLastToComma);
    }
}
