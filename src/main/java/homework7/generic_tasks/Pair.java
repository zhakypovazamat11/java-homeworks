package homework7.generic_tasks;

public class Pair<T, V> {

  private T itemOfObjectT;
  private V itemOfObjectV;

  public T getItemOfObjectT() {
    return this.itemOfObjectT;
  }

  public void setItemOfObjectT(T itemOfObjectT) {
    this.itemOfObjectT = itemOfObjectT;
  }

  public V getItemOfObjectV() {
    return this.itemOfObjectV;
  }

  public void setItemOfObjectV(V itemV) {
    this.itemOfObjectV = itemV;
  }
}
