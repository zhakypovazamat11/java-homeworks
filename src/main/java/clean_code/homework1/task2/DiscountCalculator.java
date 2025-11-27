package clean_code.homework1.task2;

public class DiscountCalculator {

  public double calculateDiscount(double price, boolean isLoyalCustomer, boolean isFirstPurchase,
      boolean hasCoupon) {
    double discount = 0.0;

    discount = isLoyalCustomer ? applyDiscountForLoyalCustomer(price, isFirstPurchase)
        : applyCoupon(price, hasCoupon);

    return price - discount;
  }

  private double applyDiscountForLoyalCustomer(double price, boolean isFirstPurchase) {
    return price * (isFirstPurchase ? 0.10 : 0.05);
  }

  private double applyCoupon(double price, boolean hasCoupon) {
    return price * (hasCoupon ? 0.07 : 0.02);
  }

}
