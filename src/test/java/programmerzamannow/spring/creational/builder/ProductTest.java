package programmerzamannow.spring.creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

  @Test
  void testBuilder() {
    Product iphone = Product.builder()
        .id("XXX")
        .name("iPhone")
        .sku("XXX")
        .price(20_000_000L)
        .build();

    System.out.println(iphone);
  }
}