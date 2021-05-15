package programmerzamannow.spring.creational.factory.method;

import lombok.Getter;

public class InstagramSocialMedia implements SocialMedia{

  @Getter
  private final String name = "INSTAGRAM";

  @Getter
  private final String link = "https://instagram.com";

  @Getter
  private final SocialMediaType type = SocialMediaType.INSTAGRAM;

}
