import java.util.ArrayList;

public class III_Copying_arayList {
    public static void main(String[] args) {
        ArrayList <String> queueOne = new ArrayList <String> ();
        ArrayList <String> queueTwo = new ArrayList <String> ();
        ArrayList <String> queueThree = new ArrayList <String> ();

        for (int i = 0; i < 2; i++) {
            queueOne.add("X");
        }
        for (int i = 0; i < 6; i++) {
            queueTwo.add("X");
        }
        for (int i = 0; i < 3; i++) {
            queueThree.add("X");
        }

        // System.out.print(queueOne + "   " + queueTwo + "    " + queueThree );
        for(String eleemt: queueOne) {
        //    System.out.print(eleemt+" ");
           for(String elenemt: queueTwo) {
            // System.out.printf("%4s %4s  %n", eleemt,elenemt);
        }
         
        }

    }
}
