package programmerzamannow.spring.creational.factory.inheritance;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import programmerzamannow.spring.creational.factory.method.SocialMedia;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = FactoryInheritanceApplication.class)
class FactoryInheritanceApplicationTest {

  @Autowired
  private ApplicationContext applicationContext;

  @Test
  void testFactoryInheritance() {
    SocialMedia facebook = applicationContext.getBean("socialMediaFacebook", SocialMedia.class);
    SocialMedia twitter = applicationContext.getBean("socialMediaTwitter", SocialMedia.class);
    SocialMedia instagram = applicationContext.getBean("socialMediaInstagram", SocialMedia.class);
    SocialMedia tiktok = applicationContext.getBean("socialMediaTikTok", SocialMedia.class);

    System.out.println(facebook);
    System.out.println(twitter);
    System.out.println(instagram);
    System.out.println(tiktok);
  }
}