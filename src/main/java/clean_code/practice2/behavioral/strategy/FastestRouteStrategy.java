package clean_code.practice2.behavioral.strategy;

public class FastestRouteStrategy implements RouteStrategy {

  @Override
  public void buildRoute() {
    System.out.println("Building the fastest route.");
  }
}
