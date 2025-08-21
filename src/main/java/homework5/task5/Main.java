package homework5.task5;

public class Main {

  public static void main(String[] args) {
    Farm farm = new Farm();
    Animal cow = new Cow();
    farm.setAnimal(cow);
    farm.careAnimal();
    farm.produce();
  }

}
