package clean_code.practice1.task2.after;

import java.util.ArrayList;
import java.util.List;

public class OnlineStore {

  private List<Order> orders = new ArrayList<>();
  private PaymentService paymentService;
  private DiscountStrategy discountStrategy;
  private BulkOrderStrategy bulkOrderStrategy;

  public OnlineStore(PaymentService paymentService, DiscountStrategy discountStrategy,
      BulkOrderStrategy bulkOrderStrategy) {
    this.paymentService = paymentService;
    this.discountStrategy = discountStrategy;
    this.bulkOrderStrategy = bulkOrderStrategy;
  }

  public void addOrder(Order order) {
    orders.add(order);
  }

  private List<Product> getActualProductList(List<Product> productList) {
    List<Product> actualProductList = new ArrayList<>();
    for (Product product : productList) {
      if (product.isInStock()) {
        actualProductList.add(product);
      }
    }
    return actualProductList;
  }

  public void processOrder() {
    for (Order order : orders) {
      //Шаг 1: Сформировать список товаров в наличии
      System.out.println("Start preparing actual product list for order " + order.getNumber());
      List<Product> actualProductList = getActualProductList(order.getProductList());
      // шаг 2: Обновляем заказ актуальным списком товаров в наличии
      order.setProductList(actualProductList);
      System.out.println("Actual list for order: " + order);
      order.printProductList();
      // шаг 3: Вычисляем скидку на основании общей цены
      System.out.println("Start calculating discount for order");
      double finalPrice = discountStrategy.applyDiscount(order.calculateTotalPrice());
      order.setTotalPrice(finalPrice);
      System.out.println("Final price for order " + order + " is " + finalPrice);
      // шаг 4: отправка запроса на покупку оптом
      bulkOrderStrategy.createBulkOrder(order);
      System.out.println("Bulk order checked");
    }
  }

}

