public class IV_Cast {
    public static void main(String[] args) {
        double total = 890.23;
        double tax = 100.23;

        double balance = total + tax;
        int dollars = (int) balance;            // *This will convert balance(double) to balance(int)
                                                // *It will discard the fractional point in it
        System.out.println(dollars);

        //? if we have to use this method alongside with an arithmatic expression, without assigning integer value to another variable, we can

        int dollars2 = (int) (total+tax);
        System.out.println(dollars2);

        // ?Imagine we need to convert a large floating point number. using the cast integer is not work here, since integer cannot store a large value. so we havr to use round method
        long Round = Math.round(balance);
        System.out.println(Round);
        // !we need to use this method only unless result cannote be save to int, or else we can use casting (int) methiod

        
    }
}
