package structural.adapter.roundhole;

public class RoundHole {
    double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    // accepts only RoundPeg object
    boolean fits(RoundPeg peg){
        return peg.getRadius() <= this.radius;
    }
}
