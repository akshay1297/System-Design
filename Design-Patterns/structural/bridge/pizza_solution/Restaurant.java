package structural.bridge.pizza_solution;

import structural.bridge.pizza_problem.Pizza;

public abstract class Restaurant {
    protected Pizza pizza;

    public Restaurant(Pizza pizza) {
        this.pizza = pizza;
    }

   public abstract void addSauce();
    public abstract void addToppings();

    public void deliver(){
        pizza.deliver();
    }

}
