/**
 * This program will simulate the process of student data collection
 */
public class Student {
    String name;
    long id;

    /**
     * Construct a student with name as null and id as zero
     */
    public Student(){
        name = null;
        id = 0;
    }

    /**
     * Get the first,middle and last names of student
     * @param firstName
     * @param middleName
     * @param lastName
     */
    public void addName(String firstName, String middleName, String lastName){
        String initialOne = firstName.substring(0,1);
        String initialTwo = middleName.substring(0,1);
        this.name = initialOne + "." + initialTwo + "." + " " + lastName;
    }

    /**
     * Get student id
     * @param idNum
     */
    public void id(long idNum){
        if(idNum >= 10000000){
            this.id = idNum;
        }
    }

    /**
     * Get the full name
     * @return name
     */
    public String fullName(){
        return name;
    }

    /**
     * Get id number
     * @return id
     */
    public long idDisplay (){
        return id;
    }

    public static void main(String[] args) {
        Student std1 = new Student();
        std1.addName("Harry", "James","Potter");
        std1.id(1992301782);

        System.out.println(std1.fullName());
        System.out.print(std1.idDisplay());
    }
}
