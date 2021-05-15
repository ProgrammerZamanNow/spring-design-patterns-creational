package programmerzamannow.spring.creational.factory.abstracts.bcaklikpay;

import lombok.Getter;
import lombok.Setter;
import programmerzamannow.spring.creational.factory.abstracts.ChargePaymentRequest;
import programmerzamannow.spring.creational.factory.abstracts.PaymentMethod;

public class BcaKlikpayChargePaymentRequest implements ChargePaymentRequest {

  @Getter
  @Setter
  private String id;

  @Getter
  @Setter
  private Long amount;

  @Override
  public Long getFee() {
    return 5000L;
  }

  @Override
  public PaymentMethod getMethod() {
    return PaymentMethod.BCA_KLIKPAY;
  }
}
