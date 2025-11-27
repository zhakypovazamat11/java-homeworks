package clean_code.homework1.task5;

public class PaymentProcessor {

  public void processPayment(PaymentService paymentType, double amount) {
    paymentType.processPayment(amount);
  }
}
