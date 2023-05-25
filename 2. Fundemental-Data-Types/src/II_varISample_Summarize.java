/**
This program computes the volume (in liters) of a six-pack of soda
cans and the total volume of a six-pack and a two-liter bottle.
*/
public class II_varISample_Summarize {
 public static void main(String[] args) {
    int cansPerPack = 6;
    final double CAN_VOLUME = 0.355;        // Liters in 12-ounce can
    double totalVolume = CAN_VOLUME * cansPerPack;

    System.out.print("A six pack of 12 oucne can contains ");
    System.out.print(totalVolume);
    System.out.println(" liters");

    final double BOTTLE_VOLUME = 2;         // 2 liter bottle

    totalVolume = totalVolume + BOTTLE_VOLUME;
    
    System.out.print("A six pack of two liter bottle contains ");
    System.out.print(totalVolume);
    System.out.println(" liters");   
 }
}
