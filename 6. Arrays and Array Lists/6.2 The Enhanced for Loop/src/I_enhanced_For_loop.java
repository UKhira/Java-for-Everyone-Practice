public class I_enhanced_For_loop {
    public static void main(String[] args) {
        int [] values = {1, 23, 344, 3454};
        int total = 0;

        // Enhanced for loop
        for (int element: values) {
            total = total + element;
            if (element == 344) {
                System.out.println("344 found in array");
                // Use the enhanced for loop if you do not need the index values in the loop body.
            }
        }
        System.out.println("Total = " + total);

        // Normal for loop 
        total = 0;
        for (int element = 0; element < values.length; element++) {
            total = total + values[element];
            if (values[element] == 344) {
                System.out.println("344 found in array at [" + element + "] index");
                // If you need an index or modify it, use normal for loop
            }
        }
        System.out.print("Total = " + total);
    }
}