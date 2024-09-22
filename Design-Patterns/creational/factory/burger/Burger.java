package creational.factory.burger;

// Product
public abstract class Burger {
    Integer productId;
    String addons;

    public abstract void prepare();
}
