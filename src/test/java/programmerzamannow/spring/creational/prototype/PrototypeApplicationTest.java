package programmerzamannow.spring.creational.prototype;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = PrototypeApplication.class)
class PrototypeApplicationTest {

  @Autowired
  private ApplicationContext applicationContext;

  @Test
  void testPrototype() {
    Employee eko = applicationContext.getBean("employeeManager", Employee.class);
    eko.setName("Eko");

    Employee budi = applicationContext.getBean("employeeStaff", Employee.class);
    budi.setName("Budi");

    Employee joko = applicationContext.getBean("employeeStaff", Employee.class);
    joko.setName("Joko");

    Employee rika = applicationContext.getBean("employeeManager", Employee.class);
    rika.setName("Rika");

    System.out.println(eko);
    System.out.println(budi);
    System.out.println(joko);
    System.out.println(rika);
  }
}