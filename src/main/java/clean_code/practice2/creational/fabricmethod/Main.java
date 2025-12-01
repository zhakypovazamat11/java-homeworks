package clean_code.practice2.creational.fabricmethod;

public class Main {

  public static void main(String[] args) {
    Logistics logistics;
    String transportType = "ship"; // Тип может быть основан на входных данных или конфигурации

    if ("truck".equals(transportType)) {
      logistics = new LandLogistics();
    } else if ("ship".equals(transportType)) {
      logistics = new SeaLogistics();
    } else {
      logistics = new SkyLogistics();
    }

    logistics.planDelivery();
  }
}
