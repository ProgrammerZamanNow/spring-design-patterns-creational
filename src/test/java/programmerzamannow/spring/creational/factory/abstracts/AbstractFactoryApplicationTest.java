package programmerzamannow.spring.creational.factory.abstracts;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = AbstractFactoryApplication.class)
class AbstractFactoryApplicationTest {

  @Autowired
  private ApplicationContext applicationContext;

  @Test
  void testAbstractFactory() {
    PaymentFactory paymentFactoryCreditCard = applicationContext.getBean(CreditCardPaymentFactory.class);
    PaymentFactory paymentFactoryBcaKlikpay = applicationContext.getBean(BcaKlikpayPaymentFactory.class);
    PaymentFactory paymentFactoryGopay = applicationContext.getBean(GopayPaymentFactory.class);

    charge(paymentFactoryCreditCard);
    charge(paymentFactoryGopay);
    charge(paymentFactoryBcaKlikpay);
  }

  public void charge(PaymentFactory paymentFactory){
    ChargePaymentRequest request = paymentFactory.createChargeRequest();
    request.setId("xxx");
    request.setAmount(1000000L);

    // kirim ke payment gateway
    System.out.println(request);
  }

  public void cancel(PaymentFactory paymentFactory){
    CancelPaymentRequest request = paymentFactory.createCancelRequest();
    request.setId("xxx");

    // kirim ke payment gateway
    System.out.println(request);
  }

  public Long getBalance(PaymentFactory paymentFactory){
    try{
      GetBalancePaymentRequest request = paymentFactory.createGetBalanceRequest();
      request.setUserId("eko");

      System.out.println(request);

      // send to payment gateway
      return 1000L;
    }catch (UnsupportedOperationException exception){
      return 0L;
    }
  }

}