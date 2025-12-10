package clean_code.homework2.task10;

public class Main {

  public static void main(String[] args) {
    Miles miles = new Miles(100.0);
    MilesToKilometersAdapter adapter = new MilesToKilometersAdapter(miles);
    System.out.println(adapter.convertMilesToKilometers());
  }

}
