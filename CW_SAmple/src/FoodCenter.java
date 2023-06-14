import java.util.*;

public class FoodCenter {
    private static final int MAX_STOCK = 50;

    private static Queue<String>[] cashiers;

    private static int burgersInStock;

    public static void main(String[] args) {
        initialize();
        displayMenu();
    }

    private static void initialize() {
        cashiers = new Queue[3];
        for (int i = 0; i < cashiers.length; i++) {
            cashiers[i] = new LinkedList<>();
        }

        burgersInStock = MAX_STOCK;
    }

    private static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("********************");
            System.out.println("* Foodies Fave Food Center *");
            System.out.println("********************");
            System.out.println("Menu:");
            System.out.println("100 or VFQ: View all Queues.");
            System.out.println("101 or VEQ: View all Empty Queues.");
            System.out.println("102 or ACQ: Add customer to a Queue.");
            System.out.println("103 or RCQ: Remove a customer from a Queue. (From a specific location)");
            System.out.println("104 or PCQ: Remove a served customer.");
            System.out.println("105 or VCS: View Customers Sorted in alphabetical order");
            System.out.println("106 or SPD: Store Program Data into file.");
            System.out.println("107 or LPD: Load Program Data from file.");
            System.out.println("108 or STK: View Remaining burgers Stock.");
            System.out.println("109 or AFS: Add burgers to Stock.");
            System.out.println("999 or EXT: Exit the Program.");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 100:
                    viewAllQueues();
                    break;
                case 101:
                    viewEmptyQueues();
                    break;
                case 102:
                    addCustomer();
                    break;
                case 103:
                    removeCustomer();
                    break;
                case 104:
                    removeServedCustomer();
                    break;
                case 105:
                    viewCustomersSorted();
                    break;
                case 106:
                    storeProgramData();
                    break;
                // case 107:
                //     loadProgramData();
                //     break;
                // case 108:
                //     viewRemainingStock();
                //     break;
                // case 109:
                //     addBurgersToStock();
                //     break;
                case 999:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        }

        scanner.close();
    }

    private static void viewAllQueues() {
        System.out.println("*****************");
        System.out.println("* Cashiers *");
        System.out.println("*****************");

        for (int i = 0; i < cashiers.length; i++) {
            Queue<String> queue = cashiers[i];
            System.out.println("Cashier " + (i + 1) + ":");

            int maxCustomers = getMaxCustomersForCashier(i);
            int occupiedCustomers = queue.size();

            for (int j = 0; j < maxCustomers; j++) {
                if (j < occupiedCustomers) {
                    System.out.println("O ");
                } else {
                    System.out.println("X ");
                }
            }
            System.out.println();
        }
    }

    private static int getMaxCustomersForCashier(int cashierIndex) {
        if (cashierIndex == 0) {
            return 2;
        } else if (cashierIndex == 1) {
            return 3;
        } else if (cashierIndex == 2) {
            return 5;
        }
        return 0;
    }

    private static void viewEmptyQueues() {
        System.out.println("Empty Queues:");

        for (int i = 0; i < cashiers.length; i++) {
            Queue<String> queue = cashiers[i];
            if (queue.isEmpty()) {
                System.out.println("Cashier " + (i + 1));
            }
        }
    }

    private static void addCustomer() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the customer: ");
        String name = scanner.nextLine();

        System.out.println("Select the cashier (1, 2, or 3): ");
        int cashierIndex = scanner.nextInt() - 1;

        Queue<String> queue = cashiers[cashierIndex];
        int maxCustomers = getMaxCustomersForCashier(cashierIndex);

        if (queue.size() >= maxCustomers) {
            System.out.println("Cannot add more customers to the selected cashier. Queue is full.");
        } else {
            queue.add(name);
            // updateStock(-5);

            if (burgersInStock <= 10) {
                System.out.println("Warning: Low stock! Remaining burgers: " + burgersInStock);
            }
        }
    }

    private static void removeCustomer() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select the cashier (1, 2, or 3): ");
        int cashierIndex = scanner.nextInt() - 1;

        Queue<String> queue = cashiers[cashierIndex];
        int occupiedCustomers = queue.size();

        if (occupiedCustomers == 0) {
            System.out.println("No customers in the selected cashier's queue.");
        } else {
            System.out.println("Enter the position of the customer to remove (1 to " + occupiedCustomers + "): ");
            int position = scanner.nextInt();

            if (position < 1 || position > occupiedCustomers) {
                System.out.println("Invalid position. Please try again.");
            } else {
                for (int i = 1; i < position; i++) {
                    queue.add(queue.remove());
                }
                String removedCustomer = queue.remove();
                System.out.println("Customer " + removedCustomer + " removed from the queue.");
            }
        }
    }

    private static void removeServedCustomer() {
        for (Queue<String> queue : cashiers) {
            if (!queue.isEmpty()) {
                String removedCustomer = queue.remove();
                System.out.println("Customer " + removedCustomer + " removed from the queue.");
                break;
            }
        }
    }

    private static void viewCustomersSorted() {
        List<String> allCustomers = new ArrayList<>();

        for (Queue<String> queue : cashiers) {
            allCustomers.addAll(queue);
        }

        Collections.sort(allCustomers);

        System.out.println("Customers Sorted in alphabetical order:");
        for (String customer : allCustomers) {
            System.out.println(customer);
        }
    }

    private static void storeProgramData() {
        // Implementation for storing program data into a file
        System.out.println("Storing program data...");
    }
}

