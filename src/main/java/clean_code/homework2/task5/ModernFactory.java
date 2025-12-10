package clean_code.homework2.task5;

public class ModernFactory implements FurnitureFactory {

  @Override
  public Chairs manufactureChairs() {
    return new ModernChairs();
  }

  @Override
  public Tables manufactureTables() {
    return new ModernTables();
  }
}
