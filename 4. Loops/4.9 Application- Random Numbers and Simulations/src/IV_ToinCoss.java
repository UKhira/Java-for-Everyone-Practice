/*
 * simulate a coin toss
 */

import java.util.Scanner;

public class IV_ToinCoss {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // boolean contd = true;
        boolean contd = true;

        System.out.println("Let's toss a coin /nEnter \"toss\" to toss \nEnter \"stop\" to stop");

        while (contd) {
            String toss_res = in.next();
            if (toss_res.toLowerCase().equals("toss")) {
                int toss = (int) (Math.random() * 2) + 1;
                System.out.println(toss);
                if (toss == 1) {
                    System.out.println("Head");
                }
                else {
                    System.out.println("Tail");
                }
            }
            else {
                System.out.println("GG");
                contd = false;
            }
        }
    }
}
