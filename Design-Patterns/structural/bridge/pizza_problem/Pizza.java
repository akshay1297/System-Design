package structural.bridge.pizza_problem;

public abstract class Pizza {
    private String sauce;
    private String toppings;

    public Pizza(String sauce, String toppings) {
        this.sauce = sauce;
        this.toppings = toppings;
    }

    public abstract void deliver();
}
