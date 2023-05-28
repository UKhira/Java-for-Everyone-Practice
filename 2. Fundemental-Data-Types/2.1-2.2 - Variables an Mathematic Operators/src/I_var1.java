public class I_var1 {

    /* get used with these when working in java:

    1. when name a variable make sure to name it easy to understand its purpose
    2. use camelcase in variable (ex:- variableOne)
    3. use Uppercase with underscore(if needed) in constants (ex:- CONSTANT_ONE) 
    
    P.S. - not doing above won't produce a syntax error, but following them will be helpful in advanced programming*/

    public static void main(String[] args)  {
        int cansPerPack = 6;                        // declare a variable and initialize a value
        System.out.println(cansPerPack);

        cansPerPack = 8;                            // alter the initial value and assign it to a new value
        System.out.println(cansPerPack);

        int cansPerCrate = cansPerPack * 4;         // now this take the last assigned value of variable
        System.out.println(cansPerCrate);

        final double BOTTLE_VOLUME = 4;              // by final keyword it makes a variable to constant, its value cannot be changed after that
        System.out.println(BOTTLE_VOLUME);

        // bottleVolume = 2;  <-  This will gives an error since the value is permenant now
        
        /*It is good programming style to use named constants in your program to explain the meanings of numeric values

        double totalVolume = bottles * 4;                                       normal way
        double totalVolume = bottles * BOTTLE_VOLUME;                           proper way
        
        A programmer reading the first statement may not understand the significance of the number 2. The second statement, with a named constant, makes the computation much clearer.
        */
    }
}
