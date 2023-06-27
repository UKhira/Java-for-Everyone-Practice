public class Person {
    private String name;

    public Person(String firstName, String lastName){
        name = firstName + " " + lastName;
    }

    public static void main(String[] args) {
        
        Person harry = new Person("Harry", "Potter");
        System.out.println(harry.name);
    }
}
