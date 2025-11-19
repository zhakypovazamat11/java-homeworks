package practice14.OrderManager;

public class FixedDiscount implements Discountable {

  private int fixedSum;

  public FixedDiscount(int amount) {
    fixedSum = amount;
  }

  @Override
  public double discount(double price) {
    return fixedSum;
  }
}
