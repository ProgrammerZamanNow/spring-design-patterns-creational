package programmerzamannow.spring.creational.factory.abstracts.gopay;

import lombok.Getter;
import lombok.Setter;
import programmerzamannow.spring.creational.factory.abstracts.CancelPaymentRequest;
import programmerzamannow.spring.creational.factory.abstracts.PaymentMethod;

public class GopayCancelPaymentRequest implements CancelPaymentRequest {

  @Getter
  @Setter
  private String id;

  @Override
  public PaymentMethod getMethod() {
    return PaymentMethod.GOPAY;
  }
}
