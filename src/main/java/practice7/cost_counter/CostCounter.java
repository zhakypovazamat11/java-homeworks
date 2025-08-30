package practice7.cost_counter;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class CostCounter {

  // массив, индекс = номер месяца
  private ArrayList<Double> costsPerMonth;// new ArrayList<>(); могу сразу тут либо в конструкторе

  public CostCounter() {
    this.costsPerMonth = new ArrayList<>();
  }

  //метод добавления по индексу по номеру месяца(1-12) и расходу
  public void addCosts(int month, double costs) {
    costsPerMonth.add(month - 1, costs);
  }

  //метод получения значения расходы
  public Double getCosts(int month) {
    return costsPerMonth.get(month - 1);
  }

  // считать месяц с мин расходом
  public Double minCostsPerMonth() {
    AtomicReference<Double> min = new AtomicReference<>(costsPerMonth.getFirst());
    costsPerMonth.forEach(
        costsPerMonth -> {
          if (min.get() > costsPerMonth) {
            min.set(costsPerMonth);
          }
        }
    );
    return min.get();
  }
}
