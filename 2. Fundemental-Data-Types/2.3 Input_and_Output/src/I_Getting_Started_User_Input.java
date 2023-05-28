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

        // This will round 'total' for 2 floating points
        System.out.printf("Your total price is : \n" + "%.2f" , total);

        // This will do the same(round 3 floating points), but print it as 10 characters
        System.out.printf("\n" + "%10.3f" , total);

        // print multiple values usimg format specifier
        System.out.printf("\nQuantity: %d Total: %8.2f" , bottles , total);
        // by %x we specify the number of characters, if we got less characters than it, it leaves blank space for them and print
    }
}