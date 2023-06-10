public class II_AvgOftwoNum {
    /*
     * Computes the average of two numbers
     * @param a,b two integer numbers
     * @return the average
     */
    public  static double mystery (int a, int b) {
        double z = a + b;
        z  = z / 2;
        return z;
    }

    public static void main(String[] args) {
        int a = 23;
        int b = 34;

        System.out.println(mystery(a, b));
    }
}
