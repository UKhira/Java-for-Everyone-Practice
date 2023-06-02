import java.util.Scanner;
/*
 * Write a program that reads a number between 1,000 and 999,999 from the user and prints it with a 
 * comma separating the thousands. 
 */
public class P2_14 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 1,000 and 999,999 ");
        String num = input.next();

        String fromLastBackwardsThree = num.substring(num.length() - 3, num.length());
        String fromStart = num.substring(0, num.length() - 3);
        
        System.out.println(fromStart + "," + fromLastBackwardsThree);
    }
}
