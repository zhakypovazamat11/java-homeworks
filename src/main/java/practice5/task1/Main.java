package practice5.task1;

public class Main {

  public static void main(String[] args) {
    Transport car = new Car();
    Transport ship = new Ship();
    Transport plane = new Plane();
    Dispatcher dispatcher = new Dispatcher();
    dispatcher.control(car);
    dispatcher.printTransportDetails(car);
    dispatcher.control(ship);
    dispatcher.printTransportDetails(ship);
    dispatcher.control(plane);
    dispatcher.printTransportDetails(plane);
  }

}
