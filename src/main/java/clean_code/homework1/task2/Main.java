package clean_code.homework1.task2;

public class Main {

  public static void main(String[] args) {
    System.out.println("Задача 2:");
    DiscountCalculator discountCalculator = new DiscountCalculator();
    System.out.println(
        "Скидка, когда все условия true " + discountCalculator.calculateDiscount(100, true, true,
            true));
    System.out.println(
        "Скидка, когда не лояльный клиент " + discountCalculator.calculateDiscount(100, false, true,
            true));
    System.out.println(
        "Скидка, когда нет купона " + discountCalculator.calculateDiscount(100, true, true, false));
    System.out.println(
        "Скидка, когда не первая покупка " + discountCalculator.calculateDiscount(100, true, false,
            true));
    System.out.println(
        "Скидка, когда не первая и нет купона " + discountCalculator.calculateDiscount(100, true,
            false, false));
    System.out.println(
        "Скидка, когда все условия false " + discountCalculator.calculateDiscount(100, false, false,
            false));

  }

}
