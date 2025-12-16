package clean_code.homework2.task3;

public class Main {

  public static void main(String[] args) {
    TransportManufacture manufacture1 = new CarManufacture();
    manufacture1.printManufacteredTransportInfo();

    TransportManufacture manufacture2 = new BicycleManufacture();
    manufacture2.printManufacteredTransportInfo();

  }

}
