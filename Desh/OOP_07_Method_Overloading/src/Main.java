public class Main {
    public static void main(String [] args){
        Calculator c1 = new Calculator();

        c1.add(4, 7);   // will call first method

        c1.add(8.3, 9.4);   // will call second method

        c1.add(4, 7, 9);    // will call third method   
    }
}
