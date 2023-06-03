import java.util.Scanner;

public class  I_String_comarison{
    public static void main(String[] args) {
        // ?To test whether two strings are equal to each other, you must use the method called "equals"
        String str1 = "Random";
        String str2 = "Random";
        
        if (str1.equals(str2)) {
            System.out.println("They match and this method works");
        }
        
        // now let's try to do the same thing using "==" opeartor

        if (str1 == str2) {
            System.out.println("They match and this method works too");
        }
        
        // ! this does have output. but in here it has another meaning,  
        // ! It tests whether the two strings are stored in the same location. 

        // ! MUST -  USe euqals() to compare strings

        System.out.println("Tomato".substring(0, 3).equals("Tom"));

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Y to quit");
        String inputUser = input.next();
        
        if (inputUser.equals("Y")) {
            System.out.println("Good Bye");
        }

        String str = "";
        if (str.equals("")) {
            System.out.println("str is empty");
        }
    }
}
