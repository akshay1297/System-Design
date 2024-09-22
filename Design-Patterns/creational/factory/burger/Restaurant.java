package creational.factory.burger;

// factory method
public class Restaurant {
        // its work is to take the order - factory
    public Burger orderBurger(String request){
        Burger burger = null;
        if(request.equalsIgnoreCase("cheese")){
             burger = new CheeseBurger();
        }
        else if(request.equalsIgnoreCase("veggie")){
            burger = new VeggieBurger();
        }
        if(burger != null){
            burger.prepare();
        }
        return burger;
    }
    // suppose cheese burger is removed from the menu - we have to modify this class and remove or add code which violets Open closed principle.

}
