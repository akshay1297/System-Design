package structural.bridge.pizza_solution;

import structural.bridge.pizza_problem.PepperoniPizza;

public class Client {
    public static void main(String[] args){
       Restaurant restaurant = new ItalianRestaurant(new PepperoniPizza("tomato", "cheese"));
       restaurant.deliver();


    }
}
