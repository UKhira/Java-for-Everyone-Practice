import java.util.logging.Level;
import java.util.logging.Logger;

public class II_Modify_ENUM {

    // Using "enum" method to check with many options
    public enum MARTIAL_STATUS_FILLERS {SINGLE, MARRIED, MARRIED_FILLING_SEPERATELY}
    public static void main(String[] args) {
        /* 
            *  This logger method can use to test a program, that whether we get expected results or not
            *  instead "System.out.println()" we can use this method in test cases
        */
        Logger.getGlobal().setLevel(Level.OFF);                 // try commenting/removing this line and understand how this functinality works
        MARTIAL_STATUS_FILLERS martialStatus = MARTIAL_STATUS_FILLERS.MARRIED;
        
        switch(martialStatus) {
            case MARRIED :
            System.out.println("You are married");
            Logger.getGlobal().info("You are Married");
            /*
                *  By default, the message is printed. But if you call
                *  Logger.getGlobal().setLevel(Level.OFF);
                *  Logging messages can be deactivated when testing is complete.
            */

            case SINGLE:
            System.out.println("You are single");
            break;

            case MARRIED_FILLING_SEPERATELY:
            System.out.println("You are married but living seperately");
            break;

            default:
            System.out.println("Nani?");
            break;
        }
    }
}
