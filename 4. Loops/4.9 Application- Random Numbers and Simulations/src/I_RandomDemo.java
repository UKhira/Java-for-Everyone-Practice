 /**
    This program prints ten random numbers between 0 and 1.
 */
public class I_RandomDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            double r = Math.random();
            System.out.println(r);

            /*
             * double java.lang.Math.random()
                Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0. Returned 
                values are chosen pseudorandomly with (approximately) uniform distribution from that range.
             */
        }
    }
}
