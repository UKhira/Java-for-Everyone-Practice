public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();   // when object is created, default constructor is called
        Employee e2 = new Employee();   // so we can see the sout line in there

        // since main method is static, it calls the department value in static block, not the one in class
        e1.name = "John";
        e1.age = 30;

        e2.name = "Potter";
        e2.age = 22;    

        e1.show();
        e2.show();
    }
}
