import java.util.Scanner ;
import java.lang.Math;
public class p2_7 {

    /* 
     * Write a program that prompts the user for a radius and then prints

        The area and circumference of a circle with that radius
        The volume and surface area of a sphere with that radius
    */
    public static void main(String[] args) {
        final double PI = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius");
        double radius = input.nextDouble();
        
        double circumference = 2 * PI * radius;
        double area = PI * Math.pow(radius,2);
        double volume = (3 * PI * Math.pow(radius, 3) ) / 4;

        System.out.println("Circumference = " + circumference);
        System.out.println("Area = " + area);
        System.out.println("Volume of sphere = " + volume);
    }
}
