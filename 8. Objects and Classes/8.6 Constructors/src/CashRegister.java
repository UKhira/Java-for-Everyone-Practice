/**
 * A Simulated cash register that tracks item count and the total amount due
*/
public class CashRegister {
    private int itemCount;
    private double totalPrice;
    private final double TAX_AMOUNT;

    /**
     * Construct a cash register with cleared item count and total
    */
    public CashRegister(){
        itemCount = 0;
        totalPrice = 0;
        TAX_AMOUNT = 7.5;
    }

    /**
     * Adds an item to this cash register
     * @param price - the price of this item
    */
    public void addItem(double price, boolean taxable){
        itemCount++;
        totalPrice += price;
        tax(price,taxable);
    }

    /**
     * Gets the price of all items in the current sale
     * @return the total amount
    */
    public double getTotal(){
        return totalPrice;
    }

    /**
     * Get the number of item in current sale
     * @return item count
    */
    public int getCount(){
        return itemCount;
    }

    /**
     * Clears the item count and total
    */
    public void clear(){
        itemCount = 0;
        totalPrice = 0;
    }

    /**
     * Add Tax(If available)
     */
    public void tax(double price, boolean taxable){
        if(taxable){
            totalPrice = price + price * TAX_AMOUNT;
        }
    }

}
