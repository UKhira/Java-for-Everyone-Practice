public class varChechkk {
    public static void main(String[] args) {
        String name = new String("Udith Kavishka");     //create new object in String class

        System.out.println(name);

        // note String x = "something" != String x = new Sttring("something")

        String literalString1 = "abc";
        String literalString2 = "abc";

        String objectString1 = new String("xyz");
        String obejectString2= new String("xyz");

        System.out.println(literalString1 == literalString2);
        System.out.println(objectString1 == obejectString2);
    }
}
