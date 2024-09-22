package behavioral.strategy.paymentProcessingSystem;

public class Bitcoin implements PaymentStrategy{
    private Double amount;

    public Bitcoin(Double amount) {
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
        System.out.println("Process payment through Bitcoin");
    }
}
