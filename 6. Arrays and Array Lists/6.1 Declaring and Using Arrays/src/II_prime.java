import java.util.Scanner;

public class II_prime {
    public static void main(String[] args) {
    int [] prime = {1, 3, 5, 7, 11};

    for (int i = 0; i < 2; i++) {
        prime[4-i] = prime[i];
        System.out.println(prime[i]);           // 1        3
    }
    System.out.println();

    for(int i = 0; i < 5; i++) {
        prime[i]++;                 // => prime[i] = prime[i] + 1
        /* this adds 1 to the value of i (not to the index)
            ex:- i = 0; prime[i] = prime[0] = 1 
                so prime[1] + 1 = 1 + 1 = 2
            
                note : prime[i++] != prime{i}++
                        prime[i+1] != prime[i] + 1
                        prime[0+1] != prime[0] + 1
                        prime[1] != prime [0] + 1
                        3       !=      1 + 1
                        3       !=      2 
        */
        System.out.println(prime[i]);
    }

    int [] values = new int[10];
    Scanner in = new Scanner(System.in);

    for (int i = 0; i < values.length; i++) {
        System.out.print("Enter an integer: ");
        values[i] = in.nextInt();
    }

    for (int i = 0; i < values.length; i++) {
        System.out.print(" " + values[i]);
    }
}
}