public class III_String_equals_method_clarification {
    // *Let's solve that == method matter with string
    public static void main(String[] args) {
        String name = "Robert";
        
        String str = name.substring(0, 3);

        if (str == "Rob") {
            System.out.println("This \"==\" method is accurate for string");
        }
        else {
            System.out.println("No, this is not");
        }

        if (str.equals("Rob")) {
            System.out.println("This \"equals()\" method is the accurate one");
        }
        else{
            System.out.println("No this is not working");
        }

        /* now you will see 
        ! In this case, the substring method produces a string in a different memory location. 
        ! Even though both strings have the same contents, the comparison fails.
        */
    }
}
