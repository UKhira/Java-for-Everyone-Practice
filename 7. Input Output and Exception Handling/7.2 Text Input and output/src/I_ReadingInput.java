import java.util.Scanner;

public class I_ReadingInput {
    public static void main(String[] args) {
        
        // run the program and write a sentence
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String input = in.next();
            System.out.println(input);
        }
        in.close();

        // This prgram will read a word by word (blank spaces)
    }
}
