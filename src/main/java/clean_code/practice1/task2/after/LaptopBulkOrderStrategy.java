package clean_code.practice1.task2.after;

public class LaptopBulkOrderStrategy implements BulkOrderStrategy {

  @Override
  public void createBulkOrder(Order order) {
    order.getProductList().forEach(product -> {
      if (product.getName().equals("Laptop") && product.getQuantity() > 3) {
        System.out.println("Bulk order for Laptops processed!");
      }
    });
  }
}
