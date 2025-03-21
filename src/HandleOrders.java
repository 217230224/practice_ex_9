import java.util.ArrayList;
import java.util.Scanner;

public class HandleOrders {
    private ArrayList<CustomPizza> customPizzas = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public void takeOrder() {
        System.out.println("Would you like to create a custom pizza? (Y/N): ");
        String choice = input.nextLine();

        if (choice.equalsIgnoreCase("Y")) {
            StringBuilder customPizzaToppings = new StringBuilder();
            double customPizzaPrice = 10.0;

            System.out.println("Choose your toppings (max 10):");
            for (int i = 1; i <= 10; i++) {
                System.out.println("Enter topping #" + i + " (or type 'done' to finish): ");
                String topping = input.nextLine();
                if (topping.equalsIgnoreCase("done")) {
                    break;
                }
                customPizzaToppings.append(topping).append(", ");
                customPizzaPrice += 1.0;
            }

            CustomPizza customPizza = new CustomPizza(customPizzaToppings.toString(), customPizzaPrice);

            customPizzas.add(customPizza);
            System.out.println("Custom pizza added to your order!");
        }
    }

    public void displayCustomPizzas() {
        if (customPizzas.isEmpty()) {
            System.out.println("No custom pizzas ordered.");
        } else {
            System.out.println("Custom Pizzas Ordered:");
            for (CustomPizza pizza : customPizzas) {
                System.out.println(pizza);
            }
        }
    }
}