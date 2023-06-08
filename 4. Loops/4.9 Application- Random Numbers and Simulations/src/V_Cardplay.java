// simulate the picking of a random playing card

import java.lang.Math;
import java.util.Scanner;

public class V_Cardplay {
    public static void main(String[] args) {

        String highres;
        String keios;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many times you want to play");

        int turns = input.nextInt();
        for (int pick = 1; pick <= turns; pick++) {
            System.out.printf("Pick %d : " ,pick);
            
            int type = (int) (Math.random() * 4) + 1;
            int number = (int) (Math.random() * 13) + 1;

            if (number == 11) {
                highres = "Jack";
            }
            else if (number == 12) {
                highres = "Queen";
            }
            else if (number == 13) {
                highres = "King";
            }
            else {
                highres = Integer.toString(number);
            }

            if (type == 1) {
                keios = "Spades";
            }
            else if (type == 2) {
                keios = "Clubs";
            }
            else if (type == 3) {
                keios = "Diamonds";
            }
            else {
                keios = "Hearts";
            }

            System.out.printf("%5s of %s %n" ,highres , keios);
        }
    }
}
