package programmerzamannow.spring.creational.builder;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class BuilderApplication {

  @Bean
  @Scope("prototype")
  public Product productGadget(){
    return Product.builder()
        .category(Category.GADGET)
        .build();
  }

  @Bean
  @Scope("prototype")
  public Product productFashion(){
    return Product.builder()
        .category(Category.FASHION)
        .build();
  }
}
