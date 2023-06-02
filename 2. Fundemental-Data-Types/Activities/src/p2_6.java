import java.util.Scanner;
public class p2_6 {
    public static void main(String[] args) {
        Scanner measurement = new Scanner(System.in);

        System.out.println("Enter measurement in meters");
        double measure = measurement.nextDouble();

        final double METERS_PER_MILE = 1609.344;
        final double INCHES_PER_METER = 39.3700787;
        final double FEETS_PER_METER = 3.2808399;

        System.out.println("Inches : " + measure * INCHES_PER_METER);
        System.out.println("Feets : " + measure * FEETS_PER_METER);
        System.out.println("Miles : " + measure / METERS_PER_MILE);
    }
}
