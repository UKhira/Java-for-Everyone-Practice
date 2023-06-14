/*
 *  This program computes a final score for a series of quiz scores: the sum after dropping
 *   the lowest score. The program uses arrays.
 */

import java.util.Arrays;
import java.util.Scanner;

public class I_v2 {
    public static void main(String[] args) {
        int [] scores = readInputs();
        if (scores.length == 0) {
            System.out.println("Atleast One Score is required");
        }
        else {
            int total = sum(scores) - minimum(scores);
            System.out.println("Total = "+ total);
        }
    }

    /**
        Reads a sequence of floating-point numbers.
        @return an array containing the numbers
    */
    public static int [] readInputs() {
        // Read the input value as an array
        final int INITIAL_SIZE = 10;
        int [] inputs = new int[INITIAL_SIZE];
        System.out.println("Please enter values, any letter to quit");
        Scanner in = new Scanner(System.in);
        int currentSize = 0;

        while(in.hasNextInt()) {
            // Grow the array if it has been completely filled
            if (currentSize >= inputs.length) {
                inputs = Arrays.copyOf(inputs, 2* inputs.length);
            }
            inputs[currentSize] = in.nextInt();
            currentSize++;
        }
        return Arrays.copyOf(inputs, currentSize);
    }

    /**
        Computes the sum of the values in an array.
        @param valuesan array
        @return the sum of the values in values
    */
    public static int sum(int [] value) {
        int total = 0;
        for (int element:value) {
            total += element;
        }
        return total;
    }

    /**
        Gets the minimum value from an array.
        @param values an array of size >= 1
        @return the smallest element of values
    */
    public static int minimum(int [] value) {
        int smallest = value[0];
        for (int i = 1; i < value.length; i++) {
            if (value[i] < smallest) {
                smallest = value[i];
            }
        }
        return(smallest);
    }
}

