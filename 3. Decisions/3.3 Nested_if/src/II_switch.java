import java.util.Scanner;

public class II_switch {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 - 7");
        int day = input.nextInt();

        String dayName;
        switch(day) {
            case 1 : dayName = "Monday"; break;
            case 2 : dayName = "Tuesday"; break;
            case 3 : dayName = "Wednesday"; break;
            case 4 : dayName = "Thursday"; break;
            case 5 : dayName = "Friday"; break;
            case 6 : dayName = "Saturday"; break;
            case 7 : dayName = "Sunday"; break;
            default : dayName = "Looking forward for new week";
            // ? This "default" condition is same as "else" if either of given condition hasn't satisfied, it will go to default statement
            // ? like if user enterd a value other than 1-7 it will print "Looking forward for weekend"
        }
        System.out.println(dayName);

        String monthName;
        System.out.println("Enter a number between 1 - 12");
        int month = input.nextInt();

        switch(month) {
            case 1 : monthName = "January"; break;
            case 2 : monthName = "February"; break;
            case 3 : monthName = "March"; break;
            case 4 : monthName = "April"; break;
            case 5 : monthName = "May"; break;
            case 6 : monthName = "June"; break;
            case 7 : monthName = "July"; break;
            case 8 : monthName = "August"; break;
            case 9 : monthName = "September"; break;
            case 10 : monthName = "October"; break;
            case 11 : monthName = "November"; break;
            case 12 : monthName = "December"; break;
            default : monthName = "Happy New Year !"; break;
        }
        System.out.println(monthName);


        System.out.println("Enter a vowel");
        String vowelInput = input.next();

        int vowel;
        switch(vowelInput.toLowerCase()) {
            case "a" : vowel = 1; break;
            case "e" : vowel = 2; break;
            case "i" : vowel = 3; break;
            case "o" : vowel = 4; break;
            case "u" : vowel = 5; break;
            default : vowel = 0; break;
        }
        System.out.println(vowel);
        /*
            ! The switch statement can be applied only in narrow circumstances. 
            ! The values in the case clauses must be constants. They can be integers or characters. 
            ! As of Java 7, strings are permitted as well. You cannot use a switch statement to branch 
            ! on floating-point values.

            ! using "break" statement after everu case is a MUST, unless code won't run properly
        */ 
    }
}
