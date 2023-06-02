import java.util.Scanner;
public class IV_Substrings {
    public static void main(String[] args) {
        
        String greet = "Hello World";
        String subString = greet.substring(0, 7);
        // This is same as slicing in python (0:7)
        System.out.println(subString);

        String subStr = greet.substring(7);
        System.out.println(subStr);
        // This will print everything starting from index(7) 

        //* Let's write a simple programe to return initials of name */

        Scanner nameInputs = new Scanner (System.in);
        System.out.print("Enter Your First Name : ");
        String fName = nameInputs.next();

        System.out.print("Enter Your Middle Name : ");
        String mName = nameInputs.next();

        System.out.print("Enter Your Last Name : ");
        String lName = nameInputs.next();

        System.out.print("Your initials are " + fName.substring(0, 1) + " " + 
                        mName.substring(0, 1) +" " + 
                        lName.substring(0, 1));
    }
}
