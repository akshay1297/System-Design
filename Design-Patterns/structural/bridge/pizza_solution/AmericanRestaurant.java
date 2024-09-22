package structural.bridge.pizza_solution;

import structural.bridge.pizza_problem.Pizza;

public class AmericanRestaurant extends Restaurant{
    public AmericanRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void addSauce() {
        System.out.println("Sauce is added to American Restaurant : ");
    }

    @Override
    public void addToppings() {
        System.out.println("Toppings is added to American Restaurant : ");
    }
}
