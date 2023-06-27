import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class II_Catching_Exceptions {
    public static void main(String[] args) {
        try
        {
            String filename = "File";
            Scanner in = new Scanner(new File(filename));
            String input = in.next();
            int value = Integer.parseInt(input);
        }
        catch (IOException exception)
        {
            exception.printStackTrace();
        }
        catch (NumberFormatException exception)
        {
            System.out.println(exception.getMessage());
        }
    }
}
