public class I_Ex1 {
    /*
     * Compute the square of a number 
     * @param number
     * @return square of given number
     */
    public static int method(int x) {
        int y = x * x;
        return y;
    }

    public static void main(String[] args) {
        int a = 4;

        System.out.println(method(a+1));
    }
}
