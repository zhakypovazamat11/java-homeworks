package practice14.OrderManager;

import java.util.LinkedList;
import java.util.List;

public class Order {

  List<Product> products;
  List<Discountable> discounts;

  public Order() {
    products = new LinkedList<>();
    discounts = new LinkedList<>();
  }

  public void addProduct(Product product) {
    products.add(product);
  }

  public void addProducts(List<Product> productList) {
    products.addAll(productList);
  }

  public void addDiscount(Discountable discount) {
    discounts.add(discount);
  }

  public void addDiscounts(List<Discountable> discountList) {
    discounts.addAll(discountList);
  }

  public double calculateTotalPrice() {
    double productSum = products.stream().mapToDouble(Product::getPrice).sum();
    for (Discountable discount : discounts) {
      productSum = productSum - discount.discount(productSum);
    }
    return productSum;
  }

}
