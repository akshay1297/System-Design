package structural.bridge.bridgeSolution;



public class Client {
    public static void main(String[] args){
        ColorImplementor colorImplementor = new RedColor();
        Shape shape = new Triangle(colorImplementor);
        shape.draw(); // Triangle Shape colored with Red color

        ColorImplementor colorImplementor1 = new BlueColor();
        Shape shape1 = new Triangle(colorImplementor1);
        shape1.draw();
    }
}
