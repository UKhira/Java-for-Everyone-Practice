import java.sql.Array;
import java.util.Arrays;

public class IV_elementSeperator {
    public static void main(String[] args) {
        String [] word = {"H", "E", "L", "L", "O"};

        String commaSeperatedArray = " ";
        for (int i = 0; i < word.length; i++) {
            if(i > 0) {
                System.out.print(" | ");
            }
            System.out.print(word[i]);
            commaSeperatedArray = Arrays.toString(word); 
        }
        System.out.println("\n" + commaSeperatedArray);
    }
}
