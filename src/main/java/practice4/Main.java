package practice4;

import practice4.solver.IfElseTaskSolver;
import practice4.solver.SwitchTaskSolver;

public class Main {

  public static void main(String[] args) {
    IfElseTaskSolver taskSolver = new IfElseTaskSolver();
    // Проверка метода четности
    System.out.println(taskSolver.checkParity(4));
    System.out.println(taskSolver.checkParity(7));
    // Проверка метода определения возраста
    System.out.println(taskSolver.chechAge(4));
    System.out.println(taskSolver.chechAge(21));
    System.out.println(taskSolver.chechAge(71));
    // Проверка по нахождению макс числа из 3
    System.out.println(taskSolver.checkMax(8, 10, 25));

    SwitchTaskSolver switchTaskSolver = new SwitchTaskSolver();
    //Проверка метода возвращающего день недели по числу
    System.out.println(3);
    System.out.println(15);
    // Проверка метода описания сезона
    switchTaskSolver.describeSeason(Season.SPRING);
    switchTaskSolver.describeSeason(Season.AUTUMN);
  }
}
