import java.util.Scanner;;

public class I_Getting_Started_User_Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                                 // ? Creating a scanner object for getting user input
        System.out.println("Please enter the number of bottle : ");             // ? Prompt to screen
        int bottles = input.nextInt();                                          // ? Call the scanner object and let user input, and assign it to a variable
        System.out.println("You entered " + bottles + " bottles");

        System.out.println("Enter price : ");
        float price = input.nextFloat();

        double total = bottles * price;
        System.out.println("Your total price is : \n" + total);
    }
}