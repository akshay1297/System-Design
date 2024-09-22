package creational.Prototype.animal;


public class Dog extends Animal {
    public static void main(String[] args){
        Animal animal = new Animal(23, false);
        Animal dg = animal.clone();
        System.out.println(dg.getHeight());
    }

}
