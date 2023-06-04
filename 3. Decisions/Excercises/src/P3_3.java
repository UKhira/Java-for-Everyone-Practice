import java.util.Scanner;

public class P3_3 {
    /*
     * Write a program that reads an integer and prints how many digits the number has, 
     * by checking whether the number is > 10, > 100, and so on. (Assume that all integers are less 
     * than ten billion.) If the number is negative, first multiply it with −1.
     * 1
     * 10
     * 100
     * 1 000
     * 10 000
     * 100 000
     * 1 000 000
     * 10 000 000
     * 100 000 000
     * 1 000 000 000
     * 10 000 000 000
     */

     public static void main(String[] args) {
        Scanner in = new Scanner(System .in);
        System.out.print("Enter a number ");
        int num = in.nextInt();

        if (num < 0) {
            num = num * -1;
        }

        String number = Integer.toString(num);
        int digit = number.length() ;

        System.out.println(digit);

     }
}
