package structural.bridge.bridgeSolutionImprovement;

public class RedColor extends ColorImplementor {
    @Override
    public String colorShape() {
        System.out.println("Red color");
        return new String("Red color");
    }
}
