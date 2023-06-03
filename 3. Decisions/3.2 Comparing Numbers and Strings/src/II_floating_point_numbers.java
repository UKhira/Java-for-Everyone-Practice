public class II_floating_point_numbers {
    /*
     ! Floating-point numbers have only a limited precision, and calculations can introduce roundoff 
     ! errors. You must take these inevitable roundoffs into account when comparing floatingpoint 
     ! numbers. 
     */
    public static void main(String[] args) {
        double r = Math.sqrt(2.0);
        if (r * r == 2.0) {
            System.out.println("Math.sqrt(2.0) squared is 2.0");
        }
        else {
            System.out.println("Math.sqrt(2.0) squared is not 2.0 but " + r * r);
        }
        System.out.println(r * r);
        System.out.println(Math.pow(r, 2));

        /*
         ! It does not make sense in most circumstances to compare floating-point numbers exactly. 
         ! Instead, we should test whether they are close enough. That is, the magnitude of their 
         ! difference should be less than some threshold. Mathematically, we would write that x and y 
         ! are close enough if ;
         ! |x-y| < ε
          
         ! for a very small number, ε. ε is the Greek letter epsilon, a letter used to denote a 
         ! very small quantity. It is common to set ε to 10^(−14) when comparing double numbers:
         */

         final double EPSILON = 1E-14;
        double r2 = Math.sqrt(2.0);
        if (Math.abs(r2 * r2 - 2.0) < EPSILON)
        {
        System.out.println("Math.sqrt(2.0) squared is approximately 2.0");
        }

    }
}
