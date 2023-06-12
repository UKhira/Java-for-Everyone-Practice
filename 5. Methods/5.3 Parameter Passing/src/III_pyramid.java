import java.util.Scanner;

public class III_pyramid {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter height: ");
        double pyramidHeight = in.nextDouble();
        System.out.print("Enter side length: ");
        double length = in.nextDouble();

        System.out.printf("Pyramid Volume = %.2f", pyramidVolume(pyramidHeight,length));
    }
    
    /**
      Computes the volume of a pyramid whose base is a square.
      @param height the height of the pyramid
      @param baseLength the length of one side of the pyramid's base
      @return the volume of the pyramid
    */

     public static double pyramidVolume(double height, double baseLength){
        double baseArea = baseLength * baseLength;
        return height * baseArea / 3;
     }
}
