package structural.bridge.pizza_problem;

public class Client {
    public static void main(String[] args){
        Pizza pizza = new PepperoniPizza("tomato", "Cheese");
        pizza.deliver();

        /*
         In this example, suppose we want to scale the Restaurant and add new kinda Pizza with the existing variaty:
         Italian Pizza | American Pizza
          Combination :
          ItalianVeggie Pizza | AmericanVeggie Pizza | ItalianCheese Pizza | AmericanCheese Pizza
          It can keep on extending & we have to make so many combinatory sub-classes....

          Solution :
          To prevent this, we can make an abstraction class "Restaurant"
          extend it to both Italian and American Restaurant.

          -> Restaurant will have reference to "Pizza"
          -> and While creating object of Italian or American Restaurant, we can pass new Pizza objects as per requirement.


         */

    }
}
