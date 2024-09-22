package structural.decorater.pizza;

public class Client {
    public static void main(String[] args){
        BasePizza pizza = new ExtraCheese(new Margharita());
        System.out.println(pizza.cost());


        BasePizza pizza1 = new Mushroom(new ExtraCheese(new Farmhouse()));
        System.out.println(pizza1.cost());
    }
}
