public class Employee {
    String name;
    int age;
    static String department = "IT";    // this is a static variable, so it is shared by all objects

    static{     // class load 
        System.out.println("In static block");
        department = "HR";
    }
    public Employee() { // default constructor
        System.out.println("In constructor");
    }

    public void show(){
        System.out.println("Name: " + name + "\nAge: " + age + "\nDepartment: " + department);
    }
}
