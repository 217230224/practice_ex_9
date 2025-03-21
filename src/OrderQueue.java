import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class OrderQueue {
    private Queue<String> orderQueue = new LinkedList<>();
    private Scanner input = new Scanner(System.in);

    public void addOrder(String order) {
        orderQueue.add(order);
        System.out.println("Order added: " + order);
    }

    public void processOrder() {
        if (!orderQueue.isEmpty()) {
            String order = orderQueue.poll();
            System.out.println("Processing order: " + order);
        } else {
            System.out.println("No orders to process.");
        }
    }

    public void displayOrders() {
        if (!orderQueue.isEmpty()) {
            System.out.println("Current orders in queue:");
            for (String order : orderQueue) {
                System.out.println(order);
            }
        } else {
            System.out.println("No orders in queue.");
        }
    }

    public void handleQueue() {
        while (true) {
            System.out.println("\nChoose what you want to do with order queue:");
            System.out.println("1. Add an order");
            System.out.println("2. Process the next order");
            System.out.println("3. Display all orders");
            System.out.println("4. Exit");

            System.out.print("Enter your choice (1-4): ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the order details: ");
                    String order = input.nextLine();
                    addOrder(order);
                    break;
                case 2:
                    processOrder();
                    break;
                case 3:
                    displayOrders();
                    break;
                case 4:
                    System.out.println("Exiting queue management.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}