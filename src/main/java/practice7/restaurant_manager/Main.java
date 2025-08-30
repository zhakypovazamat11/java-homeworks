package practice7.restaurant_manager;

public class Main {

  public static void main(String[] args) {
    RestaurantManager manager = new RestaurantManager();
    manager.addOrders("Плов");
    manager.addOrders("Лагман");
    manager.addOrders("Картошка фри");
    manager.addOrders("Манты");
    manager.addOrders("Мясо на жаровне");
    manager.addOrders("Куурдак");
    manager.printOrders();
    manager.getNextOrderForProcessing();
    manager.printOrders();
    manager.removeOrder("Манты");
    manager.printOrders();
  }

}
