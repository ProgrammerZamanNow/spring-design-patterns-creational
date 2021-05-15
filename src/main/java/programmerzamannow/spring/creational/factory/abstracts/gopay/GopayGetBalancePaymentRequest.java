package programmerzamannow.spring.creational.factory.abstracts.gopay;

import lombok.Getter;
import lombok.Setter;
import programmerzamannow.spring.creational.factory.abstracts.GetBalancePaymentRequest;
import programmerzamannow.spring.creational.factory.abstracts.PaymentMethod;

public class GopayGetBalancePaymentRequest implements GetBalancePaymentRequest {

  @Getter
  @Setter
  private String userId;

  @Override
  public PaymentMethod getMethod() {
    return PaymentMethod.GOPAY;
  }
}
