package clean_code.homework1.task5;

public class CreditCardPaymentService implements PaymentService {

  @Override
  public void processPayment(double amount) {
    System.out.println("Оплата кредитной картой на сумму " + amount);
  }
}
