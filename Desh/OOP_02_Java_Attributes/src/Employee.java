public class Employee {
    
    // instance variables
    String name;
    int age;
    final String Department = "Maintenance";        // cannot override -> "final"

    public void ageFinder() {

        // local variables
        String a = "Adult";
        String c = "Child";

        if (age >= 18) {
            System.out.println(a);
        } else {
            System.out.println(c);
        }
    }

}
