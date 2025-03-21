public class Main {
    public static void main(String[] args) {
        testHandleOrders();

        testOrderLogs();
    }

    private static void testHandleOrders() {
        System.out.println("=== Testing HandleOrders ===");
        HandleOrders handleOrders = new HandleOrders();

        handleOrders.takeOrder();


        handleOrders.displayCustomPizzas();
    }

    private static void testOrderLogs() {
        System.out.println("\n=== Testing OrderLogs ===");
        OrderLogs orderLogs = new OrderLogs();

        orderLogs.addOrderLog("Order 1: Pepperoni Pizza");
        orderLogs.addOrderLog("Order 2: Custom Pizza");
        orderLogs.addOrderLog("Order 3: Hawaiian Pizza");

        orderLogs.handleLogs();
    }

    // 测试 OrderQueue 功能
    @SuppressWarnings("unused")
    private static void testOrderQueue() {
        System.out.println("\n=== Testing OrderQueue ===");
        OrderQueue orderQueue = new OrderQueue();

        // 处理订单队列
        orderQueue.handleQueue();
    }
}