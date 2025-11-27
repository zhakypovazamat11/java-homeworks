package clean_code.homework1.task5;

public class BitcoinPaymentService implements PaymentService {

  @Override
  public void processPayment(double amount) {
    System.out.println("Оплата Bitcoin на сумму " + amount);
  }
}
