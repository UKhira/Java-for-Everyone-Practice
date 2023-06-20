import java.util.ArrayList;

public class I_declaring_ArrayList {
    public static void main(String[] args) {    
        // Initialize an Array List
        ArrayList<String> names = new ArrayList<String>();

        names.add("Harry");         // now names has size 1 and element "Harry"
        names.add("Emily");         // now names has size 2 and elemenet "Harry" and "Emily" 
        names.add("Bob");           // now names has size 3 and elements "Harry", "Emily" and "Bob"
        names.add("Cindy");         // now names has size 4 and elements "Harry", "Emily", "Bob" and "Cindy"
        
        String nameAtIndex2 = names.get(2);     // Retrives the element at index 2
        System.out.println(nameAtIndex2);

        // to access last element
        int last = names.size();
        String nameAtLast = names.get(last - 1);        // if array size is 4 then last eleemt index is 3 (4 -1)
        System.out.println(nameAtLast); 

        // To set an array list element to a new value, use the set method.
        names.set(2, "Emilico");
        System.out.println(names.get(2));               // now it's not Bob, but Emilico
        
        /*
          * This call sets position 2 of the names array list to "Emilico", overwriting whatever value was there before.

          *  The set method overwrites existing values. It is different from the add method, which adds a new element to the array list.
        */

        System.out.println(names.size());         // the size of list hasn't changed, which mean it overwrite the current value   
    
        // but add method won't overwrite, it will insert a new value and moves all elements with given index or larger by one position.

        names.add(1, "John");          // Insert "John" to index 2, do not overwrite current element at index 2, it will move to 3 and so on
        System.out.println(names.size());           // Size now is 5
    
        // With an array list, it is very easy to get a quick printout. Simply pass the array list to the println method:
        System.out.println(names);

        // remove an element
        names.remove(3);                // Remove the element at index 3
        System.out.println(names);
    }
}
