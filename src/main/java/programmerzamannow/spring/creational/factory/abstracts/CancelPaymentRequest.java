package programmerzamannow.spring.creational.factory.abstracts;

public interface CancelPaymentRequest {

  String getId();

  void setId(String id);

  PaymentMethod getMethod();

}
