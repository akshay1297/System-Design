package structural.bridge.pizza_solution;

public class VeggiePizza extends Pizza {
    public VeggiePizza(String sauce, String toppings) {
        super(sauce, toppings);
    }

    @Override
    public void deliver() {
        System.out.println("Deliver Veggie Pizza. ");
    }
}
