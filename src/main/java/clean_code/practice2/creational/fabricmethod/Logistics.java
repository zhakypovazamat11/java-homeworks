package clean_code.practice2.creational.fabricmethod;

/**
 * Класс для управления логистикой
 */
public abstract class Logistics {

  // Фабричным методом
  // Метод реализует способ создания транспорта
  abstract Transport createTransport();

  public void planDelivery() {
    Transport transport = createTransport();
    transport.deliver();
  }
}
