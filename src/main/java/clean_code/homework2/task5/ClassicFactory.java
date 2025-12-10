package clean_code.homework2.task5;

public class ClassicFactory implements FurnitureFactory {

  @Override
  public Chairs manufactureChairs() {
    return new ClassicChairs();
  }

  @Override
  public Tables manufactureTables() {
    return new ClassicTables();
  }
}
