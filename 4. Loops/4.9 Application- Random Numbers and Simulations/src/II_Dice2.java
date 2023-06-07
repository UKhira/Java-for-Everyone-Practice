public class II_Dice2 {
    /**
      This program simulates tosses of a pair of dice.
     */

     public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int d1 = (int) (Math.random() * 6) + 1;
            int d2 = (int) (Math.random() * 6) + 1;
            System.out.println(d1 + " " + d2);
        }
        System.out.println();
        for (int i = 1; i <=5; i++) {
            int random = (int) (Math.random() * (5 - 3) + 1) * 3;
            System.out.println(random);
        }
     }

    /*
        * Here is the general recipe for computing random integers between two bounds a and b. 
        * there are b - a + 1 values between a and b, including the bounds themselves. First compute

        (int) (Math.random() * (b - a + 1))


      * to obtain a random integer between 0 and b - a, then add a, yielding a random value between a and b:

        int r = (int) (Math.random() * (b - a + 1)) + a;
        Here is a program that simulates the throw of a pair of dice:
    */
}

