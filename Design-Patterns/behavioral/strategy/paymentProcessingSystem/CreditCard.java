package behavioral.strategy.paymentProcessingSystem;

public class CreditCard implements PaymentStrategy{

    private Double amount;

    public CreditCard(Double amount) {
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
        System.out.println("Process payment through Credit card");

    }
}
