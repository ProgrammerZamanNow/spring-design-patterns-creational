package programmerzamannow.spring.creational.factory.method;

import lombok.Getter;

public class FacebookV2SocialMedia implements SocialMedia{

  @Getter
  private final String name = "FACEBOOK";

  @Getter
  private final String link = "https://web.facebook.com";

  @Getter
  private final SocialMediaType type = SocialMediaType.FACEBOOK;

}
