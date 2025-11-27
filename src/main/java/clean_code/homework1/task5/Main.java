package clean_code.homework1.task5;

public class Main {

  public static void main(String[] args) {
    PaymentProcessor paymentProcessor = new PaymentProcessor();
    paymentProcessor.processPayment(new CreditCardPaymentService(), 100);
    paymentProcessor.processPayment(new PaypalPaymentService(), 200);
    paymentProcessor.processPayment(new BitcoinPaymentService(), 300);
  }

}
