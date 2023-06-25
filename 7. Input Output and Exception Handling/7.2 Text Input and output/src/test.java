import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = 0;
        if(in.hasNextInt()) {
            number = in.nextInt();
        }
        String output = in.next();
        System.out.println(number);
        System.out.println(output);

        in.close();
    }
}