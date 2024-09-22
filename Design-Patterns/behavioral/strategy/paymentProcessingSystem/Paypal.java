package behavioral.strategy.paymentProcessingSystem;

public class Paypal implements PaymentStrategy{

    private Double amount;

    public Paypal(Double amount) {
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public void processPayment() {
        System.out.println("Process payment through Paypal");
    }
}
