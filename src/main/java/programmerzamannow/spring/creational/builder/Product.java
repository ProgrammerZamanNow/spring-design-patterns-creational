package programmerzamannow.spring.creational.builder;

import lombok.Builder;

@Builder
public class Product {

  private String id;

  private String name;

  private String sku;

  private Long price;

  private Category category;

  public Product(String id, String name, String sku, Long price, Category category) {
    this.id = id;
    this.name = name;
    this.sku = sku;
    this.price = price;
    this.category = category;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Product{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", sku='" + sku + '\'' +
        ", price=" + price +
        ", category=" + category +
        '}';
  }
}
