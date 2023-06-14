import java.util.Arrays;

public class VII_sort {
    public static void main(String[] args) {
        int [] values = {12, 45, 32, -23, 321, 834, -2323, 32};
        Arrays.sort(values);            // Sort array from smallest to largest

        System.out.println(Arrays.toString(values));        // Check the result

        // Let's find a number whether it's available in array or not

        final int  NUMBER = 321;
        boolean found = false;
        int low = 0;                    // Index of 1st element
        int high = values.length - 1;   // Index of last eleemnt = arrayLength - 1 (if arrayLength = 10, the index of final element is 9)
        int pos = 0;                    // Search in certain index

        while(low <= high && !found){
            pos = (low + high) / 2;         // This array is sorted now, so rather than searching from start, we can start searching from specific index.
            // Midpoint of subsequence

            // If our value is in middle
            if (values[pos] == NUMBER) {
                found = true;
            }
            // array is sorted so if our value in index is smaller than number, we can skip till middle part and start search from there
            else if (values[pos] < NUMBER) {
                low = pos + 1;              // look in 2nd half
            }
            // if that didn't work either which mean we can search it in first half
            else {
                high = pos - 1;
            }
        }

        if(found) {
            System.out.println("Found at index " + pos);
        }
        else {
            System.out.println("Not found, inserty before index " + pos);
        }
    }
}
