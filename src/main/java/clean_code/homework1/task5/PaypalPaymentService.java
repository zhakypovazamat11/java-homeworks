package clean_code.homework1.task5;

public class PaypalPaymentService implements PaymentService {

  @Override
  public void processPayment(double amount) {
    System.out.println("Оплата через PayPal на сумму " + amount);
  }
}
