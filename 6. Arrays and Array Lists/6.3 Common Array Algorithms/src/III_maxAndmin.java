import java.util.Scanner;

public class III_maxAndmin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of your array: ");
        int length = in.nextInt();
        int [] numbers = new int [length];

        for (int elements = 0 ;elements < numbers.length; elements++) {
            System.out.println("Enter a number : ");
            numbers[elements] = in.nextInt();
        }

        int min = numbers[0];
        int max = numbers[0];
        for (int x = 1; x < numbers.length; x++) {
            if(numbers[x] > max) {
                max = numbers[x];
            }
            if(numbers[x] < min) {
                min = numbers[x];
            }
        }
        System.out.print("Highest = " + max + "      lowest = " + min);
    }

    
}
