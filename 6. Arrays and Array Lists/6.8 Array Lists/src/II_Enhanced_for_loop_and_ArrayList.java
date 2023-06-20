import java.util.ArrayList;

public class II_Enhanced_for_loop_and_ArrayList {
    public static void main(String[] args) {
    ArrayList <String> names =  new ArrayList<String>();
    String [] array = {"Holmes", "John", "Peter", "James"};
   

    for (int i = 0; i < array.length; i++) {
        names.add(i, array[i]);
    }
    System.out.println(names);

    for (String elements : names) {
        System.out.println(elements);
    }

    // Array list that holds first ten square numbers
    ArrayList <Integer> square = new ArrayList<Integer>();

    for (int i = 1; i < 11; i++) {
        square.add(i*i);
    }
    System.out.println(square);
    }
}
