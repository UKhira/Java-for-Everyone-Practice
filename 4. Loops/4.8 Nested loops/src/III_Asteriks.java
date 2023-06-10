public class III_Asteriks {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i ++) {
            for (int x = 1; x <= i; x++)
            System.out.printf("%2s","*");
            System.out.println();
        }
        System.out.println("\n");

        for (int i = 5; i <= 1; i--) {
            for  (int x = 1; x <= i; x--) {
                System.out.printf("%2s","*");
            }
            System.out.println();
        }
        System.out.println("\n");

        // for   (int i = 1; i <= 5; i ++) {
        //     for (int x = 5; x >= i; )
        // }
    }
}
