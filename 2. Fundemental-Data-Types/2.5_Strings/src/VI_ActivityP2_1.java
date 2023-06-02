import java.util.Scanner;;
import java.lang.Math;
public class VI_ActivityP2_1 {
    public static void main(String[] args) {
        final double MILIMETERS_PER_INCH = 25.4;

        double widthOfLetterSheet = 8.5;
        double heightOfLetterSheet = 11;

        System.out.printf("%.2f" , widthOfLetterSheet * MILIMETERS_PER_INCH , heightOfLetterSheet * MILIMETERS_PER_INCH);
    }
}
