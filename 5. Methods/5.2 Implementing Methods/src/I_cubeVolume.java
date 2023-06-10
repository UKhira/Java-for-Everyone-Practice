/**
    This program computes the volumes of two cubes.
*/
import java.util.Scanner;

public class I_cubeVolume {
    
    public static double cubeVolume(double sideLength){
        double volume = sideLength * sideLength * sideLength;
        return volume;

        /**
         Computes the volume of a cube.
         @param sideLength the side length of the cube
         @return the volume
        */
    }

    public static void main(String[] args) {
        double result1 = cubeVolume(2);
        System.out.println("A cube with side length 2 has volume " + result1);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length ");
        double len = in.nextDouble();

        double result2 = cubeVolume(len);
        System.out.println("A cube with side length " + len + "  has volume " + result2);
    }
}
