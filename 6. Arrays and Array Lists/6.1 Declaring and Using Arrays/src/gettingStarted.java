import java.util.Scanner;

public class gettingStarted {
    public static void main(String[] args) {
        // An array of size 10
        final int LENGTH = 10; 
        double [] values = new double[LENGTH];

        int [] moreValues = {32, 44, 65, 39, 113, 118, 43, 90, 39, 2012};
        for (int i = 0; i < moreValues.length;i++) {
            System.out.println(moreValues[i]);
        }
        int [] copyOfMoreValues = moreValues;
        // This will copy the moreValues array into copyofMoreValues array

        // The following loop collects inputs and fills up the values array:
        int currentSize = 0;
        Scanner in = new Scanner(System.in);
        while (in.hasNextDouble()) {
            if (currentSize < values.length) {
                System.out.print("Enter a number: ");
                values[currentSize] = in.nextDouble();
                currentSize++;
            }
        }
        for (int i = 0; i < values.length; i++) {
            System.out.print("   " + values[i]);            
        }
    }
}
