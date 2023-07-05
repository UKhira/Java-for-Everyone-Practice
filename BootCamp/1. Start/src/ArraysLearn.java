import java.util.Arrays;

public class ArraysLearn{
    public static void main(String[] args) {
        char [] vowels = {'a', 'e', 'i', 'o', 'u'};

        System.out.println(Arrays.toString(vowels));


        char [] vowels2 = {'e', 'o', 'i', 'a', 'u'};

        Arrays.sort(vowels2);
        System.out.println(Arrays.toString(vowels2));

        char [] vowels3 = {'e', 'o', 'u', 'a', 'i'};

        int startIndex = 1;
        int endIndex = 4;

        Arrays.sort(vowels3, startIndex, endIndex);
        System.out.println(Arrays.toString(vowels3));

        char key = 'o';
        int foundItemIndex = Arrays.binarySearch(vowels3, key);
        System.out.println(foundItemIndex);
    }
}