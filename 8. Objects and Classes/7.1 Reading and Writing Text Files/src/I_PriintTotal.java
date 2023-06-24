import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * ! This Program read a file with numbers, and write a numbers to another file
 * TODOlined up column and there total
 */
public class I_PriintTotal {
    public static void main(String[] args) throws FileNotFoundException{
        // prompt for input and output file names

        Scanner console = new Scanner(System.in);
        System.out.println("Input File: ");
        String inputFileName = console.next();
        System.out.println("Output File: ");
        String outputFileName = console.next();

        // Construct the Scanner and printWriter  objects for reading andd writing
        
        File inputFile = new File(inputFileName);
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter(outputFileName);

        //  Read the input and write the output
        double total = 0;
        int count = 0;

        while (in.hasNextDouble()){
            double value = in.nextDouble();
            out.printf("%15.2f\n", value);
            total = total + value;
            count++;
        }
        out.printf("Total: %8.2f\n", total);
        out.printf("Average: %8.0f\n", total/count);

        in.close();
        out.close();
        console.close();
    }
}