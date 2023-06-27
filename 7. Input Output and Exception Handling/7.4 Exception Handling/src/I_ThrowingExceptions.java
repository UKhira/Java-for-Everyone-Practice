import java.util.Scanner;

public class I_ThrowingExceptions {
    //This is a program to withdraw money from an account, if withdrawl exceed the balance it will thrrow an error
    public static void main(String[] args) {
        final double balance = 2000.00;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the withdrawl amount");
        double amount = in.nextDouble();
        in.close();
        if (amount > balance){
            throw new IllegalArgumentException("Amount Exceed balance");
        }
        else {
            System.out.println("Succecssfully withdrawl " + amount + " from account");
        }
    }
}
