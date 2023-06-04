import java.util.Scanner;
public class I_hasMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number ");
        in.nextInt();
        // ? Imagine what if user did not enter an integer, instead he enter a string or float
        // ? Program will cause a run time error

        // ? So to make this avoid we use "has.nextInt()" method to check whether input is integer or not

        System.out.println("Enter a integer");
        System.out.print("Try entering any other than integer : ");
        
        if (in.hasNextInt()) {
            System.out.println("is an integer");
        }
        else {
            System.out.println("not an integer");
        }

    }
}
