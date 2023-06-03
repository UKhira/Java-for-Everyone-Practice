/*
 * This Worked Example shows how to extract the middle character from a string, 
 * or the two middle characters if the length of the string is even.
 */

import java.util.Scanner;

public class IV_work_example {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.println("Enter something");
        String input = get.next();

        String lengths;
        if (input.length() % 2 == 1) {
            lengths = input.substring(((input.length() + 1) / 2) - 1,(input.length() + 1) / 2);
        }

        else {
            lengths = input.substring(((input.length()) / 2) - 1,((input.length()) / 2) + 1);
        }
        System.out.println(lengths);
    }
}
