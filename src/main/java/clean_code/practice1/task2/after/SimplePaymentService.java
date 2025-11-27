package clean_code.practice1.task2.after;

public class SimplePaymentService implements PaymentService {

  @Override
  public void processPayment(Order order) {
    if (!order.isPaid()) {
      System.out.println("Processing order: " + order);
      order.makePayment();
    } else {
      System.out.println("Order was paid before: " + order);
    }
  }
}
