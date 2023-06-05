import java.util.Scanner;

public class I_simpleProg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int value;
        do {
            System.out.print("Enter a number betweem 0 - 100 : ");
            value = in.nextInt();
        }
        while (value < 100 && value > 0);

    
        // Let's write same loop using while

        int value2 = 1; 
        while (value2 < 100 && value2 > 0) {
            System.out.print("(Check 02) Enter a number betweem 0 - 100 : ");
            value2 = in.nextInt();
        }
    }
}
