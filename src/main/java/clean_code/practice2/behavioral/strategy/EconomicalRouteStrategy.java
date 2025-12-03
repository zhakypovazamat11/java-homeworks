package clean_code.practice2.behavioral.strategy;

public class EconomicalRouteStrategy implements RouteStrategy {

  @Override
  public void buildRoute() {
    System.out.println("Building the most economical route.");
  }
}
