package structural.bridge.bridgeSolution;


public class Square extends Shape {
    public Square(ColorImplementor colorImplementor) {
        super(colorImplementor);
    }

    @Override
    public void draw() {
        System.out.println("Square shape is colored with " + this.colorImplementor.colorShape());
    }
}
