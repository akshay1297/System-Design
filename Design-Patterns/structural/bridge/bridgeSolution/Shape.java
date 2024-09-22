package structural.bridge.bridgeSolution;

public abstract class Shape {
    ColorImplementor colorImplementor;

    public Shape(ColorImplementor colorImplementor) {
        this.colorImplementor = colorImplementor;
    }

    // NOTE : if you define Constructor in Abstract class :
    /*
    - Subclasses are required to call the abstract class’s constructor using super(), ensuring proper initialization.
    - Abstract classes cannot be instantiated directly, so their constructors are only called from subclasses.(**)
     */

    public abstract void draw();
}
