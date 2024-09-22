package creational.factory.burger;

public class Customer {

    public static void main(String[] args){
       // write code to order from Restaurant

        Restaurant restaurant = new Restaurant();
        restaurant.orderBurger("Cheese");
        System.out.println(restaurant);
    }
}
