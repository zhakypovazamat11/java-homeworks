package clean_code.homework2.task7;

import clean_code.homework2.task7.Order.OrderBuilder;

public class Shop {

  private OrderBuilder order;

  public Order createOrder() {
    return new Order.OrderBuilder().addProduct("Laptop").applyDiscount(10)
        .selectPaymentType("Credit card").build();
  }


}
