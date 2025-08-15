package practice4.solver;

public class IfElseTaskSolver {

  //метод для провереи четности
  public String checkParity(int number) {
    // в методе должен быть один return
    String parity = "Нечетное";
    if (number % 2 == 0) {
      parity = "Четное";
    }
    return parity;
  }

  public String chechAge(int age) {
    String ageDescription = "";
    if (age < 18) {
      ageDescription = "Несовершеннолетний";
    }
    if (age >= 18 && age <= 60) {
      ageDescription = "Взрослый";
    }
    if (age > 60) {
      ageDescription = "Пожилой";
    }

    return ageDescription;
  }

  public int checkMax(int a, int b, int c) {
    int maxAb = b;
    if (a > b) {
      maxAb = a;
    }
    int max = maxAb;
    if (c > maxAb) {
      max = c;
    }
    return max;
  }
}