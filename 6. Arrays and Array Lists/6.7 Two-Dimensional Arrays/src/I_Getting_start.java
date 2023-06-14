public class I_Getting_start {
    public static void main(String[] args) {
        // final int COUNTRIES = 7 ;
        // final int MEDALS = 3;
            int[][] counts =
                {
                    { 1, 0, 1 },
                    { 1, 1, 0 },
                    { 0, 0, 1 },
                    { 1, 0, 0 },
                    { 0, 1, 1 },
                    { 0, 1, 1 },
                    { 1, 1, 0 }
                };
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%8d",counts[i][j]);
            }
            System.out.println();
        }
    

    }
}
