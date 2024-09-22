package structural.bridge.bridgeSolutionImprovement;

public abstract class Shape {
    ColorImplementor colorImplementor;

    public  void setColorImplementer(ColorImplementor colorImplementor){
        this.colorImplementor = colorImplementor;
    }

    public abstract void draw();
}
