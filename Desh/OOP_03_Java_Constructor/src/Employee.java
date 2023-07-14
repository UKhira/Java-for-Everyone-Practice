public class Employee {
    String name;
    int age;
    String department;

    // parameterized constructor
    public Employee(String name, int age, String department){
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // default constructor (non-parameterized constructor)
    public Employee(){
        this.name = "Employee";
        this.age = 20;
        this.department = "IT";
    }

    // constructor overloading
    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }
}
