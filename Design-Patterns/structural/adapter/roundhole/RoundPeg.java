package structural.adapter.roundhole;

public class RoundPeg {
    double radius;

    /*
     this Default constructor has a purpose : In SquarePegAdapter class, we extend this RoundPeg class ,
     so when the constructor of child class get initialized, compiler automatically tries to intialize parent object using super()
     keyword - this calls the default constructor, if not present - gives compilation error.
     */
    public RoundPeg() {
    }

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

}
