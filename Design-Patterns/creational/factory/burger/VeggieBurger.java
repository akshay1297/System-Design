package creational.factory.burger;


// concrete products
public class VeggieBurger extends Burger {
    @Override
    public void prepare() {
        System.out.println("Prepare Veggie burger.");
    }
}
