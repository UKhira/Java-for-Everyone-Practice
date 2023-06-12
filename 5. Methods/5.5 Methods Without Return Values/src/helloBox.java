import java.util.Scanner; 

public class helloBox {
    /**
     * print a word inside a box
     * @param content
     * @return none
     */

    public static void boxString(String content,String symbolEnter) {          
        int n = content.length();
        printLine(n,symbolEnter);
        System.out.println();
        System.out.print("!" + content + "!");
        System.out.println();
        printLine(n,symbolEnter);
    }
    // This method won't return anything. so we used "void keyword"
    // Note: there is no data type before method name, cuz it returns none.

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter something: ");
        String text = in.next();
        System.out.print("Enter a symbol that you want to cover it around: ");
        String symbol = in.next();
        boxString(text,symbol);
    }

    public static void printLine(int contentLength,String symbol){;
        for (int i = 0; i < contentLength+2; i++) {
            System.out.print(symbol);
        }
    }
}
