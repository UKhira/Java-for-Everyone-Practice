import java.util.Scanner;
/*
 * This is a program to calculate how to organize tiles in given conditions
 * 
 * 1. Tiles must be arranged as blck, white, black, white,... , black
 * 2. As mentioned in above pattern, Starting tile and Ending tile both should be black
 * 3. If there are additional spaces available they must be divided equally at both enda (ex: if there are additional 10m then it must be divided as 5m at the start of tile pattern and 5 meters at the end of tile pattern)
 */
public class V_tileQuiz {
    public static void main(String[] args) {
        final int FOR_ODD_EVEN_VERIFICATION = 2;           // *This is to check whether the tile amount we can organize is odd or even
        final int FOR_DIVIDE_ADDITIONAL_WIDTH_BETWEEN_START_AND_END_TILES = 2;
        /*
         * If Pattern has odd number of tiles then final tile is always black 
         * Unless, If it's evem the final tile is white, so to make final value black we have to remove that white tile and leave the black tile before it
         * This process will understand in upcoming calculations 
         */

        Scanner tileInputs = new Scanner (System.in);

        System.out.println("Enter the width of area: ");
        double areaWidth = tileInputs.nextDouble();

        System.out.println("Enter the width of a tile: ");
        double tileWidth = tileInputs.nextDouble();

                
        double maximumTiles = areaWidth / tileWidth;  
        int absoluteMaxTiles = (int) maximumTiles;           // *to convert max tiles count to an absolute number
        System.out.println(absoluteMaxTiles);       

        if (absoluteMaxTiles % FOR_ODD_EVEN_VERIFICATION == 0){
            absoluteMaxTiles -= 1;                // *If width is even then we have to remove final tile to leave the black at the end
        }
        
        double maxTileArea = areaWidth - (absoluteMaxTiles * tileWidth);
        double leftSpace = maxTileArea / FOR_DIVIDE_ADDITIONAL_WIDTH_BETWEEN_START_AND_END_TILES; 
        
        System.out.println("You can Organize " + tileWidth + " width of " + absoluteMaxTiles + " tiles in " + areaWidth + " width area");

        if (leftSpace == 0) {
            System.out.println("No additional space remaining");
        }
        else {
            // System.out.printf("%.2f%n", 5.1473);
            System.out.printf(" And the remain space will be divide as %.2f from start and %.2f at end", leftSpace, leftSpace);
        }
    }        
}
