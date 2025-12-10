package clean_code.homework2.task5;

public class Main {

  public static void main(String[] args) {
    FurnitureFactory classicFactory = new ClassicFactory();
    FurnitureFactory modernFactory = new ModernFactory();

    classicFactory.manufactureChairs().manufacture();
    classicFactory.manufactureTables().manufacture();

    modernFactory.manufactureTables().manufacture();
    modernFactory.manufactureChairs().manufacture();
  }

}
