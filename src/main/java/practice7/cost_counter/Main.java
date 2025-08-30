package practice7.cost_counter;

public class Main {

  public static void main(String[] args) {
    CostCounter costCounter = new CostCounter();
    costCounter.addCosts(1, 123.45);
    costCounter.addCosts(2, 4334.3);
    costCounter.addCosts(3, 34432.432);
    costCounter.addCosts(4, 432.34);
    costCounter.addCosts(5, 123.40);
    costCounter.addCosts(6, 432423.43);
    System.out.println(costCounter.getCosts(3));
    System.out.println(costCounter.minCostsPerMonth());
  }

}
