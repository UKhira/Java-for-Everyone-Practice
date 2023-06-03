import java.util.Scanner;

public class I_Richter_Scale {
    /*
     * consider a program that displays the effect of an earthquake, as measured by the Richter scale 
     */
    public static void main(String[] args) {
        Scanner measure = new Scanner(System.in);
        
        System.out.println("Enter Richter Scale");
        double richter = measure.nextDouble();

        String expect;
        if (richter >= 8.0) {
            expect = "Most structure fall";
        }
        else if (richter >= 7.0) {
            expect = "Many building destroyed";
        }
        else if (richter >= 6.0) {
            expect = "Many buildings considerably damaged, some collapse";
        }
        else if (richter >= 4.5) {
            expect = "Damage to poorly constructed buildings";
        }
        else {
            expect = "No destruction of buildings";
        }
        System.out.println(expect);
    }
}
