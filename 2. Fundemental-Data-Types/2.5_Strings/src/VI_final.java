import java.util.Scanner;
import java.lang.Math;
public class VI_final {
    public static void main(String[] args) {
        
        Scanner inputs = new Scanner (System.in);

       /*
        ? Write program for a program that reads a word and then prints the first character, 
        ? the last character, and the characters in the middle. For example, if the input is Harry, 
        ? the program prints H y arr.
        */System.out.println("Enter a Word");
         String word = inputs.next();
         System.out.print(word.substring(0, 1));
         System.out.print(" " + word.substring(word.length()-1, word.length()));
         System.out.println(" " + word.substring(1, word.length()-1));

         /*
          * Write pseudocode for a program that computes the first and last digit of a number. 
          * For example, if the input is 23456, the program should print 2 and 6. 
          * Hint:%, Math.log10.
          */
          System.out.println("Enter a Number");       
          int number = inputs.nextInt();
        
          int digits = (int)Math.log10(number);
          int firstDigit = (int) (number / Math.pow(10, digits));

          int lastDigit = number % 10;
          System.out.println("First Digit = " + firstDigit + " Last Digit = " + lastDigit);

          String days = "MonTueWedThuFriSatSun";

          System.out.println("Enter a number of a day in week");
          int dayNo = inputs.nextInt();
          System.out.println(days.substring((dayNo -1) * 3, ((dayNo -1) * 3) + 3));

          System.out.println("Let's swap two letters from a word");
          System.out.println("Eenter a Word");
          String wordEnter = inputs.next();
        
          System.out.println("Enter the index of first letter you want to swap");
          int i = inputs.nextInt();

          System.out.println("Enter the index of next letter you want to swap");
          int j = inputs.nextInt();
            
          String startToi= wordEnter.substring(0, i);
          String iToj = wordEnter.substring(i + 1, j);
          String jtoLast = wordEnter.substring(j + 1, wordEnter.length());
          String fori = wordEnter.substring(i, i + 1);
          String forj = wordEnter.substring(j, j+ 1 );

          System.out.println(startToi + forj + iToj + fori + jtoLast);
    }
}
