package behavioral.strategy.paymentProcessingSystem;

public class PaymentManager {
    private PaymentStrategy paymentStrategy = null;
//    PaymentManager(PaymentStrategy paymentStrategy){
//        this.paymentStrategy = paymentStrategy;
//    }
    // Instead to adding into constructor , making setter method is useful

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void doPayment(){
       if(paymentStrategy != null){
           paymentStrategy.processPayment();
       }
    }
}
