package homework12.task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InventoryService {

  Map<String, List<Product>> storage = new HashMap<>();
  private boolean isInventoryOpen = true;

  public boolean isInventoryOpen() {
    return isInventoryOpen;
  }

  public void setInventoryOpen(boolean inventoryOpen) {
    this.isInventoryOpen = inventoryOpen;
  }

  public void addProduct(Product product) {
    if (isInventoryOpen) {
      storage.computeIfAbsent(product.getCategory(), v -> new ArrayList<>()).add(product);
    }
  }

  public Product getProductByCategory(String category) {
    if (storage.get(category) == null || storage.get(category).isEmpty()) {
      throw new OutOfStockException("В указанной категории " + category + " нет товаров!");
    }

    return storage.get(category).removeFirst();
  }

  public List<Product> sortedByPrice() {
    return storage.values().stream().flatMap(List::stream).sorted((e1, e2) -> Double.compare(
        e2.getPrice(), e1.getPrice())).collect(Collectors.toList());
  }

  public List<Product> getProductListByCategory(String category) {
    return new ArrayList<>(storage.getOrDefault(category, List.of()));
  }
}
