package structural.adapter.roundhole;

/*
Why SquarePegAdapter extends RoundPeg ??
Because Round Hole accepts only Round Peg object so it will behave as a wrapper for the RoundWhole class.
 */
public class SquarePegAdapter extends RoundPeg{
    SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        result = (Math.sqrt(Math.pow((squarePeg.getWidth() / 2), 2) * 2));
        return result;
    }
}
