import java.util.Scanner;;
public class II_concatanation {
    public static void main(String[] args) {
        String firstName = "Harry";
        String lastname = "Morgan";

        System.out.println(firstName + " " + lastname);

        /*
         * When the expression to the left or the right of a + operator is a string, 
         * the other one is automatically forced to become a string as well, and both strings 
         * are concatenated.
         */

         String jobTitle = "Agent";
         int id = 47;

         System.out.println(jobTitle + id);


         System.out.println("Enter your name");
         Scanner nameIn = new Scanner (System.in);
        String name = nameIn.next();        // * This next() method will only read a string containing a single word.
        System.out.println(name);
        /* 
         * Suppose we add "Harry Morgan" as input, since next() will only read one word, the output will be
         * "Harry" (not "Harry Morgan") 
         * to read second word we have to use another nameIn.next()
         */
        
         name = nameIn.next();
         System.out.println(name);
         // *This will print the "Potter" word 

         //* to add them in same line we can 
         System.out.println("Enter Name");
         String name2 = nameIn.next();
         System.out.print(name2);
         name2 = nameIn.next();
         System.out.println(" " + name2);

         // *To include a quotation mark in a literal string, precede it with a backslash (\), like this:
         //* suppose we need to add a quote, saying if we use just "" in string it will show an error*/
       
         System.out.println("He said \"Hello\"");       // output = He said "Hello"

         String quote = "\"Hello There\"";        
         System.out.println("Obi Wan said " + quote) ;      // output = Obi Wan said "Hello There"

         /*
          ? The backslash is not included in the string. It indicates that the quotation mark 
          ? that follows should be a part of the string and not mark the end of the string. 
          ? The sequence \" is called an escape sequence.
          */

          // ?To include a backslash in a string, use the escape sequence \\, like this:

          System.out.println("C:\\UKhira\\Documents\\Github\\Java-for-Everyone");  // output = C:\UKhira\Documents\Github\Java-for-Everyone

          String path = "C\\Users\\UKhira\\Documents\\Github\\Java-for-Everyone-Practice\\2.Fundemental-Data-Types\\2.5 Strings\\src\\II_concatanation.java";
          System.out.println("The local path for this file is " + path); 
          // ? output = The local path for this file is C\Users\UKhira\Documents\Github\Java-for-Everyone-Practice\2.Fundemental-Data-Types\2.5 Strings\src\II_concatanation.java


          // new line escape

          System.out.println("* \n ** \n ***");
        }   
}
