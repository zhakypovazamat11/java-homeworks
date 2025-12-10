package clean_code.homework2.task7;

public class Order {

  private String productName;
  private int discount;
  private String paymentType;

  public Order(String productName, int discount, String paymentType) {
    this.productName = productName;
    this.discount = discount;
    this.paymentType = paymentType;
  }

  public Order(OrderBuilder builder) {
    this.productName = builder.productName;
    this.discount = builder.discount;
    this.paymentType = builder.paymentType;
  }

  public String displayOrder() {
    return "Order: " + productName + " applied discount for " + discount + " %, selected payment "
        + paymentType;
  }

  static class OrderBuilder {

    private String productName;
    private int discount;
    private String paymentType;

    public OrderBuilder addProduct(String productName) {
      this.productName = productName;
      System.out.println("Продукт " + productName + " добавлен в заказ");
      return this;
    }

    public OrderBuilder applyDiscount(int discount) {
      this.discount = discount;
      System.out.println("применена скидка в размере " + discount);

      return this;
    }

    public OrderBuilder selectPaymentType(String paymentType) {
      this.paymentType = paymentType;
      System.out.println("оплата будет произведена через " + paymentType);

      return this;
    }

    public Order build() {
      return new Order(this);
    }
  }
}
