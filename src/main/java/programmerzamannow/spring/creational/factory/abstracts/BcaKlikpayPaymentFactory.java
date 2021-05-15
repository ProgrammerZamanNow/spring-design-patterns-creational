package programmerzamannow.spring.creational.factory.abstracts;

import org.springframework.context.annotation.Configuration;
import programmerzamannow.spring.creational.factory.abstracts.bcaklikpay.BcaKlikpayCancelPaymentRequest;
import programmerzamannow.spring.creational.factory.abstracts.bcaklikpay.BcaKlikpayChargePaymentRequest;
import programmerzamannow.spring.creational.factory.abstracts.bcaklikpay.BcaKlikpayGetBalancePaymentRequest;

@Configuration
public class BcaKlikpayPaymentFactory implements PaymentFactory{

  @Override
  public ChargePaymentRequest createChargeRequest() {
    return new BcaKlikpayChargePaymentRequest();
  }

  @Override
  public CancelPaymentRequest createCancelRequest() {
    return new BcaKlikpayCancelPaymentRequest();
  }

  @Override
  public GetBalancePaymentRequest createGetBalanceRequest() {
    return new BcaKlikpayGetBalancePaymentRequest();
  }
}
