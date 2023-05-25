import javax.swing.JOptionPane;

public class III_DialogViewer2 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name");
        System.out.println("Hello "+ name);
         //This code will run and open a input Dialog box and by that print the user input
         
        JOptionPane.showMessageDialog(null, "My Name is "+name+"\n What would you like me to do");
       
    }
}
