package behavioral.strategy.paymentProcessingSystem;

public class Client {
    public static void main(String[] args){

//        PaymentManager paymentManager = new PaymentManager(new Paypal(25.2));
//        paymentManager.doPayment();
//
//        PaymentManager paymentManager2 = new PaymentManager(new CreditCard(22.2));
//        paymentManager2.doPayment();
//
//        PaymentManager paymentManager1 = new PaymentManager(new Bitcoin(22.0));
//        paymentManager1.doPayment();
/* Issue in above code :
Issue 1 : I am using multiple paymentManager
Solution : Instead of tightly coupling the strategy to PaymentManager
by passing the PaymentStrategy to the constructor, you could create a method to set the payment strategy.
This will allow the same PaymentManager instance to handle multiple strategies.

Addition :
public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
    this.paymentStrategy = paymentStrategy;
}
 */

// Code after fix :
        PaymentManager paymentManager = new PaymentManager();
        paymentManager.setPaymentStrategy(new Bitcoin(22.0));
        paymentManager.doPayment();

        paymentManager.setPaymentStrategy(new Paypal(22.9));
        paymentManager.doPayment();

        paymentManager.setPaymentStrategy(new CreditCard(23.0));
        paymentManager.doPayment();





    }
}
