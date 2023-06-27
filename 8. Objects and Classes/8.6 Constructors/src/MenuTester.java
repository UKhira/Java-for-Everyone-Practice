public class MenuTester {
    public static void main(String[] args) {
        Menu mainMenu = new Menu();

        mainMenu.addOption("Open New Account");
        mainMenu.addOption("Log into exisiing account");
        mainMenu.addOption("Help");
        mainMenu.addOption("Quit");

        int input = mainMenu.getInput();
        System.out.println("Input: " + input);
    }
}
