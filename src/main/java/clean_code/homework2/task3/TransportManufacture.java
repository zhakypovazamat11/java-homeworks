package clean_code.homework2.task3;

public abstract class TransportManufacture {

  abstract Transport createTransport();

  public void printManufacteredTransportInfo() {
    Transport transport = createTransport();
    transport.printInfo();
  }
}
