import java.lang.Math;
public class P2_2 {
    /*
     * Write a program that computes and displays the perimeter of a letter-size (8.5 × 11 inches) 
     * sheet of paper and the length of its diagonal.
     */

     public static void main(String[] args) {
        double width = 8.5;
        double height = 11;

        double perimeter = (width * 2) + (height * 2);
        double diagonal = Math.sqrt((Math.pow(width, 2) + (Math.pow(height, 2))));

        System.out.println("Perimeter = " + perimeter);
        System.out.printf("Diagonal = %.2f", diagonal);
     }
}
