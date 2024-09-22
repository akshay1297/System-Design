package creational.factory_extensive;

public class CheeseBurger implements BurgerFactory {

    @Override
    public BurgerFactory createBurger() {
        return new CheeseBurger();
    }
}
