public class I_Multipication_table {
    public static void main(String[] args) {
        int answer;
        System.out.print("x");
        for (int multi = 1; multi < 13; multi++) {
            System.out.printf("%5d", multi);
        }
        System.out.println("\n");

        for (int multi = 1; multi < 13; multi++) {
            System.out.printf("%d", multi);
            for (int num = 1; num < 13; num++) {
                answer = multi * num;
                System.out.printf("%5d", answer);
            }
            System.out.println("\n");
        }
    }
}
