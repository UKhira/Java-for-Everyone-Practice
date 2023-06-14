import java.util.Scanner;

/**
       This program reads a sequence of values and prints them, marking the largest value. 
    */
        
public class VI_largestInArray {
   public static void main(String[] args) {
    final int LENGTH = 100;
    double [] values = new double[LENGTH];
    int currentSize = 0;

    // Read inputs

    System.out.println("Pleae enter values press any letter to Quit: ");
    Scanner in = new Scanner(System.in);
    while (in.hasNextDouble() && currentSize < values.length) {
        values[currentSize] = in.nextDouble();
        currentSize++;
    }

    // Find the largest value

    double largest = values[0];
    for (int i = 1; i < currentSize; i++) {
        if(values[i] > largest) {
            largest = values[i];
        }
    }

    // Print all values marking the largest

    if (currentSize > 0) {
        System.out.println("Array you entered:");
    }
    else {
        System.out.println("You haven't entered anything");
    }

    for(int i = 0; i < currentSize; i++) {
        System.out.print(values[i]);
        if (values[i] == largest) {
            System.out.print(" <== largest value");
        }
        System.out.println();

    }
   }
}
