import java.util.Scanner;
import java.lang.Math;

public class VII_Bittle_Volume_Quiz {
    public static void main(String[] args) {
        final double PI = 3.14;

        Scanner input = new Scanner (System.in);

        System.out.println("Enter the Radius of bottom: ");
        double radius_bottom = input.nextDouble();

        System.out.println("Enter the radius of top (The radius of bottle cap): ");
        double radius_top = input.nextDouble();

        System.out.println("Enter the hight of cone Part: ");
        double cone_height = input.nextDouble();

        double volumeOfBottomCylinderPart = PI * (Math.pow(radius_bottom, 2));
        double volumeOfConePart = PI * ((Math.pow(radius_top, 2)) + (radius_top * radius_bottom) + (Math.pow(radius_bottom, 2))) * cone_height / 3;
        double volumeOfTopCylinderPart = PI * (Math.pow(radius_top, 2));

        double volumeOfBottle = volumeOfBottomCylinderPart + volumeOfConePart + volumeOfTopCylinderPart;

        System.out.printf("Volume of Bottle = %.2f", volumeOfBottle);
    }
}
