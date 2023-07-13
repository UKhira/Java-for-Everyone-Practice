public class Main {
    
    public static void main(String[] args) {
        
        Employee e1 = new Employee();

        // declaration :- Employee
        // object name :- e1
        // instantiation :- new 
        // constructor :- Employee()

        e1.age = 15;
        e1.name = "John";
        e1.ageFinder();

        // override
        e1.age = 25;
        e1.ageFinder();


        System.out.println(e1.Department);
    }
}
