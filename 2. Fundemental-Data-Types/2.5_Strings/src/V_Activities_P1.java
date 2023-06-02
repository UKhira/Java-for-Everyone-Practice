import javax.swing.JOptionPane;


public class V_Activities_P1 {
    public static void main(String[] args) {
        
        String str = "Java Program";
        System.out.println(str.substring(8));

        String rest = "ming";
        System.out.println(str + rest);

        // Additional

        // Dialog box

        String input = JOptionPane.showInputDialog("Enter Price");
        /*
            * This will take price value as a string
            * Suppose we need to convert it into number since price are 0.00 format, it suits double
        */
        double price = Double.parseDouble(input);

        // Let's display output in a dialog box

        JOptionPane.showMessageDialog(null, "Price :" +  price);

    }
}
