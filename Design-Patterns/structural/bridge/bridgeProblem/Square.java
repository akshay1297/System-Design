package structural.bridge.bridgeProblem;

import structural.bridge.bridgeProblem.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square shape.");
    }
}
