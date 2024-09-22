package structural.bridge.bridgeSolutionImprovement;


public class Client {
    public static void main(String[] args){


        ColorImplementor colorImplementor = new RedColor();
        Shape shape = new Triangle();
        // without color
        shape.draw();

        // with color
        shape.setColorImplementer(colorImplementor);
        shape.draw();







    }
}
