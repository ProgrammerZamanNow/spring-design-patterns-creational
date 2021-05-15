package programmerzamannow.spring.creational.factory.inheritance;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import programmerzamannow.spring.creational.factory.method.*;

@SpringBootApplication
public class FactoryInheritanceApplication {

  @Bean
  @Scope("prototype")
  public SocialMedia socialMediaFacebook(){
    return new FacebookV2SocialMedia();
  }

  @Bean
  @Scope("prototype")
  public SocialMedia socialMediaTwitter(){
    return new TwitterSocialMedia();
  }

  @Bean
  @Scope("prototype")
  public SocialMedia socialMediaInstagram(){
    return new InstagramSocialMedia();
  }

  @Bean
  @Scope("prototype")
  public SocialMedia socialMediaTikTok(){
    return new TikTokSocialMedia();
  }
}
