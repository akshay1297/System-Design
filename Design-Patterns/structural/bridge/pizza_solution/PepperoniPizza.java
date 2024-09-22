package structural.bridge.pizza_solution;

public class PepperoniPizza extends Pizza {


    public PepperoniPizza(String sauce, String toppings) {
        super(sauce, toppings);
    }

    @Override
    public void deliver() {
        System.out.println("Deliver Pepperoni Pizza. ");
    }
}
