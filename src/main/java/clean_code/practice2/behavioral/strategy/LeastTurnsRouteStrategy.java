package clean_code.practice2.behavioral.strategy;

public class LeastTurnsRouteStrategy implements RouteStrategy {

  @Override
  public void buildRoute() {
    System.out.println("Building the route with the least turns.");
  }
}
