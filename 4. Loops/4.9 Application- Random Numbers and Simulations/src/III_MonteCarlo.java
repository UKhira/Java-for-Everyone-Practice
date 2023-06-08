/**
    This program computes an estimate of pi by simulating dart throws onto a square.
 */
public class III_MonteCarlo{
    public static void main(String[] args) {

        final int TRIES = 10000;

        int hits = 0;
        for (int i = 1; i <= TRIES; i++); {
            // Generate two random number between 1 and -1
            
            double r = Math.random();
            double x = -1 + 2 * r;      // Between 1 and -1 (for x-max, x-min)
            
            r = Math.random();
            double y = -1 + 2 * r;      // for y-min, y-max
            
            // Check whether thr point lies in the unit circle

            if (x * x + y * y <= 1) {
                hits++;
            }

            /*
               The ratio hits / tries is approximately the same as the ratio
               circle area / square area = pi / 4
            */

            double piEstimate = 4.0 * hits / TRIES;
            System.out.println("Estimate for pi: "+ piEstimate);
        }
    }

    /*
     * Simulate shooting a dart into a square surrounding a circle of radius 1. That is easy: generate random x and y coordinates between −1 and 1.

        If the generated point lies inside the circle, we count it as a hit. That is the case when x2 + y2 ≤ 1. Because our shots are 
        entirely random, we expect that the ratio of hits/tries is approximately equal to the ratio of the areas of the circle and the square, that is, π/4. Therefore, our estimate for π is 4 × hits/tries. This method yields an estimate for π, using nothing but simple arithmetic.

        Imagine the centre of circle lies at (0,0) point and as radius 1. the maximum for x axis is +1 and minimum is -1, so does for the y.
        x-min = -1, x-max = 1, y-min = -1, y-max = 1

        to generate a random floating-point value between −1 and 1, you compute:
?       double r = Math.random();// 0 ≤ r <1
?           double x = -1 + 2 * r; // −1 ≤ x < 1

   As r ranges from 0 (inclusive) to 1 (exclusive), x ranges from −1 + 2 x 0 = −1 (inclusive) to −1 + 2 × 1 = 1 (exclusive). In our application, it does not matter that x never reaches 1. The points that fulfill the equation x = 1 lie on a line with area 0.
*/
}