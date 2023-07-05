public class Strings {

    static String nonInitializedString;
    static int nonInitializedInteger;
    static char nonInitializedChar;
    public static void main(String[] args) {
        System.out.println(nonInitializedInteger);      //default value for int = 0
        System.out.println(nonInitializedString);       //default value for String = null
        System.out.println(nonInitializedChar);

        String name = "Udith Kavishka"; //%s
        String country = "Sri Lanka";
        int age = 21;      //%d
        String university = "IIT";
        double gpa = 3.8;   //%f
        char percrntageMark = '%';  //%c
        boolean amItellingTheTruth = true;      //%b

        String formatteString = String.format("My name is %s. I am from %s. I am %d years old. I study at %s. My GPA is %.1f. I have attended 100%c of my university classes. These are all %b claims",
        name, country, age, university ,gpa, percrntageMark, amItellingTheTruth);

        System.out.println(formatteString);

        System.out.println(formatteString.length());

        String emptyString = "";
        String blankString = " ";

        System.out.println(emptyString.isEmpty());      //true
        System.out.println(blankString.isEmpty());      //false, becuase it contains <space>

        System.out.println(emptyString.isBlank());      //true
        System.out.println(blankString.isBlank());      //true
    
        String string = "Sky is blue";
        System.out.println(string.replace("blue", "red"));
        System.out.println(string.contains("is"));

    }
}
