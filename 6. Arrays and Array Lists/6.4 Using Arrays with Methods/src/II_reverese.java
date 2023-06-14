import java.util.Arrays;
import java.util.Scanner;

public class II_reverese {
    /*
     *  This program reads, scales, and reverses a sequence of numbers.
     */

     public static void main(String[] args) {
        double [] numbers = readInputs(5);
        multiply(numbers, 10);
        printReveresed(numbers);
     }

     /*
      * Read a sequnce of floating-point numbers
      * @param numberOfInputs the number of inputs to read
      * @return an array containing input values

      */
     public static double [] readInputs(int numberOfInputs) {
        System.out.println("Enter " + numberOfInputs + " numbers: ");
        Scanner in = new Scanner(System.in);
        double [] input = new double[numberOfInputs];
        
        for(int i = 0; i < numberOfInputs; i++) {
            input[i] = in.nextDouble();
        }
        return input;
     }

     /*
      * Multiplies all elements of an array by a factor.
      * param values in array
      * param factor the value with which element is multiplied
      */
     public static void multiply(double [] value, double factor){
        for(int i = 0; i < value.length; i++) {
            value[i] = value[i] * factor;
        }
        System.out.println(Arrays.toString(value));
     }
 
    /*
       * Prints an array in reverse order.
       * @param values an array of numbers
       * @return an array that contains the elements of valuesin reverse order
    */
    public static void printReveresed(double [] values) {
        // Traverse the array in reverse order, starting with the last element
        for (int i = values.length - 1; i >= 0; i--) {
            System.out.println(values[i] + " ");
        }
        System.out.println();
    }

}
