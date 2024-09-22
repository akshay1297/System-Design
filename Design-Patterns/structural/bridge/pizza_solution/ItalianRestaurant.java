package structural.bridge.pizza_solution;

import structural.bridge.pizza_problem.Pizza;

public class ItalianRestaurant extends Restaurant{
    public ItalianRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void addSauce() {
        System.out.println("Sauce is added to Italian Restaurant : ");
    }

    @Override
    public void addToppings() {
        System.out.println("Sauce is added to Italian Restaurant : ");
    }
}
