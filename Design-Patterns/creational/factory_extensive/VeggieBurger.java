package creational.factory_extensive;

public class VeggieBurger implements BurgerFactory {

    @Override
    public BurgerFactory createBurger() {
        return new VeggieBurger();
    }
}
