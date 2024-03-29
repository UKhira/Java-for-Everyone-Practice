import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.NoSuchElementException;

/*
 * This program processes a file containing a count followed by data values.
    If the file doesn't exist or the format is incorrect, you can specify another file.
*/
public class III_DataAnalyzer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Keep trying until there are no more exceptions

        boolean done = false;
        while(!done) {
           try {
                System.out.print("Please Enter the file name: ");
                String fileName = in.next();

                double [] data = readFile(fileName);

                // As an example for processing the data, we compute the sum
                double sum = 0;
                for (double d : data){
                    sum += d;
                }
                System.out.print("Sum is: " + sum);

                done = true;
           }
           catch (FileNotFoundException exception) {
                System.out.println("File Not Found");
           }
           catch (NoSuchElementException exception){
                System.out.println("File Contents Invalid");
           }
           catch(IOException exception){
                exception.printStackTrace();
           }
        }
        in.close();
    }

    /**
     Opens a file and reads a data set.
     @param filename the name of the file holding the data
     @return the data in the file
    */

    public static double [] readFile(String fileName) throws IOException{
        File infile = new File(fileName);
        Scanner in = new Scanner(infile);

        try {
            return readData(in);
        }
        finally {
            in.close();
        }
    }

    /**
     Reads a data set.
     @param in the scanner that scans the data
     @return the data set
    */
    public static double [] readData(Scanner in) throws IOException{
        int numberOfValues = in.nextInt();
        double [] data = new double[numberOfValues];

        for (int i = 0; i < numberOfValues; i++){
            data[i] = in.nextDouble();          // May throw NoSuchElementException
        }
        if (in.hasNextInt()) {
            throw new IOException("End of file expected");
        }
        return data;
    }
}
