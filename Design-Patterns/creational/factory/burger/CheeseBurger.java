package creational.factory.burger;


// concrete products
public class CheeseBurger extends Burger {
    @Override
    public void prepare() {
        System.out.println("Prepare cheese burger.");
    }
}
