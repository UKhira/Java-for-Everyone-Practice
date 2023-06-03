import java.util.Scanner;

public class self_check_12 {
    public static void main(String[] args) {
        Scanner xInput = new Scanner(System.in);

        System.out.println("Enter a value");
        int x = xInput.nextInt();

        int s;
        if (x < 0) {
            s = -1;
        }
        else if (x > 0) {
            s = 1;
        }
        else {
            s = 0;
        }
        System.out.println(s);
    }

}
