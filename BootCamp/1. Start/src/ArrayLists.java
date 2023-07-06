import java.util.ArrayList;
import java.util.Comparator;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(5);     //0
        numbers.add(2);     //1
        numbers.add(4);     //2
        numbers.add(1);     //3
        numbers.add(3);     //4

        numbers.forEach(number -> {
            System.out.println(number * 2);
        });
        System.out.println(numbers.toString());

        /**
         * This will get the elements in numbers arraylist one by one using their indexes and multiply each
         * of them by 2 p.s.(this overwrite the numbers arraylist for new one)
         */
        numbers.forEach(number ->{
            numbers.set(numbers.indexOf(number), number * 2);
            System.out.println(number);
        });

        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers.toString());

        numbers.sort(Comparator.reverseOrder());
        System.out.println(numbers.toString());

        System.out.println(numbers.size());
    }
}
