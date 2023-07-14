public class Main {
    public static void main(String[] args) {
        // this objcect will call the non-parameterized constructor
        Employee e1 = new Employee();

        System.out.println(e1.department);
        System.out.println(e1.name);
        System.out.println(e1.age);

        // this objcect will call the parameterized constructor
        Employee e2 = new Employee("John", 30, "HR");

        System.out.println(e2.department);
        System.out.println(e2.name);
        System.out.println(e2.age);

        // this objcect will call the constructor overloading
        Employee e3 = new Employee("Peter", 32);
        System.out.println(e3.name);
        System.out.println(e3.age);
        System.out.println(e3.department);      // default value
    }
}
