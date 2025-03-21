import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class OrderLogs {
    private Deque<String> orderLogs = new ArrayDeque<>();
    private Scanner input = new Scanner(System.in);

    public void addOrderLog(String log) {
        orderLogs.push(log);
        System.out.println("Log added: " + log);
    }

    public void mostRecentLogEntry() {
        if (!orderLogs.isEmpty()) {
            System.out.println("Most recent log: " + orderLogs.peek());
        } else {
            System.out.println("No logs available.");
        }
    }

    public String getOrderLog() {
        if (!orderLogs.isEmpty()) {
            return orderLogs.pop();
        } else {
            return "No logs available.";
        }
    }

    public void removeAllLogEntries() {
        orderLogs.clear();
        System.out.println("All logs have been removed.");
    }

    public boolean orderLogsEmpty() {
        return orderLogs.isEmpty();
    }

    public void handleLogs() {
        while (true) {
            System.out.println("\nChoose what you want to do with order logs:");
            System.out.println("1. Display the most recent log");
            System.out.println("2. Remove a log entry");
            System.out.println("3. Remove all log entries");
            System.out.println("4. Check if the log is completely empty");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    mostRecentLogEntry();
                    break;
                case 2:
                    System.out.println("Removed log: " + getOrderLog());
                    break;
                case 3:
                    removeAllLogEntries();
                    break;
                case 4:
                    if (orderLogsEmpty()) {
                        System.out.println("The log is completely empty.");
                    } else {
                        System.out.println("The log is not completely empty.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting log management.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}