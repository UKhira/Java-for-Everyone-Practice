import java.util.Scanner;

public class III_Rat_Weight {
    // Suppose you are charged with writing a program that processes rat weights
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the weight in grams : ");       // suppose every rat weight 0.5g - 500g

        if (in.hasNextDouble()) {
            double weight = in.nextDouble();

            if (weight < 0.5 || weight > 500) {
                System.out.println("Out of rat weight range");
            }
            else if (weight > 100 && weight <= 500) {
                System.out.println("A giant rat");
            }
            else {
                System.out.println("A city rat");
            }
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
