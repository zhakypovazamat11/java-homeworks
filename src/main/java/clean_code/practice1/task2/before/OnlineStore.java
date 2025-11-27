package clean_code.practice1.task2.before;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnlineStore {

  private List<Map<String, Object>> orders = new ArrayList<>();
  private double totalSales = 0;

  public static void main(String[] args) {
    OnlineStore store = new OnlineStore();
    store.processOrder("Laptop", 1, 1200, "John Doe", true, true);
    store.processOrder("Smartphone", 2, 800, "Alice Smith", true, false);
    store.processOrder("Laptop", 5, 1200, "Bob Johnson", true, true);
  }

  public void processOrder(String product, int quantity, double price, String customer,
      boolean paymentReceived, boolean inStock) {
    if (inStock) {
      if (paymentReceived) {
        Map<String, Object> order = new HashMap<>();
        order.put("product", product);
        order.put("quantity", quantity);
        order.put("price", price);
        order.put("customer", customer);

        double totalPrice = price * quantity;
        totalSales += totalPrice;

        System.out.println("Processing order: " + order);
        System.out.println("Total price for this order: $" + totalPrice);
        orders.add(order);

        if (totalPrice > 500) {
          System.out.println("This order qualifies for a 10% discount next time!");
        }

        if (product.equals("Laptop")) {
          if (quantity > 3) {
            System.out.println("Bulk order for Laptops processed!");
          }
        }

        System.out.println(
            "Order processed for customer: " + customer + ". Total sales now: $" + totalSales);
      } else {
        System.out.println(
            "Payment not received for customer: " + customer + ". Cannot process order for "
                + product);
      }
    } else {
      System.out.println("Product " + product + " is not in stock.");
    }
  }
}
