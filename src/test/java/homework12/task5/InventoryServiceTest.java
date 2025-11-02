package homework12.task5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InventoryServiceTest {

  InventoryService service;
  Product product1;
  Product product2;


  @BeforeEach
  public void setup() {
    service = new InventoryService();
    product1 = new Product("Iphone 17", "Electronics", 1500.00);
    product2 = new Product("Iphone 16", "Electronics", 1300.00);
    service.setInventoryOpen(true);
  }

  /**
   * Проверим добавление товара с включенным флагом, и выключенным флагом. Проверим извлечение
   * товара по категории, когда есть товар в категории, и когда нет товара в категории. Проверим
   * фильтрацию по категории когда есть товары, и когда пустая категория. Проверим сортировку цен,
   * должно быть по убыванию
   */

  @Test
  public void shouldCheckAdditionAndGetByCategoryWhenFlagIsInventoryOpenEnabled() {
    assertTrue(service.isInventoryOpen());
    service.addProduct(product1);
    String expectedNameOfProduct = product1.getName();
    assertEquals(expectedNameOfProduct, service.getProductByCategory("Electronics").getName());
  }

  @Test
  public void shouldCheckAdditionAndGetByCategoryWhenFlagIsInventoryOpenDisabled() {
    service.setInventoryOpen(false);
    assertFalse(service.isInventoryOpen());
    service.addProduct(product1);
    assertThrows(OutOfStockException.class,
        () -> service.getProductByCategory("Electronics"));
  }

  @Test
  public void shouldCheckGetProductListByCategoryWhenProductAdded() {
    service.addProduct(product1);
    service.addProduct(product2);
    List<Product> actualResult = service.getProductListByCategory("Electronics");
    List<Product> expectedResult = List.of(product1, product2);
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void shouldCheckSortByPrice() {
    service.addProduct(product1);
    service.addProduct(product2);
    List<Product> expectedResult = List.of(product1, product2);
    List<Product> actualResult = service.sortedByPrice();
    assertEquals(expectedResult, actualResult);
  }


}
