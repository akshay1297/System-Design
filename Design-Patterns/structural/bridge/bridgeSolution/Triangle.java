package structural.bridge.bridgeSolution;


public class Triangle extends Shape {
    public Triangle(ColorImplementor colorImplementor) {
        super(colorImplementor);
    }

    @Override
    public void draw() {
        System.out.println("Triangle Shape colored with " + this.colorImplementor.colorShape());
    }
}
