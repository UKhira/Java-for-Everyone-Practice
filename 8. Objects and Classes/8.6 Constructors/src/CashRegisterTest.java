/**
 * This program tests the cash register class
*/
public class CashRegisterTest {
   public static void main(String[] args) {
    CashRegister register1 = new CashRegister();
    register1.addItem(1.95, true);
    register1.addItem(0.95, true);
    register1.addItem(2.50, false);

    System.out.println(register1.getCount());
    System.out.println("Expected: 3");
    System.out.printf("%.2f%n", register1.getTotal());
    System.out.println("Expected: 5.40");       //Before tax
   }
}
