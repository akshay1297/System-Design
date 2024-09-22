package structural.bridge.bridgeProblem;

public class Client {
    public static void main(String[] args){
        Shape shape = new Triangle();
        shape.draw();
        // What if we want to introduce Color (Red and Blue) to diff shape: Red Triangle , Blue Square ....
        // Currently,  code is tightly coupled and to add the change into it - Decouple interface and its implementation
        // Use Bridge (Implementor)



    }
}
