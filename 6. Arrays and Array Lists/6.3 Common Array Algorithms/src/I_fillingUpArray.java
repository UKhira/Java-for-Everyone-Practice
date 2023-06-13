import java.util.Scanner;

public class I_fillingUpArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("This program will print the square of numbers, starting 0 to given value");
        System.out.print("Enter a value: ");
        int value = in.nextInt();

        int [] values = new int[value+1];
        for (int i = 0; i < values.length; i++) {
            values[i] = i * i;
        }

        for (int i = 0; i < values.length; i++) {
            System.out.printf(  "%d %3s %3d = %3d%n",i,"x", i, values[i]);
        }
        
    }
}
